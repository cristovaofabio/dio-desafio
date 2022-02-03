package com.dio.auxiliar;

import com.dio.classes.Gato;

import java.util.Comparator;

public class ComparadorDeNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        int resultadoComparacaoNome = gato1.getNome().compareToIgnoreCase(gato2.getNome());

        if (resultadoComparacaoNome!=0) return resultadoComparacaoNome;

        int resultadoComparacaoCor = gato1.getCor().compareToIgnoreCase(gato2.getCor());

        if(resultadoComparacaoCor!=0) return resultadoComparacaoCor;

        return Integer.compare(gato1.getIdade(),gato2.getIdade());
    }
}
