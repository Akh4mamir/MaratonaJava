package introducao;

public class EstruturasCondicionais {
    public static void main(String[] args){
        double SalarioAnual = 70000;
        double ValorImposto;

        if(SalarioAnual <= 34712){
            ValorImposto = SalarioAnual*(9.70/100);
        }else if(SalarioAnual <= 68507){
            ValorImposto = SalarioAnual*(37.35/100);
        }else{
            ValorImposto = SalarioAnual*(49.50/100);
        }

        System.out.println(ValorImposto);
        
    }
}
