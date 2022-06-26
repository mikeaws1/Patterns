package de.patterns.abstractFactory;

public interface Device {


    byte[] readData();

    void writeData(byte[] data);

    void setConfig(Config config);

}
