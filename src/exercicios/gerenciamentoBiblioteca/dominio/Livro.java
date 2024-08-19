package exercicios.gerenciamentoBiblioteca.dominio;

public class Livro{
    private String ISBN;
    private String titulo;
    private String autor;
    private String genero;
    private String ano_publicacao;
    private Usuario usuario;

    public Livro(String ISBN, String titulo, String autor, String genero, String ano_publicacao){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano_publicacao = ano_publicacao;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(String ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}