package de.patterns.bridge;

public class Meldung extends AbstractObject {

    private String meldungsId;

    private String vertragsnummer;


    public Meldung(StorageProvider storageProvider) {
        super(storageProvider);
    }

    @Override
    public void speichern() {
    }

    @Override
    public void laden() {

    }
}
