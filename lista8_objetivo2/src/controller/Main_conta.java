package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main_conta {

    public static void main(String[] args) {

        Conta_poupanca cp1 = new Conta_poupanca();
        Conta_poupanca cp2 = new Conta_poupanca();
        Conta_poupanca cp3 = new Conta_poupanca();
        System.out.print("\n Lista de Contas Poupanca: ");
        System.out.print(cp1 + "" + cp2 + "" + cp3);

        Conta_corrente cc1 = new Conta_corrente(5000.00, 100, 100.00);
        Conta_corrente cc2 = new Conta_corrente(5000.00, 400, 200.00);
        Conta_corrente cc3 = new Conta_corrente(5000.00, 600, 600.00);
        System.out.print("\n Lista de Contas Corrente: ");
        System.out.print(cc1 + "" + cc2 + "" + cc3);

        Associado asc1 = new Associado("Eduardo", 4000.00, 300, 300.00);
        Associado asc2 = new Associado("Maria", 4000.00, 600, 500.00);
        Associado asc3 = new Associado("Julio", 4000.00, 600, 700.00);
        System.out.print("\n Lista de Associados: ");
        System.out.print(asc1 + "" + asc2 + "" + asc3);

        List<Conta> contas = new ArrayList<>();
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        System.out.print("\n Lista de Contas: " + contas);

        List<AssociadoVip> associadosVips = new ArrayList<>();
        associadosVips.add(cc1);
        associadosVips.add(cc2);
        associadosVips.add(cc3);
        associadosVips.add(asc1);
        associadosVips.add(asc2);
        associadosVips.add(asc3);
        System.out.println("\n Associados Vip: " + associadosVips);

        List<Associado> associados = new ArrayList<>();
        associados.add(asc1);
        associados.add(asc2);
        associados.add(asc3);
        System.out.println("\n Lista de Associados: " + associados);

        cp1.deposita(1000.00);
        cp1.atualiza(5);
        cp1.saca(50.00);
        System.out.println("\n Conta Poupanca 1: " + cp1);

        cc1.deposita(500.00);
        cc1.saca(400.00);
        System.out.println("\n Conta Corrente 1: " + cc1);

        associadosVips.sort(Comparator.comparing(AssociadoVip::getQuantidadeDeCota).reversed());
        System.out.print("\n Lista de Associados Vip por quantidade de cotas (decrescente): " + associadosVips);

        System.out.print("\n Associado com maior quantidade de cotas: ");
        AssociadoVip bigqc = Collections.max(associadosVips, Comparator.comparing(AssociadoVip::getQuantidadeDeCota));
        associadosVips.forEach(f -> {
            if (f.getQuantidadeDeCota() >= bigqc.getQuantidadeDeCota()) {
                System.out.print(f);
            }
        });

        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.print("\n Lista de Contas por saldo (decrescente): " + contas);

        System.out.print("\n Lista de Associados Vip que possuem conta: ");
        associadosVips.forEach(a -> {
            if (a instanceof Conta_corrente) {
                System.out.println(a);
            } else if (a instanceof  Associado) {
                System.out.println(a);
            }
        });

        System.out.print("\n Conta com maior saldo bancario: ");
        Conta bigs = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        contas.forEach(c -> {
            if (c.getSaldo() >= bigs.getSaldo()) {
                System.out.print(c);
            }
        });
    }
}