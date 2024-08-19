package Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Bloco de Inicialização static 1");
        episodios = new int[24];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    static{
        System.out.println("Bloco de Inicialização static 2");
    }

    {
        System.out.println("Bloco de Inicialização 3");
    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public Anime(String nome){
        this.nome = nome;
        
    }

    public Anime(){
        for (int i : episodios) {
            System.out.print(i + " ");
        }
    }

}
