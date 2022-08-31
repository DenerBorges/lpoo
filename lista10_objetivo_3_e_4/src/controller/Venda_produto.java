package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


public class Venda_produto {

    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor("34.986.936/0001-16", "973481267", "Super Macro");
        Fornecedor f2 = new Fornecedor("83.387.644/0001-18", "968463821", "Balcone");

        Vendedor v1 = new Vendedor(1, "Antonio", "Av. Luiz Barros", "Fragata", "96328418", "Pelotas", "RS", "129");
        Vendedor v2 = new Vendedor(2, "Camila", "Av. Duque Augusto", "Laranjal", "96387494", "Pelotas", "RS", "53");

        Pedido p1 = new Pedido(1, new GregorianCalendar(2022, Calendar.JULY, 20, 22,30), 100.00, v1);
        Pedido p2 = new Pedido(2, new GregorianCalendar(2022, Calendar.MAY, 9, 7,30), 70.00, v2);

        Produto prod1 = new Produto(1, "Fritadeira", 1, 100.00, f1);
        Produto prod2 = new Produto(2, "Assadeira", 0, 70.00, f2);

        Item item1 = new Item(1, 5.00, 1, prod1);
        Item item2 = new Item(2, 5.00, 1, prod2);

        System.out.println("\n Registro das vendas.");

        prod1.getItems().add(item1);
        prod2.getItems().add(item2);
        p1.getItems().add(item1);
        p2.getItems().add(item2);
        v1.getPedidos().add(p1);
        v2.getPedidos().add(p2);

        System.out.println("\n Estoque das Vendas.");
        prod1.setQuantidade(prod1.getQuantidade() - 1);
        prod2.setQuantidade(prod2.getQuantidade() - 1);

        System.out.println("\n Venda 1: ");
        System.out.println(v1.getPedidos());

        System.out.println("\n Venda 2: ");
        System.out.println(v2.getPedidos());

        Produto prod3 = new Produto(3, "Arroz", 1, 10.00, f1);
        Produto prod4 = new Produto(4, "Batata", 1, 5.00, f1);

        double total = prod3.getPreco() * 50;
        prod3.setQuantidade(prod3.getQuantidade() - 1);
        Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2022, Calendar.FEBRUARY, 10, 5, 0), total, f1, prod3);

        total = prod4.getPreco() * 50;
        prod4.setQuantidade(prod4.getQuantidade() - 1);
        Fornecimento fr2 = new Fornecimento(new GregorianCalendar(2022, Calendar.FEBRUARY, 10, 5, 0), total, f1, prod4);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fr1);
        fornecimentos.add(fr2);
        System.out.print("\n Lista de fornecimentos: ");
        System.out.println(fornecimentos);

        double totalFornecido = 0.0;
        for (Fornecimento fornecimento : fornecimentos) {
            totalFornecido += fornecimento.getValorTotal();
        }
        System.out.print("\n Total fornecido: " + NumberFormat.getCurrencyInstance().format(totalFornecido));

        if (prod1.getQuantidade() < 0 || prod2.getQuantidade() < 0) {
            comportamento();
        }
    }

    private static void comportamento() {
        mythrowException();
    }

    private static void mythrowException(){
        try {
            System.out.println("Erro, estoque insuficiente.");
            throw new EstoqueInsuficienteException();
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Finalmente executado.");
        }
    }

    static class EstoqueInsuficienteException extends Exception {
        public EstoqueInsuficienteException() {
            super("Erro, estoque insuficiente.");
        }
    }
}
