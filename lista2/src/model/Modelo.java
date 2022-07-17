package model;

public class Modelo {

    private int id;
    private String descricao;

    public Modelo() {
    }

    public Modelo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    @Override
    public String toString() {
        return "\nModelo{" + "id=" + id + ", descricao='" + descricao + '\'' + '}';
    }
}