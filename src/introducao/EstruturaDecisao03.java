package introducao;

public class EstruturaDecisao03 {
    public static void main(String[] args) {
        char turno = 'S';
        switch (turno) {
            case 'M':
                System.out.println("Turno Matutino");
                break;
            case 'V':
                System.out.println("Turno Vespertino");
                break;
            case 'N':
                System.out.println("Turno Noturno");
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }
    }
}
