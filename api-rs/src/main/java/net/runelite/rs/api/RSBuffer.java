package net.runelite.rs.api;

import net.runelite.api.Buffer;
import net.runelite.mapping.Import;

import static net.runelite.rs.api.PacketFields.*;

public interface RSBuffer extends Buffer, RSNode
{
	@Import("array")
	byte[] getPayload();

	@Import("offset")
	int getOffset();

	@Import("offset")
	void setOffset(int offset);

	@Import("readUnsignedByte")
	int readUnsignedByte$rs();

	@Import("readByte")
	byte readByte$rs();

	@Import("readUnsignedShort")
	int readUnsignedShort$rs();

	@Import("readMedium")
	int readMedium$rs();

	@Import("readShort")
	int readShort$rs();

	@Import("readInt")
	int readInt$rs();

	@Import("readStringCp1252NullTerminated")
	String readStringCp1252NullTerminated$rs();

	//	@Import("writeBoolean")
	//	void writeBoolean(boolean i);
	//
	//	@Import("writeBuffer")
	//	void writeBuffer(Buffer i);
	//
	@Import(WRITEBYTE)
	void writeByte$rs(int i);
	//
	@Import(WRITEBYTEADD)
	void writeByteAdd(int i);
	//
	@Import(WRITEBYTENEG)
	void writeByteNeg(int i);
	//
	@Import(WRITEBYTESUB)
	void writeByteSub(int i);
	//
	//	@Import("writeBytes")
	//	void writeBytes(byte[] var1, int var2, int var3);
	//
	//	@Import("writeCESU8")
	//	void writeCESU8(CharSequence i);
	//
	//	@Import("writeCrc")
	//	int writeCrc(int i);
	//
	@Import(WRITEINT)
	void writeInt$rs(int i);
	//
	@Import(WRITEINTIME)
	void writeIntIME(int i);
	//
	@Import(WRITEINTLE)
	void writeIntLE(int i);
	//
	@Import(WRITEINTME)
	void writeIntME(int i);
	//
	//	@Import("writeLengthByte")
	//	void writeLengthByte(int i);
	//
	//	@Import("writeLengthInt")
	//	void writeLengthInt(int i);
	//
	//	@Import("writeLengthShort")
	//	void writeLengthShort(int i);
	//
	//	@Import("writeLong")
	//	void writeLong(long i);
	//
	//	@Import("writeLongMedium")
	//	void writeLongMedium(long i);
	//
	//	@Import("writeMedium")
	//	void writeMedium(int i);
	//
	@Import(WRITESHORT)
	void writeShort$rs(int i);
	//
	@Import(WRITESHORTADD)
	void writeShortAdd(int i);
	//
	@Import(WRITESHORTADDLE)
	void writeShortAddLE(int i);
	//
	@Import(WRITESHORTLE)
	void writeShortLE$rs(int i);
	//
	//	@Import("writeSmartByteShort")
	//	void writeSmartByteShort(int i);
	//
	@Import("writeStringCp1252NullCircumfixed")
	void writeStringCp1252NullCircumfixed$rs(String i);
	//
	@Import("writeStringCp1252NullTerminated")
	void writeStringCp1252NullTerminated$rs(String i);
	//
	//	@Import("writeVarInt")
	//	void writeVarInt(int i);
}
