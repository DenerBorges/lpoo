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

        Pedido p1 = new Pedido(1, new GregorianCalendar(2022, Calendar.JULY, 20, 22, 30), 100.00, v1);
        Pedido p2 = new Pedido(2, new GregorianCalendar(2022, Calendar.MAY, 9, 7, 30), 70.00, v2);

        Produto prod1 = new Produto(1, "Fritadeira", 1, 100.00, f1);
        Produto prod2 = new Produto(2, "Assadeira", 1, 70.00, f2);

        Item item1 = new Item(1, 5.00, 1);
        Item item2 = new Item(2, 5.00, 1);

        if (prod1.getQuantidade() > 0 && prod2.getQuantidade() > 0) {

            System.out.println("\n Registro das vendas.");

            List<Pedido> pedidos = new ArrayList<>();
            pedidos.add(p1);
            pedidos.add(p2);
            System.out.println(pedidos);

            p1.getItems().add(item1);
            p2.getItems().add(item2);
            v1.getPedidos().add(p1);
            v2.getPedidos().add(p2);

            System.out.println("\n Estoque das Vendas.");
            prod1.setQuantidade(prod1.getQuantidade() - item1.getQuantidade());
            prod2.setQuantidade(prod2.getQuantidade() - item2.getQuantidade());

            System.out.println("\n Venda 1: ");
            System.out.println(v1.getPedidos());

            System.out.println("\n Venda 2: ");
            System.out.println(v2.getPedidos());

            Produto prod3 = new Produto(3, "Arroz", 1, 10.00, f1);
            Produto prod4 = new Produto(4, "Batata", 1, 5.00, f1);

            int qtdforn1 = 10;
            double total1 = qtdforn1 * prod3.getPreco();
            prod3.setQuantidade(prod3.getQuantidade() + qtdforn1);
            Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2022, Calendar.FEBRUARY, 10, 5, 0), total1, f1, prod3);

            int qtdforn2 = 20;
            double total2 = qtdforn2 * prod4.getPreco();
            prod4.setQuantidade(prod4.getQuantidade() + qtdforn2);
            Fornecimento fr2 = new Fornecimento(new GregorianCalendar(2022, Calendar.FEBRUARY, 10, 5, 0), total2, f1, prod4);

            List<Fornecimento> fornecimentos = new ArrayList<>();
            fornecimentos.add(fr1);
            fornecimentos.add(fr2);
            System.out.print("\n Lista de fornecimentos: \n");
            System.out.println(fornecimentos);

            double totalFornecido = 0.0;
            for (Fornecimento fornecimento : fornecimentos) {
                totalFornecido += fornecimento.getValorTotal();
            }
            System.out.print("\n Total fornecido: " + NumberFormat.getCurrencyInstance().format(totalFornecido) + "\n");

        } else comportamento();
    }

    private static void comportamento() {
        mythrowException();
    }

    private static void mythrowException(){
        try {
            System.out.println("\nErro, estoque insuficiente.\n");
            throw new EstoqueInsuficienteException();
        } catch (EstoqueInsuficienteException e) {
            e.printStackTrace();
        } finally {
            System.err.println("Finalmente executado.");
        }
    }

    static class EstoqueInsuficienteException extends Exception {
        public EstoqueInsuficienteException() {
            super("\nErro, estoque insuficiente.");
        }
    }
}
