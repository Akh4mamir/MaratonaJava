package exercicios.gerenciamentoBiblioteca.dominio;

public class Biblioteca{
    private Livro[] livros;
    private Usuario usuario;

    public void listaLivro(Livro[] livros){
        System.out.println("Livros disponíveis:");

        for (Livro livro : livros) {
            int i=0;
            i++;
            System.out.println(i+". "+livro.getTitulo());
            System.out.println(i+". "+livro.getISBN());
            System.out.println(i+". "+livro.getAutor());
            System.out.println(i+". "+livro.getGenero());
            System.out.println(i+". "+livro.getAno_publicacao());

        }
    }

    public void emprestimoLivro(Livro[] livros, Usuario usuario){
        System.out.println("--- Empréstimo de Livro ---");
        String nome_teste = "Yonah";
        if(usuario.getNome().equals(nome_teste)){
            System.out.println("Informações de "+usuario.getNome());
            System.out.println("ID: "+usuario.getId());

            System.out.println("--- Livros Disponíveis Para Empréstimo---");
            if(livros == null){
                return;
            }
            for (Livro livro : livros) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    public void devolveLivro(){
        return;
    }
}
