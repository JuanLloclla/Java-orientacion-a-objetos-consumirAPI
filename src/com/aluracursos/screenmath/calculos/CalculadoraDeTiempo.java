package com.aluracursos.screenmath.calculos;

import com.aluracursos.screenmath.modelos.Titulo;

public class CalculadoraDeTiempo {
    // atributos
    private int tiempoTotal;

    // getter and setter
    public int getTiempoTotal() { return tiempoTotal; }

    // metodos
    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracionMinutos();
    }
}
