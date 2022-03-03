package com.desafio;

import java.io.IOException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();

        int elementsBiggerThanHeight = 0;

        if (A > H) elementsBiggerThanHeight++;
        if (B > H) elementsBiggerThanHeight++;
        if (C > H) elementsBiggerThanHeight++;

        if (elementsBiggerThanHeight >= 2) System.out.println("N");
        else System.out.println("S");
    }
}
