package Aintroducaoclasses.test;

import Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Impala";
        carro1.modelo = "Impala GM - Chevrolet";
        carro1.ano = 1967;

        carro2.nome = "Fiat Uno";
        carro2.modelo = "Fiat Uno 2010";
        carro2.ano = 2010;

        System.out.println("Carro 1 | "+"Nome: "+carro1.nome+" Modelo: "+carro1.modelo+" Ano: "+carro1.ano);
        System.out.println("Carro 2 | "+"Nome: "+carro2.nome+" Modelo: "+carro2.modelo+" Ano: "+carro2.ano);

        
    }
    
}
