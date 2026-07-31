package com.toni.spotifyclone.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

/**
 * Representa una canción dentro de la aplicación.
 *
 * Una canción contiene un identificador único,
 * un título y el nombre del artista.
 *
 * @author Toni
 */
@Document(collection = "songs")
public class Song {

    /**
     * Identificador único de cada canción.
     */
    @Id
    private String id;
    /**
     * Título de la canción.
     */
    private String titulo;
    /**
     * Nombre del artista.
     */
    private String artista;

    /**
     * Constructor de la canción
     *
     * @param id identificador único.
     * @param titulo título de la canción.
     * @param artista artista de la canción.
     */
    public Song(String id, String titulo, String artista) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
    }

    /**
     * Constructor vacío necesario para que Jackson pueda
     * crear objetos Song a partir de peticiones HTTP.
     */

    public Song() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getId() {
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getArtista(){
        return artista;
    }
}

