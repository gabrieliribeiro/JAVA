package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Avengers", 2012);
        filme1.setDuracaoMinutos(120);

        Filme filme2 = new Filme("Iron Man", 2008);
        filme2.setDuracaoMinutos(160);

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1. avalia(9);
        filme1.avalia(10);
        System.out.println(filme1.getTotalAvaliacoes());
        System.out.println(filme1.pegaMedia());

        Serie lost = new Serie("Lost", 2022);
        lost.setTemporadas(4);
        lost.setEpisodiosTemporada(10);
        lost.setMinutosPorEpisodio(20);
        lost.exibeFichaTecnica();
        System.out.println("Duração série:" + lost.getDuracaoMinutos());

        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme("John Wick", 2014);
        outro.setDuracaoMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosTemporada(10);
        serie.setMinutosPorEpisodio(45);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(outro);
        calculadora.inclui(favorito);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);


    }
}