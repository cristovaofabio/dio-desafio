package com.dio.desafio;

import java.io.IOException;
import java.util.Scanner;

public class URI  {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int numAlunos = leitor.nextInt();
        int numPc = leitor.nextInt();
        int qtsPcsQuebrados = leitor.nextInt();
        int qtsPcsSemComp = leitor.nextInt();

        if (numAlunos<(numPc-qtsPcsQuebrados-qtsPcsSemComp)) {
            System.out.println("Igor feliz");
        } else {
            if (qtsPcsQuebrados>(qtsPcsSemComp/2))
                System.out.println("Caio, a culpa eh sua!");
            else
                System.out.println("Igor bolado!");
        }
    }

}
