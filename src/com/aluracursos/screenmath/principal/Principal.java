package com.aluracursos.screenmath.principal;

import com.aluracursos.screenmath.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmath.calculos.FiltroRecomendacion;
import com.aluracursos.screenmath.modelos.Episodio;
import com.aluracursos.screenmath.modelos.Pelicula;
import com.aluracursos.screenmath.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragón", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosEpisodio(50);
        casaDragon.setEpisodiosTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones: " +calculadora.getTiempoTotal()+ " minutos");

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.Filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtro.Filtro(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " +listaDePeliculas.size());
        System.out.println("La primera pelicula es: " +listaDePeliculas.getFirst().getNombre());

        System.out.println(listaDePeliculas);
        System.out.println("toString de la pelicula: " +listaDePeliculas.getFirst().toString());

    }
}
