package javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("--- Dados ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Rua: "+this.endereco.getRua());
        System.out.println("Cep: "+this.endereco.getCep());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }
}
