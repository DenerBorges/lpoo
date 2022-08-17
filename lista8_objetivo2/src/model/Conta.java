package model;

public abstract class Conta {

    protected double saldo;

    public Conta() {
        super();
    }

    public abstract double getSaldo();

    public abstract void setSaldo(double saldo);

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        double saldoAtual = this.saldo - valor;
        if (saldoAtual > 0) {
            this.saldo -= valor;
        } else {
            System.out.println("\nNao foi possivel realizar o saque.");
        }
    }

    public void atualiza(double taxa) {
        if (taxa > 0) {
            this.saldo += this.saldo * (taxa/100);
        } else {
            System.out.println("\nA taxa deve ser maior que zero.");
        }
    }
}