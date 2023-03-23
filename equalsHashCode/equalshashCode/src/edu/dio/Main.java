package edu.dio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Audi").hashCode());

        Carro carro1 = new Carro ("Uno");
        Carro carro2 = new Carro ("500");

        System.out.println(carro1.equals(carro2));


    }
}
