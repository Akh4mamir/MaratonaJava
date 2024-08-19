package Minterfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem das permissões...");
    }
}
