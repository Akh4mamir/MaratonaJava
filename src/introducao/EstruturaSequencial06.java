package introducao;


import java.util.Scanner;


public class EstruturaSequencial06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Raio: ");
        float raio = input.nextFloat();
        double area = 3.14*(raio*raio);
        System.out.println("A área de raio "+raio+" é: "+area+".");
        input.close();
    }    
}
