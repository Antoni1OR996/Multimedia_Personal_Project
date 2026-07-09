package com.toni.spotifyclone.exception;

/**
 * Representa la respuesta de error que devuelve la API
 *
 * @author Toni
 */
public class ErrorResponse {

    /**
     * Código de estado HTTP
     */
    private int status;

    /**
     * Mensaje de código error
     */
    private String message;

    /**
     * Constructor
     *
     * @param status código HTTP
     * @param message descripción del error
     */
    public ErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage(){
        return message;
    }
}
