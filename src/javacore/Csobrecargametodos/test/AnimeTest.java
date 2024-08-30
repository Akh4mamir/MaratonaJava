package javacore.Csobrecargametodos.test;
import javacore.Csobrecargametodos.dominio.Anime;


public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Steins;Gate", "TV", 24);
        anime.init("Steins;Gate", "TV", 24, "Sci:Fi");
        anime.imprime();
    }
}
