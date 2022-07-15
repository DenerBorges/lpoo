package model;

public class Conta {

    private int id;
    private double saldo;

    public Conta() {
    }

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public void deposita(double saldo) {this.saldo = saldo;}
    public void saca(double saldo) {this.saldo = saldo;}
    public void atualiza(double saldo) {this.saldo = saldo;}

    @Override
    public String toString() {
        return "\nConta{" + "id=" + id + ", saldo=" + saldo + '}';
    }
}