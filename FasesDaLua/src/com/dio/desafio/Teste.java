package com.dio.desafio;

import java.util.Scanner;

/*
* Se a porção visível da lua no momento estiver entre 0 e 2%, por exemplo, é lua nova,
* se for entre 3 e 96% é lua crescente,
* se for entre 97 e 100% é lua cheia e
* se for entre 96 e 3% (diminuindo) é lua minguante.
* */

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int inicio = leitor.nextInt();
        int fim = leitor.nextInt();

        if (inicio >= 0 && fim <= 2) {
            System.out.println("nova");
        }else if(fim>96 || inicio > 96) {
            if(fim>96 && inicio>96){
                System.out.println("cheia");
            }
            else if(fim < inicio){
                System.out.println("minguante");
            }else{
                System.out.println("cheia");
            }
        }else {
            if(fim<inicio){
                System.out.println("minguante");
            }else{
                System.out.println("crescente");
            }
        }
    }
}
