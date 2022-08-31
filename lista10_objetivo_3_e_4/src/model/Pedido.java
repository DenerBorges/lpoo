package model;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pedido {

    private int numero;
    private Calendar data;
    private double valor;
    private Vendedor vendedor;
    private List<Item> items = new ArrayList<>();

    public Pedido() {
        super();
    }

    public Pedido(int numero, Calendar data, double valor, Vendedor vendedor) {
        super();
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "\nPedido{" + "numero=" + numero + ", data=" +  calendarToString(data) +
                ", valor=" + NumberFormat.getCurrencyInstance().format(valor) + ", vendedor=" + vendedor + ", items=" + items + '}';
    }

    private static String calendarToString(Calendar data) {
        if (data != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            return sdf.format(data.getTime());
        }
        return "00/00/0000 00:00";
    }
}
