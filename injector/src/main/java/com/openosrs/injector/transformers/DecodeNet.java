/*
 * Copyright (c) 2019, Lucas <https://github.com/Lucwousin>
 * All rights reserved.
 *
 * This code is licensed under GPL3, see the complete license in
 * the LICENSE file in the root directory of this submodule.
 *
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.openosrs.injector.transformers;

import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import meteor.Logger;
import net.runelite.asm.*;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.instructions.BiPush;
import net.runelite.asm.attributes.code.instructions.SiPush;
import net.runelite.packets.ObfuscatedBufferStructure;
import net.runelite.packets.ObfuscatedClientPacket;
import net.runelite.rs.ScriptOpcodes;
import org.gradle.internal.impldep.com.google.gson.Gson;
import org.gradle.internal.impldep.com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/*
 * Deobfuscates Client packets
 */
public class DecodeNet extends AbstractInjector {
    private static final Logger log = new Logger("Packets");
    public int totalFound = 0;
    public final int expected = 52;
    private File clientPacketsDir = new File("./build/packets/");
    private File clientPacketsFile = new File(clientPacketsDir, "ClientPackets.json");
    private HashMap<String, String> clientPackets = new HashMap<>();

    private ClassFile clientPacketClass = null;
    private Method menuActionsMethod = null;
    private Method mouseActionsMethod = null;
    private HashMap<String, Integer> opcodeMap = null;
    private HashMap<String, Integer> sizeMap = null;
    private ArrayList<ObfuscatedClientPacket> deobfuscatedPackets = new ArrayList<>();

    public DecodeNet(InjectData inject) {
        super(inject);
    }

    public void inject() {
        for (final ClassFile deobClass : inject.getDeobfuscated()) {
            if (deobClass.getName().endsWith("ClientPacket"))
                clientPacketClass = deobClass;

            scanMethods(deobClass);
        }
        if (clientPacketsFile.exists())
            clientPacketsFile.delete();

        clientPacketsDir.mkdirs();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        for (String key : clientPackets.keySet()) {
            for (Field f : clientPacketClass.getFields()) {
                try {
                    if (f.getName().contains(clientPackets.get(key).replace("ClientPacket.", ""))) {
                        net.runelite.packets.ObfuscatedClientPacket packet = new net.runelite.packets.ObfuscatedClientPacket();
                        packet.name = key;
                        String fieldName = clientPackets.get(key).replace("ClientPacket.", "");
                        packet.opcode = getOpcode(fieldName);
                        packet.size = getSize(fieldName);
                        for (String structure : getMenuActionObfuscatedMethods(menuActionsMethod.getClassFile(), clientPackets.get(key).replace("ClientPacket.", "")).split(",")) {
                            ObfuscatedBufferStructure obfuscatedBufferCall = new ObfuscatedBufferStructure();
                            obfuscatedBufferCall.method = structure.split(" ")[0];
                            obfuscatedBufferCall.paramater = structure.split(" ")[1];
                            packet.structure.add(obfuscatedBufferCall);
                        }
                        deobfuscatedPackets.add(packet);

                    }
                } catch (Exception e) {}
            }
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(clientPacketsFile));
            writer.write(gson.toJson(deobfuscatedPackets));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.warn("Deobfuscated " + deobfuscatedPackets.size() + "/" + expected + " client packets");
    }

    private String transformParamater(String packetName, String paramaterName) {
        // transform param0, param1
        switch (packetName) {
            case "OPHELD1":
            case "OPHELD2":
            case "OPHELD3":
            case "OPHELD4":
            case "OPHELD5":
                if (paramaterName.contains("param0"))
                    return "itemSlot";
                else if (paramaterName.contains("param1"))
                    return "itemWidgetId";
                break;
            case "OPHELDU":
                if (paramaterName.contains("param0"))
                    return "itemSlot";
                else if (paramaterName.contains("param1"))
                    return "itemWidgetId";
                break;
            case "OPHELDT":
                if (paramaterName.contains("param0"))
                    return "itemSlot";
                else if (paramaterName.contains("param1"))
                    return "itemWidgetId";
                break;
        }
        if (paramaterName.contains("baseX") && paramaterName.contains("param0"))
            return "worldX";
        if (paramaterName.contains("baseY") && paramaterName.contains("param1"))
            return "worldY";
        if (paramaterName.contains("KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0"))
            return "ctrlPressed";
        if (paramaterName.contains("selectedItemSlot"))
            return "selectedItemSlot";
        if (paramaterName.contains("selectedItemWidget"))
            return "selectedItemWidget";
        if (paramaterName.contains("selectedSpellWidget"))
            return "selectedSpellWidget";
        if (paramaterName.contains("selectedSpellChildIndex"))
            return "selectedSpellChildIndex";
        return paramaterName;
    }

