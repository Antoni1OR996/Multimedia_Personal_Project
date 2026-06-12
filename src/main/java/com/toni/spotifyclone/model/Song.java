package com.toni.spotifyclone.model;

public class Song {

    private Long id;
    private String titulo;
    private String artista;

    public Song(Long id, String titulo, String artista) {
        this.id = id;
        this.titulo = titulo;
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

