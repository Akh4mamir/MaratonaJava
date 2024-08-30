package javacore.Gassociacao.test.exercicio;

import javacore.Gassociacao.dominio.exercicio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rintaro Okabe", 18);
        System.out.println(aluno.getNome());
    }    
}
