package Bintroducaometodos.dominio;


public class Quadrado {
    private double lado;
    private double area;

    public void setValores(double lado){
        this.lado = lado;
        this.area = lado*lado;
    }

    public double getMostrarLado(){
        return this.lado;
    }

    public double getMostrarArea(){
        return this.area;
    }
    
    public void getImprimeValores(){
        System.out.println("Lado: "+this.lado);
        System.out.println("Area: "+this.area);
    }
}
