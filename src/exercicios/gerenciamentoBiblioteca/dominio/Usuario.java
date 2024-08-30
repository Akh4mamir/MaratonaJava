package exercicios.gerenciamentoBiblioteca.dominio;

public class Usuario extends Biblioteca{
    private String nome;
    private int id;
    private Livro[] livros;
    private String[] livrosUsuario;
    private int index = 0;

    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
        
    }

    public void pegaLivro(Livro[] livros){
        System.out.println(livros.length);
        this.livrosUsuario = new String[livros.length];

        System.out.println("--- Empréstimo de Livro ---");
        listaLivro(livros);

        System.out.println("\nEscolha um título para pegar emprestado: ");
        int opcaoLivro = 2;

        if(opcaoLivro < 1){
            System.out.println("Escolha um valor que esteja de acordo com o índice!");
            return;
        }

        System.out.println("Você escolheu: "+livros[opcaoLivro-1].getTitulo());
        livrosUsuario[index] = livros[opcaoLivro-1].getISBN();
        index++;
        System.out.println("Solicitação completa.");
    }

    public void devolveLivro(){
        int i=0;
        System.out.println("\n--- Devolução de Livro ---");
        System.out.println("\nDigite o ISBN do livro que deseja devolver: ");
        String opcaoLivro = "8934967315";

        for (String livrousuario : livrosUsuario) {
            if(opcaoLivro.equals(livrousuario)){
                livrosUsuario[i] = null;
                System.out.println("Livro devolvido com sucesso.");
            }
            i++;
        }
        
    }

    public void livrosUsuario(Livro[] livros){
        int i=0;
        System.out.println("\n--- Livros do Usuário ---");

        for (Livro livro : livros) {
            for(String livrosusuario : livrosUsuario){
                if(livrosusuario != null && livrosusuario.equals(livro.getISBN())){
                    i++;
                    System.out.println("\n"+i+". "+livro.getTitulo());
                    System.out.println("- ISBN: "+livro.getISBN());
                    System.out.println("- Autor: "+livro.getAutor());
                    System.out.println("- Gênero: "+livro.getGenero());
                    System.out.println("- Ano de Publicação: "+livro.getAno_publicacao());
                    System.out.println("----------------------------");
                }
            }
        }  
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

}