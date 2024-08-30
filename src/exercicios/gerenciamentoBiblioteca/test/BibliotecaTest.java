package exercicios.gerenciamentoBiblioteca.test;

import exercicios.gerenciamentoBiblioteca.dominio.Biblioteca;
import exercicios.gerenciamentoBiblioteca.dominio.Livro;
import exercicios.gerenciamentoBiblioteca.dominio.Usuario;


public class BibliotecaTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1974736687", "Sounen Abyss Vol.1", "Ryo Minenami", "Drama", "2023");
        Livro livro2 = new Livro("8934967315", "Omniscient Reader's Viewpoint Vol.1", "Sing Shong", "Fantasia Apocalíptica", "2018");
        Livro livro3 = new Livro("6586799732", "Aku no Hana Vol.1", "Shuzo Oshimi", "Drama Psicológico", "2022");

        Livro[] livros = {livro1, livro2, livro3};

        Usuario usuario1 = new Usuario("Yonah", 0);

        usuario1.pegaLivro(livros);
        usuario1.livrosUsuario(livros);
        usuario1.devolveLivro();
        usuario1.livrosUsuario(livros);


        Biblioteca biblioteca = new Biblioteca();
        biblioteca.emprestimoLivro(livros, usuario1);
    }
}
