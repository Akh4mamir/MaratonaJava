package javacore.Gassociacao.test.exercicio;

import javacore.Gassociacao.dominio.exercicio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Makise Kurisu", "Neurociência");
        System.out.println(professor.getEspecialidade());
    }
}
