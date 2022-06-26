package de.patterns.abstractFactory;

public class BusControllerPCIe implements Device {

    private Config config;

    public BusControllerPCIe(Config config) {
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
