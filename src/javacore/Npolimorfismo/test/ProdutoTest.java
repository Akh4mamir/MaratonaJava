package Npolimorfismo.test;

import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.dominio.Televisao;
import Npolimorfismo.servico.CalculadoraImposto;

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
