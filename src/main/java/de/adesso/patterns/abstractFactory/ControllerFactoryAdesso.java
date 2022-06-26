public class ControllerFactoryAdesso extends AbstractDeviceFactory {

    private static ControllerFactoryAdesso FACTORY = new ControllerFactoryAdesso();


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

    public static AbstractDeviceFactory getAbstractDeviceFactory() {
        return FACTORY;
    } 
    

    public static void main() {
        ControllerFactoryAdesso.getAbstractDeviceFactory().erzeugeBusController(config);
    }

}

public class ControllerFactoryAIS extends AbstractDeviceFactory {

    @Autowired
    private IPartnerAdaper adapter;

    @Override
    public Device erzeugeBusController(Config config) {
        return new BusControllerAIS(config);
    }

    @Override
    public Device erzeugeSerialController(Config config) {
        return new SerialControllerAIS(config);
    }

    @Override
    public Device erzeugeClockController(Config config) {
        return new ClockControllerAIS(config);
    }

}