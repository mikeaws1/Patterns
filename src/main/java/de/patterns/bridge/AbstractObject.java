package de.patterns.bridge;

public abstract class AbstractObject {

    protected  final StorageProvider storageProvider;


    public AbstractObject(StorageProvider storageProvider) {
        this.storageProvider = storageProvider;

    }

    public abstract void speichern();
    public abstract void laden();

}
