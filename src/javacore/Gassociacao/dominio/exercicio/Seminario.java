package Gassociacao.dominio.exercicio;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno[] alunos;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos){
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setLocal(Local local){
        this.local = local;
    }

    public Local getLocal(){
        return this.local;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }

    public Aluno[] getAlunos(){
        return this.alunos;
    }
}
