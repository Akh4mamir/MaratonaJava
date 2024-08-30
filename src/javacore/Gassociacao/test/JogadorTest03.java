package javacore.Gassociacao.test;
import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;


public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Mumu", 11);
        Jogador jogador2 = new Jogador("Metratron", 78);
        Time time = new Time("Girassol");

        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogadores ---");
        jogador1.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
