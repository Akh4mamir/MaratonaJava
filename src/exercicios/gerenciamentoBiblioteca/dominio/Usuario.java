package exercicios.gerenciamentoBiblioteca.dominio;

public class Usuario extends Biblioteca{
    private String nome;
    private int id;
    private Livro[] livros;
    private String[][] livrosUsuario;

    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
        
    }

    public void adicionaLivro(Livro[] livros){
        System.out.println(livros.length);
        this.livrosUsuario = new String[livros.length][5];
        int tam=0;


        System.out.println("--- Empréstimo de Livro ---");
        listaLivro(livros);

        System.out.println("\nEscolha um título para pegar emprestado: ");
        int opcaoLivro = 2;

        if(opcaoLivro < 1){
            System.out.println("Escolha um valor que esteja de acordo com o índice!");
            return;
        }

        System.out.println("Você escolheu: "+livros[opcaoLivro-1].getTitulo());

        this.livrosUsuario[tam][0] = livros[opcaoLivro-1].getISBN();
        this.livrosUsuario[tam][1] = livros[opcaoLivro-1].getTitulo();
        this.livrosUsuario[tam][2] = livros[opcaoLivro-1].getAutor();
        this.livrosUsuario[tam][3] = livros[opcaoLivro-1].getGenero();
        this.livrosUsuario[tam][4] = livros[opcaoLivro-1].getAno_publicacao();    

        System.out.println(this.livrosUsuario[tam][1]);
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
