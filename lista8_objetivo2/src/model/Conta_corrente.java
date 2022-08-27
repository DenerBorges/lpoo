package model;

public class Conta_corrente extends Conta implements AssociadoVip{

    private double lucros;
    private int qdeCotas;
    private double valorCota;

    public Conta_corrente() {
        super();
    }

    public Conta_corrente(double lucros, int qdeCotas, double valorCota) {
        this.lucros = lucros;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
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
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }

    @Override
    public int getQuantidadeDeCota() {
        return qdeCotas;
    }

    @Override
    public String toString() {
        return "\nConta Corrente: [Lucros= " + lucros + ", Quantidade de Cotas= " + qdeCotas +
                ", Valor da Cota= " + valorCota + ", Saldo= " + saldo + "]";
    }
}
