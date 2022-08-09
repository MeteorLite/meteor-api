public class VarBit {

    public static void method440(Archive archive) {
	Buffer buffer = new Buffer(archive.extract("varbit.dat"));
	length = buffer.readUShort();
	if (varbits == null) {
	    varbits = new VarBit[length];
	}
	for (int i = 0; i < length; i++) {
	    if (varbits[i] == null) {
		varbits[i] = new VarBit();
	    }
	    varbits[i].readValues(buffer, i);
	    if (varbits[i].aBoolean829) {
		Varp.aClass43Array704[varbits[i].anInt826].aBoolean716 = true;
	    }
	}

	if (buffer.offset != buffer.payload.length) {
	    System.out.println("varbit load mismatch");
	}
    }

    public void readValues(Buffer buffer, int index) {
	do {
	    int opcode = buffer.readUByte();
	    if (opcode == 0) {
		return;
	    }
	    if (opcode == 1) {
		anInt826 = buffer.readUShort();
		anInt827 = buffer.readUByte();
		anInt828 = buffer.readUByte();
	    } else if (opcode == 10) {
		aString825 = buffer.readJString();
	    } else if (opcode == 2) {
		aBoolean829 = true;
	    } else if (opcode == 3) {
		anInt830 = buffer.readInt();
	    } else if (opcode == 4) {
		anInt831 = buffer.readInt();
	    } else if (opcode == 5) {
		aBoolean832 = false;
	    } else {
		System.out.println("Error unrecognised config code: " + opcode);
	    }
	} while (true);
    }

    public VarBit() {
	aBoolean829 = false;
	anInt830 = -1;
	aBoolean832 = true;
    }

    public int anInt822;
    public static int length;
    public static VarBit varbits[];
    public String aString825;
    public int anInt826;
    public int anInt827;
    public int anInt828;
    public boolean aBoolean829;
    public int anInt830;
    public int anInt831;
    public boolean aBoolean832;

}