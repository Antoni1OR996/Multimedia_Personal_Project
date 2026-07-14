package com.toni.spotifyclone.model;

/**
 * Representa una canción dentro de la aplicación
 *
 * Una canción contiene un identificador único,
 * un título y el nombre del artista
 *
 * @author Toni
 */
public class Song {

    private Long id;
    private String titulo;
    private String artista;

    /**
     * Constructor de la canción
     *
     * @param id identificador único
     * @param titulo título de la canción
     * @param artista artista de la canción
     */
    public Song(Long id, String titulo, String artista) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
    }

    /**
     * Constructor vacio para las request http post
     */

    public Song() {}

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getArtista(){
        return artista;
    }
}

