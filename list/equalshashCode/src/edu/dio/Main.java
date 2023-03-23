package edu.dio;

import java.util.*;



public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Audi"));
        listCarros.add(new Carro("Jeep"));
        listCarros.add(new Carro("BMW"));

        System.out.println(listCarros.contains(new Carro("Fiat")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Jeep")));

        System.out.println(listCarros.remove(3));
        System.out.println(listCarros);





    }
}
