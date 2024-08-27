package exercicios.gerenciamentoBiblioteca.dominio;

public class Usuario extends Biblioteca{
    private String nome;
    private int id;
    private Livro[] livros;
    private String[] livrosUsuario;

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
    }

    public void devolveLivro(){
        System.out.println("\n--- Devolução de Livro ---");
        livrosUsuario();
        return;
    }

    public void livrosUsuario(){
        System.out.println("\n--- Livros do Usuário ---");
        return;
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
