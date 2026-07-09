package com.toni.spotifyclone.exception;

/**
 * Excepción lanzada cuando no encuentra una
 * canción con el identificador indicado
 *
 * @author Toni
 */
public class SongNotFoundException extends RuntimeException {

    public SongNotFoundException(Long id) {
        super("Canción con " + id + " no encontrada");
    }

}
