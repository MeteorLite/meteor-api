public class Skins {

  public int length;
  public int[] opcodes;
  public int[][] anIntArrayArray699;
  public Skins(Buffer buffer) {
    length = buffer.readUByte();
    opcodes = new int[length];
    anIntArrayArray699 = new int[length][];
    for (int j = 0; j < length; j++) {
      opcodes[j] = buffer.readUByte();
    }

    for (int k = 0; k < length; k++) {
      int l = buffer.readUByte();
      anIntArrayArray699[k] = new int[l];
      for (int i1 = 0; i1 < l; i1++) {
        anIntArrayArray699[k][i1] = buffer.readUByte();
      }
    }
  }
}
