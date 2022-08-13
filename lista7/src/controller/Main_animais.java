package controller;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

import java.util.ArrayList;
import java.util.List;

public class Main_animais {

    public static void main(String[] args) {

        Cachorro ch1 = new Cachorro(1.0, 1.0);
        Cachorro ch2 = new Cachorro(1.0, 1.0);
        Cachorro ch3 = new Cachorro(1.0, 1.0);
        Passaro pa1 = new Passaro(2.0, 2.0, 2.0);
        Passaro pa2 = new Passaro(2.0, 2.0, 2.0);
        Passaro pa3 = new Passaro(2.0, 2.0, 2.0);
        Peixe pe1 = new Peixe(3.0, 3.0, 3.0);
        Peixe pe2 = new Peixe(3.0, 3.0, 3.0);
        Peixe pe3 = new Peixe(3.0, 3.0, 3.0);

        List<Animal> animals = new ArrayList<>();
        animals.add(ch1);
        animals.add(ch2);
        animals.add(ch3);
        animals.add(pa1);
        animals.add(pa2);
        animals.add(pa3);
        animals.add(pe1);
        animals.add(pe2);
        animals.add(pe3);
        System.out.print("\n Lista de animais: " + animals);

        System.out.print("\n Animais movidos para cooedenadas x = 2.0 e y = 2.0");
        animals.forEach(a -> {
            a.mover(2.0, 2.0);
            a.desenhar();
            System.out.println(a);
        });

        System.out.print("\n Classe Cachorro movidos para coordenadas x = 8.0 e y = 8.0");
        animals.forEach(a -> {
            if (a instanceof Cachorro) {
                a.mover(8.0, 8.0);
                a.desenhar();
                System.out.print(a);
            }
        });

        System.out.print("\n Classes Peixes e Passaros movidos para coordenadas x = 5.0, y = 5.0 e z = 5.0");
        animals.forEach(a -> {
            if (a instanceof Peixe) {
                ((Peixe) a).mover(5.0, 5.0, 5.0);
                a.desenhar();
                System.out.print(a);
            } else if (a instanceof Passaro) {
                ((Passaro) a).mover(5.0, 5.0, 5.0);
                a.desenhar();
                System.out.print(a);
            }
        });
    }
}
