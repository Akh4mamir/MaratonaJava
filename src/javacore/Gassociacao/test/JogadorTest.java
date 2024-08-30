package javacore.Gassociacao.test;
import javacore.Gassociacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Biribinho", 11);
        Jogador jogador2 = new Jogador("Enzo", 17);
        Jogador jogador3 = new Jogador("Metratron", 78);

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome()+" "+jogador.getIdade());
        }

    }
}
