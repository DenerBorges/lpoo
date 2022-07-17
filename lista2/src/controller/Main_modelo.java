package controller;

import model.Modelo;

import java.util.*;

public class Main_modelo {

    public static void main(String[] args) {

        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo(0, "Etios");
        System.out.println(modelo1.toString());
        System.out.println(modelo2.toString());

        modelo1.setId(1);
        modelo1.setDescricao("Fit");
        System.out.println(modelo1.getId());
        System.out.println(modelo1.getDescricao());

        modelo2.setId(2);
        modelo2.setDescricao("Onix");
        System.out.println(modelo2.getId());
        System.out.println(modelo2.getDescricao());

        Modelo modelo3 = new Modelo(3, "Gol");
        Modelo modelo4 = new Modelo(4, "Sandero");
        Modelo modelo5 = new Modelo(4, "Sandero");

        /*                List                      */
        List<Modelo> modeloList = new ArrayList<>();
        modeloList.add(modelo1);
        modeloList.add(modelo2);
        modeloList.add(modelo3);
        modeloList.add(modelo4);
        modeloList.add(modelo5);
        System.out.println("------- Lista Original -------");
        System.out.println(modeloList);

        System.out.println("------- Pesquisa -------");
        Modelo modeloFind = modeloList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(modeloFind);

        modeloList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(modeloList);

        /*                Map                      */
        Map<Integer, Modelo> modeloMap = new HashMap<>();
        modeloMap.put(modelo1.getId(), modelo1);
        modeloMap.put(modelo2.getId(), modelo2);
        modeloMap.put(modelo3.getId(), modelo3);
        modeloMap.put(modelo4.getId(), modelo4);
        modeloMap.put(modelo5.getId(), modelo5);
        System.out.println("------- Lista Original -------");
        System.out.println(modeloList);

        System.out.println("------- Pesquisa -------");
        System.out.println(modeloMap.get(3));
    }
}