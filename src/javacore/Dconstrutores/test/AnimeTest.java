package javacore.Dconstrutores.test;
import javacore.Dconstrutores.dominio.Anime;


public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Steins;Gate", "TV", 24, "Sci:Fi");
        anime.imprime();
    }
}