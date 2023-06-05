package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(8);
        Filme filme1 = new Filme("Avengers", 2012);
        filme1.avalia(9);
        filme1.avalia(8);
        filme1.avalia(10);
        Filme filme2 = new Filme("Iron Man", 2008);
        filme2.avalia(9);
        filme2.avalia(9);
        filme2.avalia(10);
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(10);
        outro.avalia(10);
        outro.avalia(10);


        Serie serie = new Serie("La Casa de Papel", 2017);
        Serie lost = new Serie("Lost", 2022);

        List<Titulo> lista = new LinkedList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Keanu Reeves");
        buscaPorArtista.add("Robert Downey Jr");
        buscaPorArtista.add("Scarlett Johansson");
        Collections.sort(buscaPorArtista);
        System.out.println("Busca artista ordenado:");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Busca filme ordenado:");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Busca filme ordenado por ano:");
        System.out.println(lista);
    }
}
