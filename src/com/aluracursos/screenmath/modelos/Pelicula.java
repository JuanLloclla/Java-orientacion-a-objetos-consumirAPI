package com.aluracursos.screenmath.modelos;

import com.aluracursos.screenmath.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    // atributos
    private String director;

    // constructor
    public Pelicula(String nombre, int fechaLanzamiento){
        super(nombre, fechaLanzamiento);
    }

    //getter and setter
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);
    }

    @Override
    public String toString() {
        return "Pelicula: " +getNombre() + " (" +getFechaLanzamiento() + ")";
    }
}
