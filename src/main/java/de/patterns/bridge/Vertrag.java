package de.patterns.bridge;

public class Vertrag extends AbstractObject {

    private String vertragsnummer;


    public Vertrag(StorageProvider storageProvider) {
        super(storageProvider);
    }

    @Override
    public void speichern() {

    }

    @Override
    public void laden() {

    }
}
