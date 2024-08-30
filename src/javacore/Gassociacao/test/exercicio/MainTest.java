package javacore.Gassociacao.test.exercicio;

import javacore.Gassociacao.dominio.exercicio.*;

public class MainTest {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Rintaro Okabe", 18);
        Aluno[] alunos = {aluno1};

        Local local = new Local("Akihabara");
        

        Seminario seminario1 = new Seminario("Time Travel", local, alunos);
        Seminario seminario2 = new Seminario("Neuroscience", local, alunos);

        Seminario[] seminarios = {seminario1, seminario2};

        Professor professor1 = new Professor("Makise Kurisu", "Neurociência", seminarios);

        professor1.imprime();

    }
}
