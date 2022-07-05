package de.patterns.bridge;

public class Meldung extends de.patterns.bridge.AbstractObject {

    private String meldungsId;

    private String vertragsnummer;


    public Meldung(de.patterns.bridge.StorageProvider storageProvider) {
        super(storageProvider);
    }

    @Override
    public void speichern() {

    }

    @Override
    public void laden() {

    }
}
