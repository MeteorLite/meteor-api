package packets;

public enum ServerPackets {

  PLAY_SONG(220),
  PLAY_TEMP_SONG(249);
  public final int opcode;

  ServerPackets(int opcode) {
    this.opcode = opcode;
  }

  public boolean equals(int i) {
    return opcode == i;
  }
}
