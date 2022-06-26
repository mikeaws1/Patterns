package de.patterns.abstractFactory;

public class ClockControllerPCIe implements Device {

    private Config config;

    public ClockControllerPCIe(Config config) {
        this.config = config;
    }


    @Override
    public byte[] readData() {
        Long value = System.nanoTime();
        return new byte[]{value.byteValue()};
    }

    @Override
    public void setConfig(Config config) {
        this.config = config;
    }

    @Override
    public void writeData(byte[] data) {

    }
}
