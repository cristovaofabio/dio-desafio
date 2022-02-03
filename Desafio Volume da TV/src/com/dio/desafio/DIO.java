package com.dio.desafio;

import java.util.Scanner;

public class DIO {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int V = leitor.nextInt();
        int T = leitor.nextInt();

        for(int quantidadeDeTrocas=0;quantidadeDeTrocas<T;quantidadeDeTrocas++){
            V= V+leitor.nextInt();

            if(V>100){
                V=100;
            }else if(V<0){
                V=0;
            }
        }

        System.out.println(V);
    }
}
