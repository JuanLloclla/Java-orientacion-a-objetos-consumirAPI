package com.aluracursos.screenmath.modelos;

import com.aluracursos.screenmath.exception.ErrorEnConversionDeDuracionExcepction;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    // atributos
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    // constructor
    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if(miTituloOmdb.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionExcepction("No pude convertir la duración por que contiene un N/A");
        }
        this.duracionMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ",""));
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isIncluidoPlan() {
        return incluidoPlan;
    }
    public void setIncluidoPlan(boolean incluidoPlan) {
        this.incluidoPlan = incluidoPlan;
    }

    public double getSumaEvaluaciones() {
        return sumaEvaluaciones;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    // metodos
    public void muestraFichaTecnica(){
        System.out.println("El nombre de la película es: " +nombre);
        System.out.println("Su fecha de lanzamiento es: " +fechaLanzamiento);
        System.out.println("Duración en minutos: " +getDuracionMinutos());
    }

    public void evalua(double nota){
        sumaEvaluaciones+=nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre=" + nombre +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", duracion=" + duracionMinutos+ ")";
    }
}
