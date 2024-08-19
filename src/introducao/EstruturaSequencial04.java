package introducao;


import java.util.Scanner;


public class EstruturaSequencial04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N1: ");
        int n1 = input.nextInt();
        System.out.println("N2: ");
        int n2 = input.nextInt();
        System.out.println("N3: ");
        int n3 = input.nextInt();
        System.out.println("N4: ");
        int n4 = input.nextInt();      
        
        int media = (n1+n2+n3+n4)/4;

        System.out.println("A média é: "+media);
        input.close();
    }
}
