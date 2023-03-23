package edu.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Fiat"));
        stackCarros.push(new Carro("Audi"));
        stackCarros.push(new Carro("Jeep"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());



    }
}
