package controller;

import model.Cliente;

import java.util.*;

public class Main_cliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente(0, "94274812971", "Carlos", "Almeida", "Rua Machado de Assis, 246", "97453781", "984673278", "carlos_almeida@hotmail.com");
        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        cliente1.setId(1);
        cliente1.setCpf("32873353293");
        cliente1.setNome("Fabiano");
        cliente1.setSobrenome("Guedes");
        cliente1.setEndereco("Avenida Brasil, 346");
        cliente1.setCep("98374823");
        cliente1.setTelefone("987342675");
        cliente1.setEmail("fabiano_guedes@gmail.com");
        System.out.println(cliente1.getId());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getCep());
        System.out.println(cliente1.getTelefone());
        System.out.println(cliente1.getEmail());

        cliente2.setId(2);
        cliente2.setCpf("31442659766");
        cliente2.setNome("Gabriela");
        cliente2.setSobrenome("Nunes");
        cliente2.setEndereco("Avenida Sao Joao, 165");
        cliente2.setCep("54311784");
        cliente2.setTelefone("983516890");
        cliente2.setEmail("gabi_nunes@gmail.com");
        System.out.println(cliente2.getId());
        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getSobrenome());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getCep());
        System.out.println(cliente2.getTelefone());
        System.out.println(cliente2.getEmail());

        Cliente cliente3 = new Cliente(3, "26377843410", "Jose", "Cunha", "Rua Adriano Gomes, 12", "96030508", "981269484", "jose_cunha@bol.com.br");
        Cliente cliente4 = new Cliente(4, "54213497322", "Maria", "Gomes", "Rua Paulo Costa, 556", "973219429", "984327688", "maria_gomes@gmail.com");
        Cliente cliente5 = new Cliente(4, "54213497322", "Maria", "Gomes", "Rua Paulo Costa, 556", "973219429", "984327688", "maria_gomes@gmail.com");

        /*                List                      */
        List<Cliente> clienteList = new ArrayList<>();
        clienteList.add(cliente1);
        clienteList.add(cliente2);
        clienteList.add(cliente3);
        clienteList.add(cliente4);
        clienteList.add(cliente5);
        System.out.println("------- Lista Original -------");
        System.out.println(clienteList);

        System.out.println("------- Pesquisa -------");
        Cliente clienteFind = clienteList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(clienteFind);

        clienteList.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(clienteList);

        /*                Map                      */
        Map<Integer, Cliente> clienteMap = new HashMap<>();
        clienteMap.put(cliente1.getId(), cliente1);
        clienteMap.put(cliente2.getId(), cliente2);
        clienteMap.put(cliente3.getId(), cliente3);
        clienteMap.put(cliente4.getId(), cliente4);
        clienteMap.put(cliente5.getId(), cliente5);
        System.out.println("------- Lista Original -------");
        System.out.println(clienteList);

        System.out.println("------- Pesquisa -------");
        System.out.println(clienteMap.get(3));
    }
}