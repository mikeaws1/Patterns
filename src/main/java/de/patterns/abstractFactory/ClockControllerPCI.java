package de.patterns.abstractFactory;

public class ClockControllerPCI implements Device {

    public ClockControllerPCI(Config config) {}

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
