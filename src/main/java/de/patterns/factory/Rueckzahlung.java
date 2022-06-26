package de.patterns.factory;

public class Rueckzahlung extends Dokument {

    private double betrag;

    public Rueckzahlung(double betrag, int belegnummer) {
        super(belegnummer);
        this.betrag = betrag;
    }


    @Override
    public boolean isDokumentValide() {
        return super.getBelegnummer() > 0 && betrag > 0 && betrag < 100;
    }


}