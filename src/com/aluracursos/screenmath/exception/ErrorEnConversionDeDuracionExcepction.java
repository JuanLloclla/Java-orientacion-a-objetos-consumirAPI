package com.aluracursos.screenmath.exception;

public class ErrorEnConversionDeDuracionExcepction extends RuntimeException {
    private String mensaje;
    public ErrorEnConversionDeDuracionExcepction(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
