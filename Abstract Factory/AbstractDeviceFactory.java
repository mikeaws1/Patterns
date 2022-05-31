public abstract class AbstractDeviceFactory {

    public abstract Device erzeugeSerialController(Config config);

    public abstract Device erzeugeBusController(Config config);

}