package model;

public abstract class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public abstract double getBonus();
}