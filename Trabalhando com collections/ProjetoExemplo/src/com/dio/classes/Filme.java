package com.dio.classes;

import java.util.Objects;

public class Filme implements Comparable<Filme>{
    private String nome;
    private String genero;
    private int durancao;

    public Filme(String nome, String genero, int durancao) {
        this.nome = nome;
        this.genero = genero;
        this.durancao = durancao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getDurancao() {
        return durancao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", durancao=" + durancao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return durancao == filme.durancao && Objects.equals(nome, filme.nome) && Objects.equals(genero, filme.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, durancao);
    }

    @Override
    public int compareTo(Filme filmeInformado) {
        int comparadorGenero = this.getGenero().compareToIgnoreCase(filmeInformado.getGenero());
        int comparadorDuracao = Integer.compare(this.getDurancao(),filmeInformado.getDurancao());

        if(comparadorDuracao!=0) return comparadorDuracao;

        return comparadorGenero;
    }
}
