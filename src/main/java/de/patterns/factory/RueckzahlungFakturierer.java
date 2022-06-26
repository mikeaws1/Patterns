package de.patterns.factory;

public class RueckzahlungFakturierer extends Fakturierer {


    @Override
    public Dokument createDocument() {
        return new Rueckzahlung(100, 1);
    }


}