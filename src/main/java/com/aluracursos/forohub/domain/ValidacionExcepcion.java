package com.aluracursos.forohub.domain;

public class ValidacionExcepcion extends RuntimeException {

    private final String codigoError;

    public ValidacionExcepcion(String mensaje) {
        super(mensaje);
        this.codigoError = null; // Sin código de error
    }

    public ValidacionExcepcion(String mensaje, Throwable causa) {
        super(mensaje, causa);
        this.codigoError = null; // Sin código de error
    }

    public ValidacionExcepcion(String mensaje, String codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }

    public ValidacionExcepcion(String mensaje, String codigoError, Throwable causa) {
        super(mensaje, causa);
        this.codigoError = codigoError;
    }

    public String getCodigoError() {
        return codigoError;
    }
}
