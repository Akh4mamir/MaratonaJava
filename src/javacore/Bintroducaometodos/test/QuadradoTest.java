package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Quadrado;

public class QuadradoTest {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        quadrado.setValores(3);
        quadrado.getImprimeValores();
    }
}
