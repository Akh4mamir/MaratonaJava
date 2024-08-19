package Kenum.dominio;

public enum TipoPagamento{
    DEBITO{

        @Override
        public double calcularDesconto(double valor) {
            // TODO Auto-generated method stub
            return 0;
        }
        
    }, CREDITO{

        @Override
        public double calcularDesconto(double valor) {
            // TODO Auto-generated method stub
            return 0;
        }
        
    };

    public abstract double calcularDesconto(double valor);
}
