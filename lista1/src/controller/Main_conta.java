package controller;

import model.Conta;

import java.util.*;

public class Main_conta {

    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta(1, 20000.00);
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());

        conta1.setId(1);
        conta1.deposita(25000.00);
        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());

        conta2.setId(2);
        conta2.deposita(40000.00);
        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());

        Conta conta3 = new Conta(3, 23000.00);
        Conta conta4 = new Conta(4, 19000.00);
        Conta conta5 = new Conta(4, 19000.00);

        /*                List                      */
        List<Conta> contaList = new ArrayList<>();
        contaList.add(conta1);
        contaList.add(conta2);
        contaList.add(conta3);
        contaList.add(conta4);
        contaList.add(conta5);
        System.out.println("------- Lista Original -------");
        System.out.println(contaList);

        System.out.println("------- Pesquisa -------");
        Conta contaFind = contaList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(contaFind);

        contaList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(contaList);

        /*                Map                      */
        Map<Integer, Conta> contaMap = new HashMap<>();
        contaMap.put(conta1.getId(), conta1);
        contaMap.put(conta2.getId(), conta2);
        contaMap.put(conta3.getId(), conta3);
        contaMap.put(conta4.getId(), conta4);
        contaMap.put(conta5.getId(), conta5);
        System.out.println("------- Lista Original -------");
        System.out.println(contaList);

        System.out.println("------- Pesquisa -------");
        System.out.println(contaMap.get(3));
    }
}