    private void scanMethods(ClassFile deobClass) {
        for (Method deobMethod : deobClass.getMethods()) {
            try {
                HashMap<String, String> found = extractMouseScriptOpcodePackets(deobMethod);
                if (found.size() == 4)
                    mouseActionsMethod = deobMethod;
                    clientPackets.putAll(found);
            } catch (Exception ignored) {}
            try {
                HashMap<String, String> found = extractMenuActionPackets(deobMethod);
                if (found.size() == 48) {
                    menuActionsMethod = deobMethod;
                    clientPackets.putAll(found);
                }
            } catch (Exception ignored) {}
        }
    }

    private static String[] readFileAsString(String filePath)
    {
        String[] content = new String[0];

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) ).split("\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

    public int getOpcode(String fieldName) {
        if (opcodeMap == null) {
            initOpcodes();
        }
        return opcodeMap.get(fieldName);
    }

    public int getSize(String fieldName) {
        if (sizeMap == null) {
            initSizes();
        }
        return sizeMap.get(fieldName);
    }

    public void initOpcodes() {
        opcodeMap = new HashMap<>();
        ArrayList<String> linesThatMatter = new ArrayList<>();
        for (String s : readFileAsString("../osrs/src/main/java/" + clientPacketClass.getName() + ".java"))
            if (s.contains("= new ClientPacket"))
                linesThatMatter.add(s);
        for (String s : linesThatMatter)
            opcodeMap.put(s.split(" =")[0].replace(" ", "").replace("\t", ""), Integer.valueOf(s.split("\\(")[1].split(",")[0]));
    }

    public void initSizes() {
        sizeMap = new HashMap<>();
        ArrayList<String> linesThatMatter = new ArrayList<>();
        for (String s : readFileAsString("../osrs/src/main/java/" + clientPacketClass.getName() + ".java"))
            if (s.contains("= new ClientPacket"))
                linesThatMatter.add(s);
        for (String s : linesThatMatter)
            sizeMap.put(s.split(" =")[0].replace(" ", "").replace("\t", ""), Integer.valueOf(s.split(", ")[1].split("\\)")[0]));
    }

    private String getMenuActionObfuscatedMethods(ClassFile menuActionClassFile, String packetFieldName) {
        ArrayList<String> linesThatMatter = new ArrayList<>();
        boolean record = false;
        for (String s : readFileAsString("../osrs/src/main/java/" + menuActionClassFile.getName() + ".java")) {
            if (s.contains("packetWriter.addNode"))
                record = false;

            if (record) {
                linesThatMatter.add(s);
            }

            if (s.contains("getPacketBufferNode(ClientPacket." + packetFieldName + ", Client.packetWriter.isaacCipher);"))
                record = true;
        }
        StringBuilder obfPacket = new StringBuilder();
        boolean isFirst = true;
        int i = linesThatMatter.size();

        for (String s : linesThatMatter) {
            if (isFirst) {
                isFirst = false;
            } else if (i > 0){
                obfPacket.append(",");
                i--;
            } else {
                obfPacket.append(",");
            }
            String methodCallName = s.split(".write")[1].split("\\(")[0];
            String paramaterName = s.split(".write")[1].split("\\(")[1].replace(");", "");
            obfPacket.append(methodCallName).append(" ").append(
                    transformParamater(packetFieldName, paramaterName));
        }
        return obfPacket.toString();
    }

    private HashMap<String, String> extractMenuActionPackets(Method deobMethod) {
        int lastCompare = 0;
        String lastPacketField = "";
        HashMap<String, String> packetMap = new HashMap<>();
        boolean foundObj6 = false;
        for (Instruction i : deobMethod.getCode().getInstructions().getInstructions()) {
            if (i.toString().contains("label getstatic static LClientPacket;")) {
                lastPacketField = i.toString().split("ClientPacket; ")[1].split(" ")[0];
                if (!lastPacketField.equals(""))
                switch (lastCompare) {
                    case 6 -> packetMap.put("OPLOC4", lastPacketField);
                    case 7 -> packetMap.put("OPNPCU", lastPacketField);
                    case 8 -> packetMap.put("OPNPCT", lastPacketField);
                    case 9 -> packetMap.put("OPNPC1", lastPacketField);
                    case 10 -> packetMap.put("OPNPC2", lastPacketField);
                    case 11 -> packetMap.put("OPNPC3", lastPacketField);
                    case 12 -> packetMap.put("OPNPC4", lastPacketField);
                    case 13 -> packetMap.put("OPNPC5", lastPacketField);
                    case 14 -> packetMap.put("OPPLAYERU", lastPacketField);
                    case 15 -> packetMap.put("OPPLAYERT", lastPacketField);
                    case 16 -> packetMap.put("OPOBJU", lastPacketField);
                    case 17 -> packetMap.put("OPOBJT", lastPacketField);
                    case 18 -> packetMap.put("OPOBJ1", lastPacketField);
                    case 19 -> packetMap.put("OPOBJ2", lastPacketField);
                    case 20 -> packetMap.put("OPOBJ3", lastPacketField);
                    case 21 -> packetMap.put("OPOBJ4", lastPacketField);
                    case 22 -> packetMap.put("OPOBJ5", lastPacketField);
                    case 24 -> packetMap.put("BUTTON_CLICK", lastPacketField);
                    case 31 -> packetMap.put("OPHELDU", lastPacketField);
                    case 32 -> packetMap.put("OPHELDT", lastPacketField);
                    case 33 -> packetMap.put("OPHELD1", lastPacketField);
                    case 34 -> packetMap.put("OPHELD2", lastPacketField);
                    case 35 -> packetMap.put("OPHELD3", lastPacketField);
                    case 36 -> packetMap.put("OPHELD4", lastPacketField);
                    case 37 -> packetMap.put("OPHELD5", lastPacketField);
                    case 39 -> {
                        packetMap.put("IF1_BUTTON1", lastPacketField);
                        lastCompare = 1000;
                    }
                    case 40 -> packetMap.put("IF1_BUTTON2", lastPacketField);
                    case 41 -> packetMap.put("IF1_BUTTON3", lastPacketField);
                    case 42 -> packetMap.put("IF1_BUTTON4", lastPacketField);
                    case 43 -> packetMap.put("IF1_BUTTON5", lastPacketField);
                    case 44 -> packetMap.put("OPPLAYER1", lastPacketField);
                    case 45 -> packetMap.put("OPPLAYER2", lastPacketField);
                    case 46 -> packetMap.put("OPPLAYER3", lastPacketField);
                    case 47 -> packetMap.put("OPPLAYER4", lastPacketField);
                    case 48 -> packetMap.put("OPPLAYER5", lastPacketField);
                    case 49 -> packetMap.put("OPPLAYER6", lastPacketField);
                    case 50 -> packetMap.put("OPPLAYER7", lastPacketField);
                    case 51 -> packetMap.put("OPPLAYER8", lastPacketField);
                    case 52 -> packetMap.put("OPPLAYER8", lastPacketField);
                    case 58 -> packetMap.put("IF_BUTTONT", lastPacketField);
                    case 1001 -> packetMap.put("OPLOC5", lastPacketField);
                    case 1002 -> packetMap.put("OPLOC6", lastPacketField);
                    case 1003 -> packetMap.put("OPNPC6", lastPacketField);
                    case 1004 -> {
                        if (!foundObj6) {
                            packetMap.put("OPOBJ6", lastPacketField);
                            foundObj6 = true;
                        }
                    }
                    default -> lastCompare = 222222;
                }
            } else if (i instanceof BiPush) {
                if (((BiPush) i).getOperand() == 82)
                    switch (packetMap.size()) {
                        case 0 -> packetMap.put("OPLOCU", lastPacketField);
                        case 1 -> packetMap.put("OPLOCT", lastPacketField);
                        case 2 -> packetMap.put("OPLOC1", lastPacketField);
                        case 3 -> packetMap.put("OPLOC2", lastPacketField);
                        case 4 -> packetMap.put("OPLOC3", lastPacketField);
                    }
                else if (((BiPush) i).getOperand() == 6) {
                    lastCompare = 6;
                } else if (((BiPush) i).getOperand() == 7) {
                    lastCompare = 7;
                } else if (((BiPush) i).getOperand() == 8) {
                    lastCompare = 8;
                } else if (((BiPush) i).getOperand() == 9) {
                    lastCompare = 9;
                } else if (((BiPush) i).getOperand() == 10) {
                    lastCompare = 10;
                } else if (((BiPush) i).getOperand() == 11) {
                    lastCompare = 11;
                } else if (((BiPush) i).getOperand() == 12) {
                    lastCompare = 12;
                } else if (((BiPush) i).getOperand() == 13) {
                    lastCompare = 13;
                } else if (((BiPush) i).getOperand() == 14) {
                    lastCompare = 14;
                } else if (((BiPush) i).getOperand() == 15) {
                    lastCompare = 15;
                } else if (((BiPush) i).getOperand() == 16) {
                    lastCompare = 16;
                } else if (((BiPush) i).getOperand() == 17) {
                    lastCompare = 17;
                } else if (((BiPush) i).getOperand() == 18) {
                    lastCompare = 18;
                } else if (((BiPush) i).getOperand() == 19) {
                    lastCompare = 19;
                } else if (((BiPush) i).getOperand() == 20) {
                    lastCompare = 20;
                } else if (((BiPush) i).getOperand() == 21) {
                    lastCompare = 21;
                } else if (((BiPush) i).getOperand() == 22) {
                    lastCompare = 22;
                } else if (((BiPush) i).getOperand() == 23) {
                    lastCompare = 23;
                } else if (((BiPush) i).getOperand() == 24) {
                    lastCompare = 24;
                } else if (((BiPush) i).getOperand() == 25) {
                    lastCompare = 25;
                } else if (((BiPush) i).getOperand() == 31) {
                    lastCompare = 31;
                } else if (((BiPush) i).getOperand() == 32) {
                    lastCompare = 32;
                } else if (((BiPush) i).getOperand() == 33) {
                    lastCompare = 33;
                } else if (((BiPush) i).getOperand() == 34) {
                    lastCompare = 34;
                } else if (((BiPush) i).getOperand() == 35) {
                    lastCompare = 35;
                } else if (((BiPush) i).getOperand() == 36) {
                    lastCompare = 36;
                } else if (((BiPush) i).getOperand() == 37) {
                    lastCompare = 37;
                } else if (((BiPush) i).getOperand() == 39) {
                    lastCompare = 39;
                } else if (((BiPush) i).getOperand() == 40) {
                    lastCompare = 40;
                } else if (((BiPush) i).getOperand() == 41) {
                    lastCompare = 41;
                } else if (((BiPush) i).getOperand() == 42) {
                    lastCompare = 42;
                } else if (((BiPush) i).getOperand() == 43) {
                    lastCompare = 43;
                } else if (((BiPush) i).getOperand() == 44) {
                    lastCompare = 44;
                } else if (((BiPush) i).getOperand() == 45) {
                    lastCompare = 45;
                } else if (((BiPush) i).getOperand() == 46) {
                    lastCompare = 46;
                } else if (((BiPush) i).getOperand() == 47) {
                    lastCompare = 47;
                } else if (((BiPush) i).getOperand() == 48) {
                    lastCompare = 48;
                } else if (((BiPush) i).getOperand() == 49) {
                    lastCompare = 49;
                } else if (((BiPush) i).getOperand() == 50) {
                    lastCompare = 50;
                } else if (((BiPush) i).getOperand() == 51) {
                    lastCompare = 51;
                } else if (((BiPush) i).getOperand() == 52) {
                    lastCompare = 52;
                } else if (((BiPush) i).getOperand() == 58) {
                    lastCompare = 58;
                }
            } else if (i instanceof SiPush) {
                if (((SiPush) i).getOperand() == 1001) {
                    lastCompare = 1001;
                } else if (((SiPush) i).getOperand() == 1002) {
                    lastCompare = 1002;
                } else if (((SiPush) i).getOperand() == 1003) {
                    lastCompare = 1003;
                } else if (((SiPush) i).getOperand() == 1004) {
                    lastCompare = 1004;
                }
            }
        }
        return packetMap;
    }

    private HashMap<String, String> extractMouseScriptOpcodePackets(Method deobMethod) {
        int lastCompare = 0;
        HashMap<String, String> packetMap = new HashMap<>();
        for (Instruction i : deobMethod.getCode().getInstructions().getInstructions())
            if (i instanceof SiPush) {
                int i1 = ((SiPush) i).getOperand();
                if (i1 != 500)
                    lastCompare = i1;
            } else if (packetMap.size() == 4) {
                break;
            } else if (i.toString().contains("label getstatic static LClientPacket;")) {
                if (lastCompare == ScriptOpcodes.RESUME_NAMEDIALOG) {
                    packetMap.put("RESUME_P_NAMEDIALOG", i.toString().split("ClientPacket; ")[1].split(" ")[0]);
                } else if (lastCompare == ScriptOpcodes.RESUME_STRINGDIALOG) {
                    packetMap.put("RESUME_P_STRINGDIALOG", i.toString().split("ClientPacket; ")[1].split(" ")[0]);
                } else if (lastCompare == ScriptOpcodes.RESUME_OBJDIALOG) {
                    packetMap.put("RESUME_P_OBJDIALOG", i.toString().split("ClientPacket; ")[1].split(" ")[0]);
                } else if (lastCompare == ScriptOpcodes.BUG_REPORT) {
                    packetMap.put("BUG_REPORT", i.toString().split("ClientPacket; ")[1].split(" ")[0]);
                }
            }
        return packetMap;
    }

}