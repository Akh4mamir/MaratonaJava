package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;



public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("IBM-8100", 3125);
        Tomate tomate = new Tomate("Japonês", 13);
        tomate.setDataValidade("15/09/24");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(produto);
    
    }
}