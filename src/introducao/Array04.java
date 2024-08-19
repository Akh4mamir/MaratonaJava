package introducao;

public class Array04 {
    public static void main(String[] args) {
        int [][] notas = new int[2][];
        notas[0] = new int[]{10, 9, 7, 9, 8};
        notas[1] = new int[]{9, 2, 3, 7, 8};

        for(int i[]: notas){
            for(int j: i){
                System.out.println(j);
            }
        }
    }
}
