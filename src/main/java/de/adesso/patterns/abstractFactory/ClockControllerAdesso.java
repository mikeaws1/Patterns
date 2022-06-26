package de.adesso.patterns.abstractFactory;

public class ClockControllerAdesso implements Device {

    private Config config;

    public ClockControllerAdesso(Config config) {
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
