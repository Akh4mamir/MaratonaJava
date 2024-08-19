package Jmodificadorfinal.test;

import Jmodificadorfinal.dominio.Carro;


public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("IRINEU");

        System.out.println(carro.COMPRADOR);
    }
}
