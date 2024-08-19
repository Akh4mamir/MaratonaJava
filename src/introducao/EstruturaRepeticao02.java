package introducao;
import java.util.Scanner;

public class EstruturaRepeticao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario = " ";
        String senha = " ";

        while(usuario.equals(senha)){
            System.out.println("Usuário: ");
            usuario = input.nextLine();
            System.out.println("Senha (NÃO DEVE SER IGUAL AO USUÁRIO): ");
            senha = input.nextLine();
        }
        
        input.close();

    }
}
