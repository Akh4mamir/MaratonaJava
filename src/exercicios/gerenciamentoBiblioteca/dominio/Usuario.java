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

    public void pegaLivro(Livro[] livros){
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

        System.out.println("\nVocê escolheu: "+livros[opcaoLivro-1].getTitulo());

        this.livrosUsuario[tam][0] = livros[opcaoLivro-1].getISBN();
        this.livrosUsuario[tam][1] = livros[opcaoLivro-1].getTitulo();
        this.livrosUsuario[tam][2] = livros[opcaoLivro-1].getAutor();
        this.livrosUsuario[tam][3] = livros[opcaoLivro-1].getGenero();
        this.livrosUsuario[tam][4] = livros[opcaoLivro-1].getAno_publicacao();    
        
        System.out.println("- ISBN: "+this.livrosUsuario[tam][0]);
        System.out.println("- Autor : "+this.livrosUsuario[tam][2]);
        System.out.println("- Gênero : "+this.livrosUsuario[tam][3]);
        System.out.println("- Ano de Publicação : "+this.livrosUsuario[tam][4]);
    }

    public void devolveLivro(){
        System.out.println("\n--- Devolução de Livro ---");
        livrosUsuario();
        return;
    }

    public void livrosUsuario(){
        System.out.println("\n--- Livros do Usuário ---");

        int k = 0;

        for(int i=0; i < livrosUsuario.length; i++ ){
            for(int j=0; j<livrosUsuario[i].length; j++){
                if(livrosUsuario[i][j] != null){
                    switch (k) {
                        case 0:
                            System.out.print("ISBN: ");
                            break;
                        case 1:
                            System.out.print("Tìtulo: ");
                            break;
                        case 2:
                            System.out.print("Autor: ");
                            break;
                        case 3:
                            System.out.print("Gênero: ");
                            break;
                        case 4:
                            System.out.print("Ano de Publicação: ");
                            break;
                        default:
                            break;
                    }
                    System.out.println(livrosUsuario[i][j]);
                    k++;

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
