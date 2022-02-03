package com.dio;

import com.dio.classes.Pais;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Double> notas = new ArrayList<Double>();
//
//        notas.add(7.5);
//        notas.add(8d);
//        notas.add(5.8);
//        notas.add(6.0);
//        notas.add(9d);
//        notas.add(10.0);
//
//        System.out.println("Notas: "+notas);
//        System.out.println("Posição da nota 6.0: "+notas.indexOf(6d));
//        notas.set(2,10.0);
//
//        for (Double nota:notas) {
//            System.out.println(nota);
//        }
//
//        System.out.println("Menor nota: "+ Collections.min(notas));
//        System.out.println("Maior nota: "+ Collections.max(notas));

//        List<Gato> gatos = new ArrayList<>();
//        gatos.add(new Gato("Fifi",4,"branco"));
//        gatos.add(new Gato("Lulu",6,"preto"));
//        gatos.add(new Gato("Fifi",2,"marrom"));
//
//        //Collections.sort(gatos,new ComparadorDeIdade());
//        //gatos.sort(new ComparadorDeIdade());
//        //gatos.sort(new ComparadorDeCor());
//        gatos.sort(new ComparadorDeNomeCorIdade());
//        System.out.println(gatos);

//        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,7.0,3.6));
//        System.out.println(notas.toString());
//        System.out.println(notas.contains(8.5));
//        System.out.println("Menor nota: "+Collections.min(notas));
//
//        Set<Double> notasOrdenadas = new TreeSet<>(notas);
//        System.out.println(notasOrdenadas);

//        Set<Filme> filmes = new LinkedHashSet<>();
//        filmes.add(new Filme("Kung Pow","Comédia",2));
//        filmes.add(new Filme("Velozes e furiosos","Ação",3));
//        filmes.add(new Filme("Perdido em Marte","Ficção científica",2));
//
//        for (Filme filme:filmes) {
//            System.out.println(filme.getNome()+" - "+filme.getGenero()+" - "+filme.getDurancao()+"h");
//        }
//
//        System.out.println("");
//        Set<Filme> filmesOrdenados = new TreeSet<>(filmes);
//
//        for (Filme filme:filmesOrdenados) {
//            System.out.println(filme.getNome()+" - "+filme.getGenero()+" - "+filme.getDurancao()+"h");
//        }

//        Map<String, Integer> pessoas = new HashMap<>();
//
//        pessoas.put("João", 20);
//        pessoas.put("Francisca", 45);
//        pessoas.put("José", 51);
//        pessoas.put("Maria", 26);
//
//        System.out.println(pessoas);
//
//        pessoas.put("José", 53);
//
//        System.out.println(pessoas);
//
//        Set<String> nomes = pessoas.keySet();
//        Collection<Integer> idades = pessoas.values();
//
//        System.out.println("Nomes: " + nomes);
//        System.out.println("Idades: " + idades);
//
//        Integer idadeMaisAvancada = Collections.max(pessoas.values());
//
//        System.out.println(idadeMaisAvancada);
//
//        Set<Map.Entry<String, Integer>> entries = pessoas.entrySet();
//        String pessoaMaisVelha = "";
//
//        for (Map.Entry<String, Integer> entry : entries) {
//            if (entry.getValue().equals(idadeMaisAvancada)) {
//                pessoaMaisVelha = entry.getKey();
//            }
//        }
//
//        System.out.println("Pessoa mais velha: "+pessoaMaisVelha);
//
//        Map<String, Integer> pessoasPorOrdemAlfabetica = new TreeMap<>(pessoas);
//
//        System.out.println(pessoasPorOrdemAlfabetica);

//        Map<String, Pais> paises = new HashMap<>();
//        paises.put("Moscou",new Pais("Russia","russo"));
//        paises.put("Berlim",new Pais("Alemanha","alemão"));
//        paises.put("Buenos Aires",new Pais("Argentina","espanhol"));
//        paises.put("Tóquio",new Pais("Japão","japonês"));
//        paises.put("Sydney",new Pais("Austrália","inglês"));
//
//        for(Map.Entry<String, Pais> pais: paises.entrySet()){
//            System.out.println(pais.getKey()+" - "+pais.getValue());
//        }

        List<String> listaDeNumeros = Arrays.asList("1","0","4","2","9");
        listaDeNumeros.forEach(s-> {
            System.out.println(s);
        });

        List<Integer> paresMaioresDoQue2 = listaDeNumeros.stream()
                .map(Integer::parseInt)
                .filter( numero-> {return (numero%2==0 && numero>2);}
                ).collect(Collectors.toList());

        System.out.println(paresMaioresDoQue2);
    }


}
