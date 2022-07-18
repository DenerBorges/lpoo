package controller;

import model.Aluno;
import java.util.*;

public class Main_aluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(2, 984632789, "Diego", "Santos", "diego_santos@gmail.com");
        Aluno aluno4 = new Aluno(3, 539123973, "Giovana", "Moura", "gi_moura@hotmail.com");
        Aluno aluno5 = new Aluno(4, 761473398, null, null, null);
        Aluno aluno6 = new Aluno(5, 893572819, null, null, null);
        System.out.println(aluno1.toString());
        System.out.println(aluno2.toString());
        System.out.println(aluno3.toString());
        System.out.println(aluno4.toString());
        System.out.println(aluno5.toString());
        System.out.println(aluno6.toString());

        aluno1.setId(0);
        aluno1.setCpf(573839104);
        aluno1.setNome("Daniel");
        aluno1.setSobrenome("Vargas");
        aluno1.setEmail("daniel_vargar@hotmail.com");
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        aluno2.setId(1);
        aluno2.setCpf(648395219);
        aluno2.setNome("Sabrina");
        aluno2.setSobrenome("Dias");
        aluno2.setEmail("sabrina_dias@gmail.com");
        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        /*                List                      */
        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(aluno1);
        alunoList.add(aluno2);
        alunoList.add(aluno3);
        alunoList.add(aluno4);
        alunoList.add(aluno5);
        alunoList.add(aluno6);
        System.out.println("------- Lista Original -------");
        System.out.println(alunoList);

        alunoList.sort(Comparator.comparing(Aluno::getId));
        System.out.println("------- Ordem Crescente -------");
        System.out.println(alunoList);

        System.out.println("------- Pesquisa -------");
        Aluno alunoFind = alunoList.stream().filter(p -> p.getId() == 5).findAny().orElse(null);
        System.out.println(alunoFind);


        /*                Map                      */
        Map<Integer, Aluno> alunoMap = new HashMap<>();
        alunoMap.put(aluno1.getId(), aluno1);
        alunoMap.put(aluno2.getId(), aluno2);
        alunoMap.put(aluno3.getId(), aluno3);
        alunoMap.put(aluno4.getId(), aluno4);
        alunoMap.put(aluno5.getId(), aluno5);
        alunoMap.put(aluno6.getId(), aluno6);
        System.out.println("------- Lista Original -------");
        System.out.println(alunoList);

        System.out.println("------- Pesquisa -------");
        System.out.println(alunoMap.get(5));

        /*                List                      */
        alunoList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(alunoList);
    }
}
