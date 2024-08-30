package javacore.Gassociacao.dominio.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    private int i;


    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("--- Professor ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(this.seminarios == null){
            return;
        }
        for (Seminario seminario : seminarios) {
            i++;
            System.out.println(" ");
            System.out.println("Seminario "+i+" Título: "+seminario.getTitulo());
            System.out.println("Seminario "+i+" Local: "+seminario.getLocal().getEndereco());
            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0){
                continue;
            }
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+aluno.getNome()+" | Idade: "+aluno.getIdade());
            }
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setSeminarios(Seminario[] seminarios){
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios(){
        return this.seminarios;
    }
}
