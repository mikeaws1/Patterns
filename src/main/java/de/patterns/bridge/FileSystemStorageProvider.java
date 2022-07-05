package de.patterns.bridge;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSystemStorageProvider implements StorageProvider {

    private final String directory;

    public FileSystemStorageProvider(String directory) {
        this.directory = directory;
    }


    @Override
    public Data load(String ref) {
        Data data = new Data();
        String path = directory + "/" + ref;

        try (FileInputStream inputStream = new FileInputStream(path)){
            //... Daten laden
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }


        return data;
    }

    @Override
    public void save(Data data) {

        String path = directory + "/" + data.getRef();

        try (FileOutputStream outputStream = new FileOutputStream(path)){
            //... Daten speichern
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
