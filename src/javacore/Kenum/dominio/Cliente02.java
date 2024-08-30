package javacore.Kenum.dominio;

    public class Cliente02 {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipopagamento;

    public Cliente02(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipopagamento = tipoPagamento;
    }

   
    @Override
    public String toString() {
        return "Cliente02 [nome=" + nome + ", tipoCliente=" + tipoCliente + ", tipopagamento=" + tipopagamento + "]";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipopagamento() {
        return tipopagamento;
    }

    public void setTipopagamento(TipoPagamento tipopagamento) {
        this.tipopagamento = tipopagamento;
    }   

    
    
}
