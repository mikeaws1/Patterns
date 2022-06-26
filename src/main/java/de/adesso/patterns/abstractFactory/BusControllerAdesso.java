package de.adesso.patterns.abstractFactory;

public class BusControllerAdesso implements Device {

    private Config config;

    public BusControllerAdesso(Config config) {
        this.config = config;
    }

    @Override
    public byte[] readData() {
        return null;
    }

    @Override
    public void setConfig(Config config) {
        this.config = config;
    }

    @Override
    public void writeData(byte[] data) {
        
    }
}
