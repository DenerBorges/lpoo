package controller;

import model.Empresa;
import model.Funcionario;

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Empresa_Funcionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(1L, "09238743210", "Carlos", "Bonfim", new GregorianCalendar(1989, Calendar.JUNE, 4));
        Funcionario f2 = new Funcionario(2L, "98723462989", "Joao", "Lisboa", new GregorianCalendar(1991, Calendar.SEPTEMBER, 27));
        Funcionario f3 = new Funcionario(3L, "14149886863", "Maria", "Nascimento", new GregorianCalendar(1996, Calendar.FEBRUARY, 15));
        Funcionario f4 = new Funcionario(4L, "72281498941", "Daniel", "Padilha", new GregorianCalendar(1988, Calendar.DECEMBER, 24));
        Funcionario f5 = new Funcionario(5L, "87236438732", "Luiza", "Antunes", new GregorianCalendar(1996, Calendar.AUGUST, 6));
        Funcionario f6 = new Funcionario(6L, "32476378627", "Eduarda", "Pascoal", new GregorianCalendar(1999, Calendar.JULY, 23));

        Empresa e1 = new Empresa("34.876.167/0001-36", "Agua e Vida Comercio Ltda", "Agua Vida");
        Empresa e2 = new Empresa("84.381.946/0001-17", "Zimbra Esportes MEI", "Zimbra");

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);

        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        System.out.println("\n Lista de todos funcionarios por empresa pelo nome: ");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println("\nEmpresa 1: " + e1);
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println("\nEmpresa 2: " + e2);

        System.out.println("\n Lista de todos funcionarios por empresa pela idade: ");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println("\nEmpresa 1: " + e1);
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println("\nEmpresa 2: " + e2);
    }
}
