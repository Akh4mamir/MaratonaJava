package javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private int idade;
    private Time time;

     public Jogador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
     }

     public void imprime(){
        System.out.println(this.nome);
        if(this.time != null){
            System.out.println(time.getNome());
        }
     }

     public String getNome(){
        return this.nome;
     }

     public void setNome(String nome){
        this.nome = nome;
     }

     public int getIdade(){
        return this.idade;
     }

     public void setIdade(int idade){
        this.idade = idade;
     }

     public void setTime(Time time){
        this.time = time;
     }
     
     public Time getTime(){
        return this.time;
     }
}
