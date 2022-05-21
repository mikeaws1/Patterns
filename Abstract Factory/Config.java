public class Config {

    private int address;

    private BusModes mode;

    public Config(int address, BusModes mode) {
        this.address = address;
        this.mode = mode;
    }
    
    public int getAddress() {
        return this.address;
    }

    public BusModes getMode() {
        return mode;
    }

    public void setMode(BusModes mode) {
        this.mode = mode;
    }

    
}
