package Gassociacao.test;
import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Mumu", 11);
        Jogador jogador2 = new Jogador("Enzo", 17);
        Jogador jogador3 = new Jogador("Metratron", 78);
        Time time = new Time("Girassol");

        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
    }
}
