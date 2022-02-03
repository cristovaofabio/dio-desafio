package com.dio.auxiliar;

import com.dio.classes.Gato;

import java.util.Comparator;

public class ComparadorDeCor implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}
