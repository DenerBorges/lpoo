package controller;

import model.*;

import java.util.*;

public class Main_funcionario {

    public static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor("Matheus", 2000.00);
        Desenvolvedor dev2 = new Desenvolvedor("Diego", 2000.00);
        Desenvolvedor dev3 = new Desenvolvedor("Jonas", 2000.00);
        Desenvolvedor dev4 = new Desenvolvedor("Camila", 2500.00);
        Desenvolvedor dev5 = new Desenvolvedor("Paula", 2500.00);
        Desenvolvedor dev6 = new Desenvolvedor("Ricardo", 2500.00);
        System.out.print("\n Desenvolvedores: ");
        System.out.print(dev1 + "" + dev2 + "" + dev3 + "" + dev4 + "" + dev5 + "" + dev6);

        Gerente ger1 = new Gerente("Gabriel", 5000.00, "ACES9", 300);
        Gerente ger2 = new Gerente("Adriane", 5000.00, "HELP5", 500);
        Gerente ger3 = new Gerente("Jorge", 5500.00, "ELIT3", 800);
        Gerente ger4 = new Gerente("Laura", 5500.00, "BOLS2", 400);
        Gerente ger5 = new Gerente("Victoria", 6000.00, "SALV0", 1200);
        Gerente ger6 = new Gerente("Sarah", 6500.00, "PONT3", 2700);
        System.out.print("\n Gerentes: ");
        System.out.print(ger1 + "" + ger2 + "" + ger3 + "" + ger4 + "" + ger5 + "" + ger6);

        Cliente cl1 = new Cliente("Gustavo", "Rosa", "LUPA5", 1100);
        Cliente cl2 = new Cliente("Leticia", "Pereira", "CARO8", 2000);
        Cliente cl3 = new Cliente("Samuel", "Vieira", "DESI7", 600);
        Cliente cl4 = new Cliente("Cristina", "Amaral", "PODE5", 2600);
        Cliente cl5 = new Cliente("Leonardo", "Neves", "GANH0", 1300);
        Cliente cl6 = new Cliente("Felipe", "Silva", "GOLO1", 900);
        System.out.print("\n Clientes: ");
        System.out.print(cl1 + "" + cl2 + "" + cl3 + "" + cl4 + "" + cl5 + "" + cl6);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(ger3);
        funcionarios.add(ger4);
        funcionarios.add(ger5);
        funcionarios.add(ger6);
        System.out.print("\n Lista de Funcionarios: " + funcionarios);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(ger1);
        investidores.add(ger2);
        investidores.add(ger3);
        investidores.add(ger4);
        investidores.add(ger5);
        investidores.add(ger6);
        investidores.add(cl1);
        investidores.add(cl2);
        investidores.add(cl3);
        investidores.add(cl4);
        investidores.add(cl5);
        investidores.add(cl6);
        System.out.print("\n Lista de Investidores: " + investidores);

        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.print("\n Lista de Funcionarios (ordem decrescente): " + funcionarios);
        System.out.print("\n Lista de Clientes (ordem decrescente): ");
        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        investidores.forEach(i -> {
            if(i instanceof Cliente) {
                System.out.println(i);
            }
        });
        System.out.print("\n Lista de Investidores: " + investidores);

        System.out.print("\n Funcionaro com maior salario: ");
        Funcionario maiorsal = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(f -> {
            if(f.getSalario() >= maiorsal.getSalario()) {
                System.out.print(f);
            }
        });
        System.out.print("\n Investidor com maior quantidade de acoes: ");
        Investidor maiorac = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));
        investidores.forEach(i -> {
            if(i.getQuantidade() >= maiorac.getQuantidade()) {
                System.out.print(i);
            }
        });
    }
}