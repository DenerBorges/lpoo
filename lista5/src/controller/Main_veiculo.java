package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main_veiculo {

    public static void main(String[] args) {

        Bicicleta b1 = new Bicicleta(2, "humana", "Monark", "City", 1992, 72, "89349025");
        System.out.println(b1);

        Carro car1 = new Carro(2, "gasolina", "Renault", "Logan", 2015, 240, "147381953", "FJ79FJS93UA4", "GIU7489");
        System.out.println(car1);

        Caminhao cm1 = new Caminhao(5 , "diesel", "Volkswagen", "MWM", 2018, 500, "6431298732", "GD47392EU238", "YIA2391");
        System.out.println(cm1);

        Bicicleta b2 = new Bicicleta(2, "humana", "Caloi", "Vulcan", 2009, 70, "62689314");
        Bicicleta b3 = new Bicicleta(2, "humana", "KSW", "Ksw", 2003, 69, "62145975");
        Bicicleta b4 = new Bicicleta(2, "humana", "Caloi", "Two Niner", 2015, 71, "82514782");
        Bicicleta b5 = new Bicicleta(2, "humana", "KSW", "Ksw", 2001, 67, "56732678");

        Carro car2 = new Carro(2, "gasolina", "Volkswagen", "Gol", 1998, 80, "83267843", "KI7894237HY8", "KFH8326");
        Carro car3 = new Carro(2, "alcool", "Chevrolet", "Cruze", 2016, 120, "543678643", "NBE23800694HJ", "URS0937");
        Carro car4 = new Carro(2, "alcool/gasolina", "Fiat", "Uno", 2020, 100, "72116890", "KL48390848YT", "ASN3412");
        Carro car5 = new Carro(2, "gasolina", "BMW", "X1", 2022, 180, "974255641", "IP4319987AG1", "IOD3892");

        Caminhao cm2 = new Caminhao(5 , "diesel", "Iveco", "Daily City", 2010, 600, "637948432", "JK3839SJ13", "JFK0938");
        Caminhao cm3 = new Caminhao(4 , "diesel", "Scania", "P 310", 2016, 450, "789434783", "LP4349UI32", "INS7109");
        Caminhao cm4 = new Caminhao(5 , "diesel", "Volvo", "FH", 2014, 750, "137727347", "TD41208AB3", "TAE9847");
        Caminhao cm5 = new Caminhao(4 , "diesel", "MAN", "TGX", 2017, 800, "940432372", "WS08701OM3", "LNC9871");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(b1);
        veiculos.add(b2);
        veiculos.add(b3);
        veiculos.add(b4);
        veiculos.add(b5);
        veiculos.add(car1);
        veiculos.add(car2);
        veiculos.add(car3);
        veiculos.add(car4);
        veiculos.add(car5);
        veiculos.add(cm1);
        veiculos.add(cm2);
        veiculos.add(cm3);
        veiculos.add(cm4);
        veiculos.add(cm5);

        veiculos.sort(Comparator.comparing(Veiculo::getAnoFabricacao));
        System.out.println("\nLista de veiculos cadastrados por ano de fabricacao: " + veiculos);

        System.out.println("\nLista de automoveis cadastrados por ano de fabricacao: ");
        veiculos.forEach(v -> {
            if (v instanceof Automovel) {
                System.out.println(v);
            }
        });

        System.out.println("\nLista de bicicletas cadastrados por ano de fabricacao: ");
        veiculos.forEach(v -> {
            if (v instanceof Bicicleta) {
                System.out.println(v);
            }
        });

        System.out.println("\nLista de veiculos que a primeira letra da placa e I ou i: ");
        veiculos.forEach(v -> {
            if (v instanceof Automovel) {
                if (((Automovel) v).getPlaca().startsWith("I") || ((Automovel) v).getPlaca().startsWith("i")) {
                    System.out.println(v);
                }
            }
        });
    }
}
