package com.toni.spotifyclone.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Controla de forma global las exepciones de la aplicación
 *
 * @author Toni
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Maneja la excepción creada al no encontrar una canción por
     * su identificador
     *
     * @param exception
     * @return status 404 y mensaje excepción
     */

    @ExceptionHandler(SongNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleSongNotFound(SongNotFoundException exception){

        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage()
        );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(errorResponse);
    }
}
