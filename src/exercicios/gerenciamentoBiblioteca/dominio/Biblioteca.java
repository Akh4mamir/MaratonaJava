package exercicios.gerenciamentoBiblioteca.dominio;

public class Biblioteca{
    private Livro[] livros;
    private Usuario usuario;

    public void listaLivro(Livro[] livros){
        System.out.println("Livros disponíveis:");
        int i=0;

        for (Livro livro : livros) {
            i++;
            System.out.println("\n"+i+". "+livro.getTitulo());
            System.out.println("- ISBN: "+livro.getISBN());
            System.out.println("- Autor: "+livro.getAutor());
            System.out.println("- Gênero: "+livro.getGenero());
            System.out.println("- Ano de Publicação: "+livro.getAno_publicacao());
            System.out.println("----------------------------");
        }
    }

    public void emprestimoLivro(Livro[] livros, Usuario usuario){
        int i = 0;
        System.out.println("\n--- Empréstimo de Livro ---");
        String nome_teste = "Yonah";
        if(usuario.getNome().equals(nome_teste)){
            System.out.println("Informações de "+usuario.getNome());
            System.out.println("ID: "+usuario.getId());

            System.out.println("\n--- Livros Disponíveis Para Empréstimo ---");
            if(livros == null){
                return;
            }
            for (Livro livro : livros) {
                i++;
                System.out.println(i+". "+livro.getTitulo());
            }
        }
    }

    public void devolveLivro(){
        return;
    }
}
