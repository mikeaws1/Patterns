public class ControllerFactoryAdesso extends AbstractDeviceFactory {

    @Override
    public Device erzeugeBusController(Config config) {
        return new BusControllerAdesso(config);
    }

    @Override
    public Device erzeugeSerialController(Config config) {
        return new SerialControllerAdesso(config);
    }

    @Override
    public Device erzeugeClockController(Config config) {
        return new ClockControllerAdesso(config);
    }
    
}
