public class Rechnung extends Dokument {

    private final double betrag;

    public Rechnung(double betrag, int belegnummer) {
        super(belegnummer);
        this.betrag = betrag;
    }

    public boolean isDokumentValide() {
        return super.getBelegnummer() > 0 && betrag > 0;
    }

}
