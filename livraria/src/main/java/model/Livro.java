package model;

public class Livro {
    private Long id;
    private String nome;
    private String autor;
    private int isbn;
    private int ano;
    private int numEdicao;
    private String genero;
    private int qtdTotal;
    private int qtdAlugado;
    private Boolean situacao;
    private Aluguel aluguel;
    private Avaliacao avaliacao;

    public Livro() {
        super();
    }

    public Livro(Long id, String nome, String autor, int isbn, int ano, int numEdicao, String genero, int qtdTotal, int qtdAlugado, Boolean situacao, Aluguel aluguel, Avaliacao avaliacao) {
        super();
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
        this.numEdicao = numEdicao;
        this.genero = genero;
        this.qtdTotal = qtdTotal;
        this.qtdAlugado = qtdAlugado;
        this.situacao = situacao;
        this.aluguel = aluguel;
        this.avaliacao = avaliacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(int qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public int getQtdAlugado() {
        return qtdAlugado;
    }

    public void setQtdAlugado(int qtdAlugado) {
        this.qtdAlugado = qtdAlugado;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "\nLivro{" + "id=" + id + ", nome='" + nome + '\'' + ", autor='" + autor + '\'' + ", isbn=" + isbn + ", ano=" + ano + ", numEdicao=" + numEdicao +
                ", genero='" + genero + '\'' + ", qtdTotal=" + qtdTotal + ", qtdAlugado=" + qtdAlugado + ", situacao=" + situacao + ", aluguel=" + aluguel + ", avaliacao=" + avaliacao + '}';
    }
}
