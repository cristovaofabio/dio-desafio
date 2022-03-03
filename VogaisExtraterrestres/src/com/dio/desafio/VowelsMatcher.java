package com.dio.desafio;


import java.util.Scanner;

public class VowelsMatcher {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String alfabeto;
        String frase;
        int count = 0;

        while (scr.hasNextLine()) {
            count = 0;
            alfabeto = scr.nextLine();
            frase = scr.nextLine();

            for (int i = 0; i < alfabeto.length() ; i++) {
                for (int j = 0; j < frase.length(); j++) {
                    if (frase.charAt(j) == alfabeto.charAt(i)) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}