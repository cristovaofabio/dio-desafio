package com.desafio;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double volumn, diameter, radius, area, height;

        while (leitor.hasNext()) {
            volumn = leitor.nextDouble();
            diameter = leitor.nextDouble();
            radius = diameter / 2;
            area = 3.14 * radius * radius;
            height = volumn / area;
            System.out.println("ALTURA = " + df.format(height));
            System.out.println("AREA = " + df.format(area));
        }
    }

}
