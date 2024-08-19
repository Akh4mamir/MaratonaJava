package introducao;
import java.util.Scanner;

public class EstruturaDecisao01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("N1:");
        int n1 = input.nextInt();
        System.out.println("N2: ");
        int n2 = input.nextInt();
        
        System.out.println("N1: "+n1+" N2: "+n2);

        if(n1>n2){
            System.err.println("O maior valor é "+n1);
        }else if(n2>n1){
            System.out.println("O maior valor é "+n2);
        }else{
            System.out.println("Os valores inseridos são iguais.");
        }

        input.close();
    }
    
}
