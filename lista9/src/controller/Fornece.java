package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Fornece {

    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor("34.876.167/0001-36", "938416374", "AgroNegocio");
        Fornecedor f2 = new Fornecedor("82.938.947/0001-73", "914893289", "Capitalia Super Mercado");

        Produto p1 = new Produto(1, "Cadeira", 10, 70.90, f1);
        Produto p2 = new Produto(2, "Milho", 14, 130.00, f2);
        Produto p3 = new Produto(3, "Sabonete", 6, 35.00, f1);

        double total = p1.getPreco() * 50;
        p1.setQuantidade(p1.getQuantidade() - 50);
        Fornecimento fr1 = new Fornecimento(new GregorianCalendar(2022, Calendar.FEBRUARY, 10, 5, 0), total, f1, p1);

        total = p2.getPreco() * 50;
        p2.setQuantidade(p1.getQuantidade() - 50);
        Fornecimento fr2 = new Fornecimento(new GregorianCalendar(2022, Calendar.JUNE, 8, 10, 0), total, f1, p2);

        total = p3.getPreco() * 20;
        p3.setQuantidade(p1.getQuantidade() - 50);
        Fornecimento fr3 = new Fornecimento(new GregorianCalendar(2022, Calendar.MAY, 2, 15, 0), total, f2, p3);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fr1);
        fornecimentos.add(fr2);
        fornecimentos.add(fr3);
        System.out.print("\n Lista de fornecimentos: ");
        System.out.println(fornecimentos);

        double totalFornecido = 0.0;
        for (Fornecimento fornecimento : fornecimentos) {
            totalFornecido += fornecimento.getValorTotal();
        }
        System.out.print("\n Total fornecido: " + NumberFormat.getCurrencyInstance().format(totalFornecido));
    }
}
