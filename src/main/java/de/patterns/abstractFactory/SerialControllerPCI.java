package de.patterns.abstractFactory;

public class SerialControllerPCI implements Device {

    public SerialControllerPCI(Config config) {
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
