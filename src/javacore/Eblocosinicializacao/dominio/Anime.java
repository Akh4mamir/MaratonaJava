package javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Bloco de Inicialização");
        this.episodios = new int[24];
        for(int i = 0; i < episodios.length; i++){
            this.episodios[i] = i+1;
        }
    }

    public Anime(String nome, int episodios){
        this.nome = nome;
        
    }

    public void imprime(){
        System.out.println(this.nome);
        
        for (int i : episodios) {
            System.out.print(i + " ");
        }
    }
}
