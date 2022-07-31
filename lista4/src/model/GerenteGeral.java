package model;

public class GerenteGeral extends Gerente{

    public GerenteGeral() {
    }

    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.40;
    }

    @Override
    public String toString() {
        return "\nGerenteGeral [Bonus= " + getBonus() + ", Nome= " + getNome() + ", Salario= " + getSalario() + "]";
    }
}