public class SerialControllerAdesso implements Device {

    private Config config;
    
    private byte[] buffer;

    public SerialController(Config config) {
        this.config = config;
    }

    @Override
    public byte[] readData() {
        return buffer;
    }

    @Override
    public void setConfig(Config config) {
        this.config = config;
    }

    @Override
    public void writeData(byte[] data) {
        
    }
    
    
}
