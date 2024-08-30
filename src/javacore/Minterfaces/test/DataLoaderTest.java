package javacore.Minterfaces.test;

import javacore.Minterfaces.dominio.DataBaseLoader;
import javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        fileLoader.checkPermission();
    }

}
