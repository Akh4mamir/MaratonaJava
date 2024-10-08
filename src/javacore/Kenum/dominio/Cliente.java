package javacore.Kenum.dominio;

    public class Cliente {
    private String nome;
    private String tipo;
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    
    
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", tipo=" + tipo + "]";
    }

    public Cliente(String nome, String tipo) {
        if(!tipo.equals(PESSOA_JURIDICA) && !tipo.equals(PESSOA_FISICA)){
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
