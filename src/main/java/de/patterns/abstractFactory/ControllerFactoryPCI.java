package de.patterns.abstractFactory;

public class ControllerFactoryPCI extends AbstractDeviceFactory {

    @Override
    public Device erzeugeBusController(Config config) {
        return new BusControllerPCI(config);
    }

    @Override
    public Device erzeugeSerialController(Config config) {
        return new SerialControllerPCI(config);
    }

    @Override
    public Device erzeugeClockController(Config config) {
        return new ClockControllerPCI(config);
    }

}
