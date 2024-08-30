package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;


public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        double imposto = produto.calcularImposto();
        System.out.println("Relatório de imposto do produto");
        System.out.println("Produto "+produto.getNome());
        System.out.println("Valor "+produto.getValor());
        System.out.println("Imposto a ser pago "+imposto);
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
