package introducao;

public class Array02 {
    public static void main(String[] args) {

        int[][] num = new int[3][];
        num[0] = new int[2];
        num[1] = new int[]{1, 2, 3, 4, 5};
        num[2] = new int[]{1, 2, 3};

        // Opção 1
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j<num[i].length; j++){
                System.out.println(num[i][j]);
            }
        }

        // Opção 2
        for(int i[]: num){
            for(int j: i){
                System.out.println(j);
            }
        }

    }
}
