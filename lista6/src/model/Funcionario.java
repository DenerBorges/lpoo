package model;

public abstract class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, double salario) {
        super();
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}

    public abstract double getBonus();
}