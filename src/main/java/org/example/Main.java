package org.example;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int x = 10;

        System.out.println("A soma dos múltiplos de 3 ou 5 até " + x + " é: " + calculaSomaMultiplos(x));
    }

    /**
     * o metodo cria um stream de inteiros (de 1 por 1 ate x)
     * e filtramos apenas os numeros que sao multiplos de 3 ou 5,
     * depois usamos o metodo sum() para somar estes valores
     */
    public static int calculaSomaMultiplos(int x) {
        return IntStream.range(1, x)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }
}