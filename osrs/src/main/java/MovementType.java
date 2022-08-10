public enum MovementType {
    NONE,
    WALK,
    RUN,
    TELEPORT;

    public static MovementType of(int i) {
        switch (i) {
            case 0: return NONE;
            case 1: return WALK;
            case 2: return RUN;
            case 3: return TELEPORT;
        }
        return null;
    }
}
