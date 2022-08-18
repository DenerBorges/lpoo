package model;

public class Conta_poupanca extends Conta{

    public Conta_poupanca() {
        super();
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor);
    }

    @Override
    public void saca(double valor) {
        super.saca(valor);
    }

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa);
    }

    @Override
    public String toString() {
        return "\nConta Poupanca: [Saldo= " + saldo + "]";
    }
}
