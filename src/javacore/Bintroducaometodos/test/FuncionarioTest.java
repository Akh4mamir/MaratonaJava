package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Josefino";
        funcionario.idade = 39;
        funcionario.salario = new float[]{2200, 1000, 5000};

        funcionario.imprimeDados();
        funcionario.media();
    }
}