package introducao;


import java.util.Scanner;


public class EstruturaSequencial07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float HoraMes = input.nextFloat();
        float ValorHora = input.nextFloat();
        double total = HoraMes * ValorHora;
        System.out.println("O total é: "+total+".");
        input.close();
    }    
}
