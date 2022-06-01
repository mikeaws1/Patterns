public class ControllerFactory extends AbstractDeviceFactory {


    private static ControllerFactory factory = new ControllerFactory();

    @Override
    public Device erzeugeBusController(Config config) {
        return new BusController(config);
    }

    @Override
    public Device erzeugeSerialController(Config config) {
        return new SerialController(config);
    }

    @Override
    public Device erzeugeClockController(Config config) {
        return new ClockController(config);
    }

    public static AbstractDeviceFactory getFactory() {
        return factory;
    }
    
}
