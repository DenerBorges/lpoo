package controller;

import model.Marca;

import java.util.*;

public class Main_marca {

    public static void main(String[] args) {

        Marca marca1 = new Marca();
        Marca marca2 = new Marca(0, "Toyota");
        System.out.println(marca1.toString());
        System.out.println(marca2.toString());

        marca1.setId(1);
        marca1.setDescricao("Honda");
        System.out.println(marca1.getId());
        System.out.println(marca1.getDescricao());

        marca2.setId(2);
        marca2.setDescricao("Chevrolet");
        System.out.println(marca2.getId());
        System.out.println(marca2.getDescricao());

        Marca marca3 = new Marca(3, "Volkswagen");
        Marca marca4 = new Marca(4, "Renault");
        Marca marca5 = new Marca(4, "Renault");

        /*                List                      */
        List<Marca> marcaList = new ArrayList<>();
        marcaList.add(marca1);
        marcaList.add(marca2);
        marcaList.add(marca3);
        marcaList.add(marca4);
        marcaList.add(marca5);
        System.out.println("------- Lista Original -------");
        System.out.println(marcaList);

        System.out.println("------- Pesquisa -------");
        Marca marcaFind = marcaList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(marcaFind);

        marcaList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(marcaList);

        /*                Map                      */
        Map<Integer, Marca> marcaMap = new HashMap<>();
        marcaMap.put(marca1.getId(), marca1);
        marcaMap.put(marca2.getId(), marca2);
        marcaMap.put(marca3.getId(), marca3);
        marcaMap.put(marca4.getId(), marca4);
        marcaMap.put(marca5.getId(), marca5);
        System.out.println("------- Lista Original -------");
        System.out.println(marcaList);

        System.out.println("------- Pesquisa -------");
        System.out.println(marcaMap.get(3));
    }
}