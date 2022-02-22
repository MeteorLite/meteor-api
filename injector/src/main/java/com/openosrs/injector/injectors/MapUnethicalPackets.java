package com.openosrs.injector.injectors;

import com.openosrs.injector.injection.InjectData;
import net.runelite.asm.*;
import net.runelite.deob.DeobAnnotations;

import java.io.File;

import static net.runelite.deob.util.JarUtil.load;

public class MapUnethicalPackets extends AbstractInjector {

    ClassGroup unethicalRsc;
    public MapUnethicalPackets(InjectData inject) {
        super(inject);
    }

    public void inject() {
        unethicalRsc = load(new File("./lib/unethical-rsc-203.jar"));

        for (final ClassFile deobClass : inject.getVanilla()) {
            if ((deobClass.getName().equals("osrs/ClientPacket")) ||
                (deobClass.getName().equals("osrs/ServerPacket")) ||
                (deobClass.getName().equals("osrs/Buffer")))
                    mapClass(deobClass);
        }
    }

    private void mapClass(ClassFile c) {
        Annotation impl = c.getAnnotations().get(DeobAnnotations.IMPLEMENTS);
        if (impl != null)
        for (ClassFile cf : unethicalRsc.getClasses()) {
            Annotation unethicalImpl = cf.getAnnotations().get(DeobAnnotations.IMPLEMENTS);
            if (unethicalImpl != null) {
                if (impl.getValueString().equals(unethicalImpl.getValueString())) {
                    for (Field f : c.getFields())
                        mapUnethicalBufferField(cf, f);
                    for (Method m : c.getMethods())
                        mapUnethicalBufferMethod(cf, m);
                }
            }
        }
    }

    private void mapUnethicalBufferField(ClassFile unethicalClass, Field field) {
        Annotation obfName = field.getAnnotations().get(DeobAnnotations.OBFUSCATED_NAME);

        for (Field unethicalField: unethicalClass.getFields()) {
            Annotation unethicalObfName = unethicalField.getAnnotations().get(DeobAnnotations.OBFUSCATED_NAME);

            if (unethicalObfName != null && obfName != null)
            {

                if (unethicalObfName.getValueString().equals(obfName.getValueString()))
                {
                    field.getAnnotations().clear();
                    for (Annotation a : unethicalField.getAnnotations().values())
                    {
                        field.addAnnotation(a);
                    }
                }
            }
        }
    }

    private void mapUnethicalBufferMethod (ClassFile classFile, Method method) {
        for (Method unethicalMethod: classFile.getMethods()) {
            Annotation unethicalObfName = unethicalMethod.getAnnotations().get(DeobAnnotations.OBFUSCATED_NAME);
            Annotation obfName = method.getAnnotations().get(DeobAnnotations.OBFUSCATED_NAME);
            if (unethicalObfName != null && obfName != null)
            {
                if (unethicalObfName.getValueString().equals(obfName.getValueString()))
                {
                    method.getAnnotations().clear();
                    for (Annotation a : unethicalMethod.getAnnotations().values())
                    {
                        method.addAnnotation(a);
                    }
                }
            }
        }
    }
}
