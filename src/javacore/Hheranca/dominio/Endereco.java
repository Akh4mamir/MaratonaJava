package javacore.Hheranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public Endereco(String rua, String cep){
        this.rua = rua;
        this.cep = cep;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return this.rua;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public String getCep(){
        return this.cep;
    }
}
