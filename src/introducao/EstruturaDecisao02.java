package introducao;
import java.util.Scanner;

public class EstruturaDecisao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sexo (M|F): ");
        char sexo = input.next().charAt(0);

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Sexo inválido.");
                break;
        }

        input.close();
    }
}
