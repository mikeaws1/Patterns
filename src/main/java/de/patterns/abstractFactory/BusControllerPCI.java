package de.patterns.abstractFactory;

public class BusControllerPCI implements Device {

    public BusControllerPCI(Config config) {
    }

    @Override
    public byte[] readData() {
        return new byte[0];
    }

    @Override
    public void writeData(byte[] data) {

    }

    @Override
    public void setConfig(Config config) {

    }
}
