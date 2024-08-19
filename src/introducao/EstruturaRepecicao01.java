package introducao;

import java.util.Scanner;

public class EstruturaRepecicao01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = -1;
        
        while(nota < 0 || nota > 10){
            System.out.println("Nota (ENTRE 0 E 10:)");
            nota = input.nextInt();
        }

        input.close();
    }
}
