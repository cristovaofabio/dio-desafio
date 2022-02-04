package com.dio.desafio;

import java.io.IOException;
import java.util.Scanner;

public class DIO  {
    public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int somaDasPorcoes=0;

        for (int porcao:porcoes) {
            somaDasPorcoes = somaDasPorcoes + porcao * leitor.nextInt();
        }

        System.out.println(somaDasPorcoes=somaDasPorcoes+225);

    }
}
