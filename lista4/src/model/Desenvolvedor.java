package model;

public abstract class Desenvolvedor extends Funcionario {

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public abstract double getBonus();
}
