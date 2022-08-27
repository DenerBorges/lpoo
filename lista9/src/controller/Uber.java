package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Uber {

    public static void main(String[] args) {

        Usuario u = new Usuario(1L, "Matheus", "Silva", "982487263");
        Veiculo v = new Veiculo(1L, "Logan", "ISR-9264", 2016);
        Motorista m = new Motorista(1L, "Gabriel Nunes", "gabriel_nunes@hotmail.com", "901278246", v);

        Corrida c1 = new Corrida(1L, "Cartao", "Mater Card", new GregorianCalendar(2022, Calendar.AUGUST, 27, 10, 0), 20.00, u, m);
        Corrida c2 = new Corrida(2L, "Dinheiro", "Dinheiro vivo", new GregorianCalendar(2022, Calendar.APRIL, 7, 20, 30), 32.00, u, m);

        System.out.println("\n Corridas feitas (por usuario): ");
        u.getCorridas().add(c1);
        u.getCorridas().add(c2);
        u.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(u.getCorridas());

        System.out.println("\n Corridas feitas (por motorista): ");
        m.getCorridas().add(c1);
        m.getCorridas().add(c2);
        m.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(m.getCorridas());

        System.out.println("\n Valor total das corridas do motoriasta: ");
        double soma = 0.0;
        for (int i = 0; i < m.getCorridas().size(); i++) {
            soma += m.getCorridas().get(i).getPreco();
        }
        System.out.println(NumberFormat.getCurrencyInstance().format(soma));
    }
}
