package controller;

import model.Func;

import java.util.*;

public class Main_funcionario {

    public static void main(String[] args) {

        Func func1 = new Func();
        Func func2 = new Func(0,"Matheus", 2000.00);
        System.out.println(func1.toString());
        System.out.println(func2.toString());

        func1.setId(1);
        func1.setNome("Michele");
        func1.setSalario(2500.00);
        System.out.println(func1.getId());
        System.out.println(func1.getNome());
        System.out.println(func1.getSalario());

        func2.setId(2);
        func2.setNome("Diogo");
        func2.setSalario(2450.00);
        System.out.println(func2.getId());
        System.out.println(func2.getNome());
        System.out.println(func2.getSalario());

        Func func3 = new Func(3, "Sergio", 2700.00);
        Func func4 = new Func(4, "Cristina", 3250.00);
        Func func5 = new Func(4, "Cristina", 3250.00);

        /*                List                      */
        List<Func> funcList = new ArrayList<>();
        funcList.add(func1);
        funcList.add(func2);
        funcList.add(func3);
        funcList.add(func4);
        funcList.add(func5);
        System.out.println("------- Lista Original -------");
        System.out.println(funcList);

        System.out.println("------- Pesquisa -------");
        Func funcFind = funcList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(funcFind);

        funcList.sort(Comparator.comparing(Func::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(funcList);

        /*                Map                      */
        Map<Integer, Func> funcMap = new HashMap<>();
        funcMap.put(func1.getId(), func1);
        funcMap.put(func2.getId(), func2);
        funcMap.put(func3.getId(), func3);
        funcMap.put(func4.getId(), func4);
        funcMap.put(func5.getId(), func5);
        System.out.println("------- Lista Original -------");
        System.out.println(funcList);

        System.out.println("------- Pesquisa -------");
        System.out.println(funcMap.get(3));
    }
}