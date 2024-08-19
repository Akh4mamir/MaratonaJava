package introducao;

public class Array01{
    public static void main(String[] args){
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;   

        // Opção 1
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        // Opção 2
        System.out.println("Opção 2");
        for(int i: num){
            System.out.println(i);
        }
    }
}