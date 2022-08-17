package model;

public class Associado implements AssociadoVip{

    private String cliente;
    private double lucros;
    private int qdeCotas;
    private double valorCota;

    public Associado() {
        super();
    }

    public Associado(String cliente, double lucros, int qdeCotas, double valorCota) {
        this.cliente = cliente;
        this.lucros = lucros;
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return lucros;
    }

    @Override
    public String toString() {
        return "Associado: [Clientes= " + cliente + ", Lucros= " + lucros +
                ", Quantidade de Cotas= " + qdeCotas + ", Valor da Cota= " + valorCota + "]";
    }
}
