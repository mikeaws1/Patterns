package de.patterns.bridge;

import java.net.URL;

public class DatabaseStorageProvider implements StorageProvider {
    private final URL dataBase;

    public DatabaseStorageProvider(URL dataBase) {
        this.dataBase = dataBase;
    }



    @Override
    public Data load(String ref) {

        Data data = new Data();
        return data;
    }

    @Override
    public void save(Data data) {

    }
}
