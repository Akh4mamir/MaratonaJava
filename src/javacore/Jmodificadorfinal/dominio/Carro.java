package javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE; 
    public final Comprador COMPRADOR = new Comprador();

    static {
        VELOCIDADE_LIMITE=250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
