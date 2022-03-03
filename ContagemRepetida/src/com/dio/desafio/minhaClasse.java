package com.dio.desafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class minhaClasse {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int values = scr.nextInt();
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < values; i++) {
            int number = scr.nextInt();

            if (numbers.containsKey(number)) {
                int count = numbers.get(number) + 1;
                numbers.put(number, count);
            } else {
                numbers.put(number, 1);
            }
        }

        numbers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }
}
