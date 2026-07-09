package com.toni.spotifyclone.service;

import com.toni.spotifyclone.model.Song;
import org.springframework.stereotype.Service;
import com.toni.spotifyclone.exception.SongNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio encargado de gestionar las canciones.
 *
 * Contiene la lógica de negocio relacionada con las canciones
 * y mantiene un listado de las canciones disponibles.
 *
 * @author Toni
 */
@Service
public class SongService {
    /**
     *Lista de canciones almacenada en memoria
     */

    private final List<Song> songs;

    /**
     * Constructor del servicio.
     *
     * Se ejecuta una única vez cuando Spring crea el Bean
     * SongService al arrancar la aplicación.
     */

    public SongService(){

        songs = new ArrayList<>();

        songs.add(new Song(
                1L,
                "The Trooper",
                "Iron Maiden"
        ));

        songs.add(new Song(
                2L,
                "Nothing Else Matters",
                "Metallica"
        ));

        songs.add(new Song(
                3L,
                "Fear of the Dark",
                "Iron Maiden"
        ));

    }

    /**
     * Devuelve todas las canciones disponibles
     *
     * @return lista de canciones
     */
    public List<Song> getSongs() {
        return songs;
    }

    /**
     * Realiza una búsqueda de una canción por su identificador
     *
     * @param id identificador de la canción
     * @return la canción buscada o null si no existe
     */
    public Song getSongById(Long id) {

        for(Song song : songs){
            if(song.getId().equals(id)){
                return song;
            }
        }
            throw new SongNotFoundException(id);
    }

}
