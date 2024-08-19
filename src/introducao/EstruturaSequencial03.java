package introducao;


import java.util.Scanner;

public class EstruturaSequencial03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N1: ");
        int n1 = input.nextInt();
        System.out.println("N2: ");
        int n2 = input.nextInt();
        int soma = n1+n2;
        System.out.println("A soma entre "+n1+" e "+n2+" é "+soma+".");
        input.close();
    }
}
