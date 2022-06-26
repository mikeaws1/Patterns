package de.patterns.abstractFactory;

public enum BusModes {

    READ_ONLY(1),
    WRITE_ONLY(2),
    READ_WRITE(3);

    private final int mode;

    BusModes(int mode) {
        this.mode = mode;
    }

    public int getMode() {
        return mode;
    }

}
