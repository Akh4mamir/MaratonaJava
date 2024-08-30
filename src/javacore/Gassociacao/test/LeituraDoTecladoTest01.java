package javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.print("Sexo: ");
        char sexo = input.next().charAt(0);
        System.out.println("--- Exibindo Dados ---");
        System.out.println("Nome: "+nome);
        System.out.println("idade: "+idade);
        System.out.println("Sexo: "+sexo);
        input.close();
    }
}
