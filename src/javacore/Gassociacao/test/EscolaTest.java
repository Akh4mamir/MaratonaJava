package javacore.Gassociacao.test;
import javacore.Gassociacao.dominio.*;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Guanabara");
        Professor professor2 = new Professor("Gustavo");

        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("CursoEmVideo", professores);

        escola.imprime();

    }
}
