public class ControllerFactory extends AbstractDeviceFactory {

    @Override
    public Device erzeugeBusController(Config config) {
        return new BusController(config);
    }

    @Override
    public Device erzeugeSerialController(Config config) {
        return new SerialController(config);
    }



    
}