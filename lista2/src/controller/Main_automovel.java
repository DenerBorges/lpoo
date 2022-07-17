package controller;

import model.Automovel;

import java.util.*;

public class Main_automovel {

    public static void main(String[] args) {

        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel(0, "823752314", "EZL1799", "Cinza", 5, "Gasolina", 17000, "9BWAA4508AP000032", 450000.55);
        System.out.println(automovel1.toString());
        System.out.println(automovel2.toString());

        automovel1.setId(1);
        automovel1.setRenavan("648352198");
        automovel1.setPlaca("TGS6432");
        automovel1.setCor("Branco");
        automovel1.setNum_rodas(4);
        automovel1.setCombustivel("Alcool");
        automovel1.setQuilometragem(34000);
        automovel1.setChassi("36DGD8394JFG8704");
        automovel1.setValor_locacao(120000.90);
        System.out.println(automovel1.getId());
        System.out.println(automovel1.getRenavan());
        System.out.println(automovel1.getPlaca());
        System.out.println(automovel1.getCor());
        System.out.println(automovel1.getNum_rodas());
        System.out.println(automovel1.getCombustivel());
        System.out.println(automovel1.getQuilometragem());
        System.out.println(automovel1.getChassi());
        System.out.println(automovel1.getValor_locacao());

        automovel2.setId(2);
        automovel2.setRenavan("845321007");
        automovel2.setPlaca("HJW3267");
        automovel2.setCor("Preto");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("Gasolina");
        automovel2.setQuilometragem(98000);
        automovel2.setChassi("45SCJ2479FV3620");
        automovel2.setValor_locacao(520000.90);
        System.out.println(automovel2.getId());
        System.out.println(automovel2.getRenavan());
        System.out.println(automovel2.getPlaca());
        System.out.println(automovel2.getCor());
        System.out.println(automovel2.getNum_rodas());
        System.out.println(automovel2.getCombustivel());
        System.out.println(automovel2.getQuilometragem());
        System.out.println(automovel2.getChassi());
        System.out.println(automovel2.getValor_locacao());

        Automovel automovel3 = new Automovel(3, "673620106", "GHN3216", "Vermelho", 4, "Gasol/Alcool", 431000, "7EFD83741CF36417", 123600.45);
        Automovel automovel4 = new Automovel(4, "86213090", "DRN7428", "Azul", 5, "Gasol/Diesel", 428000, "9SMC36920QZ21668", 470800.90);
        Automovel automovel5 = new Automovel(4, "86213090", "DRN7428", "Azul", 5, "Gasol/Diesel", 428000, "9SMC36920QZ21668", 470800.90);

        /*                List                      */
        List<Automovel> automovelList = new ArrayList<>();
        automovelList.add(automovel1);
        automovelList.add(automovel2);
        automovelList.add(automovel3);
        automovelList.add(automovel4);
        automovelList.add(automovel5);
        System.out.println("------- Lista Original -------");
        System.out.println(automovelList);

        System.out.println("------- Pesquisa -------");
        Automovel automovelFind = automovelList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(automovelFind);

        automovelList.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(automovelList);

        /*                Map                      */
        Map<Integer, Automovel> automovelMap = new HashMap<>();
        automovelMap.put(automovel1.getId(), automovel1);
        automovelMap.put(automovel2.getId(), automovel2);
        automovelMap.put(automovel3.getId(), automovel3);
        automovelMap.put(automovel4.getId(), automovel4);
        automovelMap.put(automovel5.getId(), automovel5);
        System.out.println("------- Lista Original -------");
        System.out.println(automovelList);

        System.out.println("------- Pesquisa -------");
        System.out.println(automovelMap.get(3));
    }
}