package controller;

import model.Locacao;
import java.util.*;

public class Main_locacao {

    public static void main(String[] args) {

        Locacao locacao1 = new Locacao();
        Locacao locacao2 = new Locacao(0, new GregorianCalendar(2016, Calendar.MARCH, 4, 16, 23), new GregorianCalendar(2016, Calendar.JUNE, 24, 11, 30), 33000, 30.99, 450.00, false);
        System.out.println(locacao1.toString());
        System.out.println(locacao2.toString());

        locacao1.setId(1);
        locacao1.setDataLocacao(new GregorianCalendar(2015, Calendar.JANUARY, 16, 8, 20));
        locacao1.setDataDevolucao(new GregorianCalendar(2020, Calendar.SEPTEMBER, 30, 14, 33));
        locacao1.setQuilometragem(40000);
        locacao1.setValorCalcao(90.00);
        locacao1.setValor_locacao(120.00);
        locacao1.setDevolvido(true);
        System.out.println(locacao1.getId());
        System.out.println(locacao1.getDataLocacao());
        System.out.println(locacao1.getDataDevolucao());
        System.out.println(locacao1.getQuilometragem());
        System.out.println(locacao1.getValorCalcao());
        System.out.println(locacao1.getValor_locacao());
        System.out.println(locacao1.isDevolvido());

        locacao2.setId(2);
        locacao2.setDataLocacao(new GregorianCalendar(2016, Calendar.APRIL, 7, 8, 17));
        locacao2.setDataDevolucao(new GregorianCalendar(2021, Calendar.AUGUST, 1, 16, 20));
        locacao2.setQuilometragem(64000);
        locacao2.setValorCalcao(70.50);
        locacao2.setValor_locacao(380.00);
        locacao2.setDevolvido(false);
        System.out.println(locacao2.getId());
        System.out.println(locacao2.getDataLocacao());
        System.out.println(locacao2.getDataDevolucao());
        System.out.println(locacao2.getQuilometragem());
        System.out.println(locacao2.getValorCalcao());
        System.out.println(locacao2.getValor_locacao());
        System.out.println(locacao2.isDevolvido());

        Locacao locacao3 = new Locacao(3, new GregorianCalendar(2022, Calendar.JULY, 23, 20, 22), null, 130000, 30.50, 350.00, true);
        Locacao locacao4 = new Locacao(4, new GregorianCalendar(2016, Calendar.FEBRUARY, 4, 22, 30), new GregorianCalendar(2017, Calendar.JANUARY, 5, 11, 15), 50000, 42.80, 450.00, true);
        Locacao locacao5 = new Locacao(4, new GregorianCalendar(2016, Calendar.FEBRUARY, 4, 22, 30), new GregorianCalendar(2017, Calendar.JANUARY, 5, 11, 15), 50000, 42.80, 450.00, true);

        /*                List                      */
        List<Locacao> locacaoList = new ArrayList<>();
        locacaoList.add(locacao1);
        locacaoList.add(locacao2);
        locacaoList.add(locacao3);
        locacaoList.add(locacao4);
        locacaoList.add(locacao5);
        System.out.println("------- Lista Original -------");
        System.out.println(locacaoList);

        System.out.println("------- Pesquisa -------");
        Locacao locacaoFind = locacaoList.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(locacaoFind);

        locacaoList.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println("------- Ordem Decrescente -------");
        System.out.println(locacaoList);

        /*                Map                      */
        Map<Integer, Locacao> locacaoMap = new HashMap<>();
        locacaoMap.put(locacao1.getId(), locacao1);
        locacaoMap.put(locacao1.getId(), locacao2);
        locacaoMap.put(locacao1.getId(), locacao3);
        locacaoMap.put(locacao1.getId(), locacao4);
        locacaoMap.put(locacao1.getId(), locacao5);
        System.out.println("------- Lista Original -------");
        System.out.println(locacaoMap);

        System.out.println("------- Pesquisa -------");
        System.out.println(locacaoMap.get(3));
    }
}
