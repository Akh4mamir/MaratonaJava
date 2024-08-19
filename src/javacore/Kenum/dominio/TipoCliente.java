package Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String NOME_RELATORIO;

    private TipoCliente(int VALOR, String NOME_RELATORIO) {
        this.VALOR = VALOR;
        this.NOME_RELATORIO = NOME_RELATORIO;
    }

}
