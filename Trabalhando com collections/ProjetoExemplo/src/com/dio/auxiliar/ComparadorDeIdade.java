package com.dio.auxiliar;

import com.dio.classes.Gato;

import java.util.Comparator;

public class ComparadorDeIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(),gato2.getIdade());
    }
}
