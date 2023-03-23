package edu.dio;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;


public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("Audi"));
        queueCarros.add(new Carro("Jeep"));

        System.out.println(queueCarros.add(new Carro("BMW")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());



    }
}
