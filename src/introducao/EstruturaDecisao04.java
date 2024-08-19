package introducao;

import java.util.Scanner;

public class EstruturaDecisao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor do salário base: ");
        float SalarioBase = input.nextFloat();
        float Porcentagem;
        float Reajuste;
        float SalarioAtual;

        if(SalarioBase <= 280){
            Porcentagem = 20;
        }else if(SalarioBase > 280 && SalarioBase <= 700){
            Porcentagem = 15;
        }else if(SalarioBase > 700 && SalarioBase <= 1500){
            Porcentagem = 10;
        }else{
            Porcentagem = 5;
        }

        Reajuste = SalarioBase*(Porcentagem/100);
        SalarioAtual = SalarioBase+Reajuste;

        System.out.println("Salário antes do reajuste: R$"+SalarioBase);
        System.out.println("Percentual do aumento: "+Porcentagem+"%");
        System.out.println("Valor do aumento: R$"+Reajuste);
        System.out.println("Salário atual: R$"+SalarioAtual);

        input.close();
    }    
}
