package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main_funcionario {

    private static double total_com_bonus = 0.0;
    private static double total_sem_bonus = 0.0;

    public static void main(String[] args) {

        Desenvolvedor des1 = new DesenvolvedorSenior();
        Desenvolvedor des2 = new DesenvolvedorSenior("Matheus", 4000.00);
        Gerente ger1 = new GerenteGeral();
        Gerente ger2 = new GerenteDesenvolvimento("Luan", 5500.00);
        System.out.print("Funcionarios");
        System.out.println(des1 + "" + des2 + "" + ger1 + "" + ger2);

        des1.setNome("Daniel");
        des1.setSalario(4000.00);
        ger1.setNome("Thais");
        ger1.setSalario(6000.00);
        System.out.print("Funcionarios");
        System.out.println(des1 + "" + des2 + "" + ger1 + "" + ger2);

        /*Respondendo as questões
          1. Não, pois 'Funcionario' é uma classe abstrata
          2. No modelo pois a boa prática é não colocar regras de negócios no 'controller'.*/

        Desenvolvedor des3 = new DesenvolvedorSenior("Catarina", 4000.00);
        Desenvolvedor des4 = new DesenvolvedorSenior("Leandro", 4000.00);
        Desenvolvedor des5 = new DesenvolvedorSenior("Cristina", 4000.00);
        Desenvolvedor des6 = new DesenvolvedorSenior("Eduardo", 4000.00);
        Desenvolvedor des7 = new DesenvolvedorPleno("Mariana", 2500.00);
        Desenvolvedor des8 = new DesenvolvedorPleno("Leticia", 2500.00);
        Desenvolvedor des9 = new DesenvolvedorPleno("Carlos", 2500.00);
        Desenvolvedor des10 = new DesenvolvedorPleno("Pedro", 2500.00);
        Desenvolvedor des11 = new DesenvolvedorPleno("Joao", 2500.00);
        Desenvolvedor des12 = new DesenvolvedorPleno("Gabriel", 2500.00);
        Desenvolvedor des13 = new DesenvolvedorJunior("Sarah", 1500.00);
        Desenvolvedor des14 = new DesenvolvedorJunior("Hellen", 1500.00);
        Desenvolvedor des15 = new DesenvolvedorJunior("Ariel", 1500.00);
        Desenvolvedor des16 = new DesenvolvedorJunior("Laura", 1500.00);
        Desenvolvedor des17 = new DesenvolvedorJunior("Jean", 1500.00);
        Desenvolvedor des18 = new DesenvolvedorJunior("Raquel", 1500.00);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(des1);
        funcionarios.add(des2);
        funcionarios.add(des3);
        funcionarios.add(des4);
        funcionarios.add(des5);
        funcionarios.add(des6);
        funcionarios.add(des7);
        funcionarios.add(des8);
        funcionarios.add(des9);
        funcionarios.add(des10);
        funcionarios.add(des11);
        funcionarios.add(des12);
        funcionarios.add(des13);
        funcionarios.add(des14);
        funcionarios.add(des15);
        funcionarios.add(des16);
        funcionarios.add(des17);
        funcionarios.add(des18);
        System.out.print("\nFuncionarios cadastrados\n" + funcionarios);

        funcionarios.forEach(f -> {
            total_com_bonus += f.getSalario() + f.getBonus();
        });
        System.out.print("\nTotal com bonus");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_com_bonus));

        funcionarios.forEach(f -> {
            total_sem_bonus += f.getSalario();
        });
        System.out.print("\nTotal sem bonus");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_sem_bonus));

        System.out.println("\nBonus, salario bruto e salario de cada funcionario");
        funcionarios.forEach(f -> {
            double salarioBruto = f.getSalario() + f.getBonus();
            System.out.println("\nFuncionario: " + f.getNome());
            System.out.println("Cargo: " + f.getClass());
            System.out.println("Salario= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
            System.out.println("Bonus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
            System.out.println("Salario bruto= " + NumberFormat.getCurrencyInstance().format(salarioBruto));
        });

        total_com_bonus = 0.0;
        funcionarios.forEach(f -> {
            double novoSalario = f.getSalario() + (f.getSalario() * 0.05);
            f.setSalario(novoSalario);
            total_com_bonus += f.getSalario() + f.getBonus();
        });
        System.out.println("Novo total com bonus");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_com_bonus));
    }
}
