package Minterfaces.test;

import Minterfaces.dominio.DataBaseLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader databaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        fileLoader.checkPermission();
    }

}
