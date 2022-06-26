package de.adesso.patterns.factory;

public class RechnungFakturierer extends Fakturierer {


    @Override
    public Dokument createDocument() {
        return new Rechnung(1.0, 1);
    }
    
}