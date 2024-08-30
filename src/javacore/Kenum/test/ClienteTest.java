package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente02;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente02 cliente1 = new Cliente02("Altaïr Ibn-la'Ahad", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente02 cliente2 = new Cliente02("Arno Dorian", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(20));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(23));
    }
}
