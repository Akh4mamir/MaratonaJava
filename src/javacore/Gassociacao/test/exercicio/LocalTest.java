package Gassociacao.test.exercicio;

import Gassociacao.dominio.exercicio.Local;;

public class LocalTest {
    public static void main(String[] args) {
        Local local = new Local("Akihabara");
        System.out.println(local.getEndereco());
    }
}
