package net.runelite.rs.api;

import net.runelite.api.BufferedNetSocket;
import net.runelite.mapping.Import;

public interface RSBufferedNetSocket extends BufferedNetSocket {
    @Import("readUnsignedByte")
    @Override
    int readUnsignedByte();
}
