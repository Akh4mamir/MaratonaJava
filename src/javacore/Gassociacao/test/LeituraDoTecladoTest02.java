package Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numBicho = 05;
        String nomeBicho = "Cachorro";

        System.out.print("Palpite: ");
        int numBichoInput = input.nextInt();

        if(numBichoInput == numBicho){
            System.out.println("Você Acertou.");
            System.out.println("O número do dia é "+ numBicho+", do bicho: "+nomeBicho+".");
        } else{
            System.out.println("Você errou :(");
            System.out.println("O número do dia é "+ numBicho+", do bicho: "+nomeBicho+".");
        }

        input.close();
    }
}
