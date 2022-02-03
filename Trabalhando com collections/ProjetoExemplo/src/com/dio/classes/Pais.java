package com.dio.classes;

import java.util.Objects;

public class Pais {
    private String nome;
    private String idiomaOficial;

    public Pais(String nome, String idiomaOficial) {
        this.nome = nome;
        this.idiomaOficial = idiomaOficial;
    }

    public String getNome() {
        return nome;
    }

    public String getIdiomaOficial() {
        return idiomaOficial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nome, pais.nome) && Objects.equals(idiomaOficial, pais.idiomaOficial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idiomaOficial);
    }

    @Override
    public String toString() {
        return "[" +
                "nome do páis='" + nome + '\'' +
                ", idioma oficial='" + idiomaOficial + '\'' +
                ']';
    }
}
