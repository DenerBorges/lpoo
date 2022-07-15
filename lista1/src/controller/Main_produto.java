package controller;

import model.Produto;

import java.util.*;

public class Main_produto {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto(0,"Beterraba", "Vegetal", 7.4, 38);
        System.out.println(produto1.toString());
        System.out.println(produto2.toString());

        produto1.setId(1);
        produto1.setNome("Caneta");
        produto1.setDescricao("Utilitario");
        produto1.setValor(1.50);
        produto1.setEstoque(43);
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());

        produto2.setId(2);
        produto2.setNome("Chave de fenda");
        produto2.setDescricao("Ferramenta");
        produto2.setValor(3.40);
        produto2.setEstoque(21);
        System.out.println(produto2.getId());
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        Produto produto3 = new Produto(3, "Costela de porco", "Carne", 37.99, 17);
        Produto produto4 = new Produto(4, "Sabonete", "Higiene", 4.50, 47);
        Produto produto5 = new Produto(4, "Sabonete", "Higiene", 4.50, 47);

        /*                List                      */
        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);
        produtoList.add(produto4);
        produtoList.add(produto5);
        System.out.println("------- Lista Original -------");
        System.out.println(produtoList);

        System.out.println("------- Pesquisa -------");
        Produto produtoFind = produtoList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(produtoFind);

        produtoList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(produtoList);

        /*                Map                      */
        Map<Integer, Produto> produtoMap = new HashMap<>();
        produtoMap.put(produto1.getId(), produto1);
        produtoMap.put(produto2.getId(), produto2);
        produtoMap.put(produto3.getId(), produto3);
        produtoMap.put(produto4.getId(), produto4);
        produtoMap.put(produto5.getId(), produto5);
        System.out.println("------- Lista Original -------");
        System.out.println(produtoList);

        System.out.println("------- Pesquisa -------");
        System.out.println(produtoMap.get(3));
    }
}