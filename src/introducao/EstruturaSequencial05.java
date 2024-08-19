package introducao;


import java.util.Scanner;


public class EstruturaSequencial05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor em metros: ");
        float metros = input.nextFloat();
        float cm = metros*100;

        System.out.println(metros+" metros é igual a "+cm+" centímetros.");
        input.close();
    }    
}
