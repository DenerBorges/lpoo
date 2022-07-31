package model;

public class DesenvolvedorJunior extends Desenvolvedor{

    public DesenvolvedorJunior() {
    }

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedorJunior [Bonus= " + getBonus() + ", Nome= " + getNome() + ", Salario= " + getSalario() + "]";
    }
}