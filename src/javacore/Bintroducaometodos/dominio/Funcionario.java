package Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public float[] salario;

    public void imprimeDados(){
        System.out.println("------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salario == null){
            return;
        }
        for(float i : salario){
            System.out.println(i);
        }
    }

    public void media(){
        if(salario == null){
            return;
        }
        float media = (this.salario[0]+this.salario[1]+this.salario[2])/3;
        System.out.println("------------------------");
        System.out.println("Media: "+media);
    }

}