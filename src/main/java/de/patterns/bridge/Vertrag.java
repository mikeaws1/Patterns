package de.patterns.bridge;

public class Vertrag extends AbstractObject {

    private String vertragsnummer;
    private Data data;


    public Vertrag(StorageProvider storageProvider) {
        super(storageProvider);
    }

    @Override
    public void speichern() {
        storageProvider.save(data);
    }

    @Override
    public void laden() {
        data = storageProvider.load(vertragsnummer);
    }
}
