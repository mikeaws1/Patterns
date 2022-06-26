package de.patterns.bridge;

import java.io.FileNotFoundException;

public interface StorageProvider {

    Data load(String ref);
    void save(Data data);
}
