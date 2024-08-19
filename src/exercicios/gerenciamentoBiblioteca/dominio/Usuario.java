package exercicios.gerenciamentoBiblioteca.dominio;

public class Usuario {
    private String nome;
    private int id;
    private Livro[] livros;
    private String[] livrosUsuario;

    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public void adicionaLivro(Livro[] livros){
        this.livrosUsuario = new String[livros.length];
        int i=0;


        System.out.println("--- Empréstimo de Livro ---");
        System.out.println("Livros disponíveis:");


        for (Livro livro : livros) {
            i++;
            System.out.println(i+". "+livro.getTitulo());
        }

        System.out.println("\nEscolha um título para pegar emprestado: ");
        int opcaoLivro = 2;

        if(opcaoLivro < 1){
            System.out.println("Escolha um valor que esteja de acordo com o índice!");
            return;
        }

        System.out.println("Você escolheu: "+livros[opcaoLivro-1].getTitulo());
        this.livrosUsuario[opcaoLivro-1] = livros[opcaoLivro-1].getTitulo();
    }

    public void removeLivro(){
        // índice a ser removido recebe valor nulo
        // valores posteriores ao nulo vão se reorganizar para o local do índice anterior (nulo)
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
