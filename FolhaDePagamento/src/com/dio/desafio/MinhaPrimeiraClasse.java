package com.dio.desafio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int hours = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double paymentPerHour = Double.parseDouble(st.nextToken());

        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f%n", (paymentPerHour * hours));

    }
}
