package javacore.Fmodificadorestatico.test;
import javacore.Fmodificadorestatico.dominio.Carro;


public class CarroTest {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 270);
        Carro carro2 = new Carro("Mercedes", 260);


        Carro.setVelocidadeLimite(300);
        carro1.imprime();
        carro2.imprime();
    }
}