package de.patterns.bridge;

public abstract class AbstractObject {

    private StorageProvider storageProvider;


    public AbstractObject(StorageProvider storageProvider) {
        this.storageProvider = storageProvider;

    }

}
