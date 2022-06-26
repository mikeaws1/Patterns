package de.patterns.abstractFactory;

public class ControllerFactoryPCIe extends AbstractDeviceFactory {

    private static ControllerFactoryPCIe FACTORY = new ControllerFactoryPCIe();


    @Override
    public Device erzeugeBusController(Config config) {
        return new BusControllerPCIe(config);
    }

    @Override
    public Device erzeugeSerialController(Config config) {
        return new SerialControllerPCIe(config);
    }

    @Override
    public Device erzeugeClockController(Config config) {
        return new ClockControllerPCIe(config);
    }

    public static AbstractDeviceFactory getAbstractDeviceFactory() {
        return FACTORY;
    }


    public static void main() {
        Config config = new Config(23, BusModes.READ_ONLY);
        ControllerFactoryPCIe.getAbstractDeviceFactory().erzeugeBusController(config);
    }

}