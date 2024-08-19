package introducao;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int QtdAmigos = 3;
        String [] ArrayNomes = new String[QtdAmigos];

        for(int i = 0; i < QtdAmigos; i++){
            System.out.print("Nome "+i+": ");
            String nome = input.nextLine();
            ArrayNomes[i] = nome;
        }

        for(int i = 0; i < QtdAmigos; i++){
            System.out.println(ArrayNomes[i]);
        }

        input.close();
    }
}
