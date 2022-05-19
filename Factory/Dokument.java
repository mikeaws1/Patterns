public abstract class Dokument {

    private final int belegnummer;

    public Dokument(int belegnummer) {
        this.belegnummer = belegnummer;
    }

    public int getBelegnummer() {
        return this.belegnummer;
    }

    public abstract boolean isDokumentValide();
    
}
