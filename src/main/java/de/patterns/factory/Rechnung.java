package de.patterns.factory;

public class Rechnung extends Dokument {

    private final double betrag;

    protected Rechnung(double betrag, int belegnummer)  {
        super(belegnummer);
        this.betrag = betrag;
    }

    @Override
    public boolean isDokumentValide() {
        return super.getBelegnummer() > 0 && betrag > 0;
    }

}
