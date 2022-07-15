package controller;

import model.Carro;

import java.util.*;

public class Main_carro {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro(0,"Fiat", "Uno", 2008);
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());

        carro1.setId(1);
        carro1.setMarca("Chevrolet");
        carro1.setModelo("Onix");
        carro1.setAnoFabricacao(2019);
        System.out.println(carro1.getId());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());

        carro2.setId(2);
        carro2.setMarca("Renault");
        carro2.setModelo("Logan");
        carro2.setAnoFabricacao(2017);
        System.out.println(carro2.getId());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());

        Carro carro3 = new Carro(3, "Mitsubishi", "Eclipse", 2022);
        Carro carro4 = new Carro(4, "Volkswagen", "Gol", 1999);
        Carro carro5 = new Carro(4, "Volkswagen", "Gol", 1999);

        /*                List                      */
        List<Carro> carroList = new ArrayList<>();
        carroList.add(carro1);
        carroList.add(carro2);
        carroList.add(carro3);
        carroList.add(carro4);
        carroList.add(carro5);
        System.out.println("------- Lista Original -------");
        System.out.println(carroList);

        System.out.println("------- Pesquisa -------");
        Carro carroFind = carroList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(carroFind);

        carroList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(carroList);

        /*                Map                      */
        Map<Integer, Carro> carroMap = new HashMap<>();
        carroMap.put(carro1.getId(), carro1);
        carroMap.put(carro2.getId(), carro2);
        carroMap.put(carro3.getId(), carro3);
        carroMap.put(carro4.getId(), carro4);
        carroMap.put(carro5.getId(), carro5);
        System.out.println("------- Lista Original -------");
        System.out.println(carroList);

        System.out.println("------- Pesquisa -------");
        System.out.println(carroMap.get(3));
    }
}