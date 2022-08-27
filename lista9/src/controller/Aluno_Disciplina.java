package controller;

import model.Aluno;
import model.Disciplina;

import java.util.Comparator;

public class Aluno_Disciplina {

    public static void main(String[] args) {

        Aluno a1 = new Aluno(1L, "Daniel", "Gomes");
        Aluno a2 = new Aluno(2L, "Taina", "Santos");

        Disciplina d1 = new Disciplina(1L, "Historia");
        Disciplina d2 = new Disciplina(2L, "Matematica");
        Disciplina d3 = new Disciplina(3L, "Ingles");

        a1.getDisciplinas().add(d2);
        a1.getDisciplinas().add(d3);

        a2.getDisciplinas().add(d1);
        a2.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d3);

        System.out.println("\n Lista de disciplinas por aluno: ");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println("\nAluno 1: " + a1);
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println("\nAluno 2: " + a2);

        a2.getDisciplinas().clear();
        System.out.println("\n Segunda lista de disciplinas por aluno: ");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println("\nAluno 1: " + a1);
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println("\nAluno 2: " + a2);
    }
}
