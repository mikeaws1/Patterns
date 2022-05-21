public class Erstattung extends Dokument {

    private double rueckzahlung;

    public Erstattung(double rueckzahlung, int belegnummer) {
        super(belegnummer);
        this.rueckzahlung = rueckzahlung;
    }

    @Override
    public boolean isDokumentValide() {
        return super.getBelegnummer() > 0 && rueckzahlung > 0 && rueckzahlung < 100;
    }
    
}
