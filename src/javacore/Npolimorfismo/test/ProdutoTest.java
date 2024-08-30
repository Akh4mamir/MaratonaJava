package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("IBM 8100", 3250);
        Tomate tomate = new Tomate("Tomate Vermelho", 5.25);
        Televisao tv = new Televisao("Samsung", 5025);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------");        
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");        
        CalculadoraImposto.calcularImposto(tv);

    }
    
}
