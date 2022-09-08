package model;

public class Avaliacao {
    private Long id;
    private int nota;
    private Boolean situacao;
    private Pessoa pessoa;
    private Livro livro;

    public Avaliacao() {
        super();
    }

    public Avaliacao(Long id, int nota, Boolean situacao, Pessoa pessoa, Livro livro) {
        super();
        this.id = id;
        this.nota = nota;
        this.situacao = situacao;
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "\nAvaliacao{" + "id=" + id + ", nota=" + nota + ", situacao=" + situacao +
                ", pessoa=" + pessoa + ", livro=" + livro + '}';
    }
}
