package model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private Long id;
    private int cpf;
    private String nome;
    private String email;
    private String senha;
    private String status;
    private String curso;
    private Boolean situacao;
    private Aluguel aluguel;
    private List<Avaliacao> avaliacaos = new ArrayList<>();

    public Pessoa() {
        super();
    }

    public Pessoa(Long id, int cpf, String nome, String email, String senha, String status, String curso, Boolean situacao, Aluguel aluguel) {
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.status = status;
        this.curso = curso;
        this.situacao = situacao;
        this.aluguel = aluguel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public List<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(List<Avaliacao> avaliacaos) {
        this.avaliacaos = avaliacaos;
    }

    public Boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(Boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "\nPessoa{" + "id=" + id + ", cpf=" + cpf + ", nome='" + nome + '\'' + ", email='" + email + '\'' +
                ", senha='" + senha + '\'' + ", status='" + status + '\'' + ", curso='" + curso + '\'' + ", situacao=" + situacao + ", aluguel=" + aluguel + ", avaliacaos=" + avaliacaos + '}';
    }
}