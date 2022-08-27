package model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fornecimento {

    private Calendar data;
    private double valorTotal;
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento() {
        super();
    }

    public Fornecimento(Calendar data, double valorTotal, Fornecedor fornecedor, Produto produto) {
        super();
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" + "data=" + calendarToString(data) + ", valorTotal=" + NumberFormat.getCurrencyInstance().format(valorTotal) +
                ", fornecedor=" + fornecedor + ", produto=" + produto + '}';
    }

    private static String calendarToString(Calendar data) {
        if (data != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return sdf.format(data.getTime());
        }
        return "00/00/0000 00:00";
    }
}
