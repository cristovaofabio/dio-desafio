package dio.desafio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        int size = 12;
        double[][] M = new double[size][size];

        for (int line = 0; line < M.length; line++) {
            for (int column = 0; column < M[line].length; column++) {
                M[line][column] = leitor.nextDouble();
                if (line + column <= size - 2) {
                    soma += M[line][column];
                }
            }
        }

        if (O == 'M') soma /= ((M.length * M.length) - size) / 2.0; // 66
        System.out.printf("%.1f%n", soma);
    }
}
