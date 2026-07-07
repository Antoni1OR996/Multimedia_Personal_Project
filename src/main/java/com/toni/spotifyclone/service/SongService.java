package com.toni.spotifyclone.service;

import com.toni.spotifyclone.model.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Servicio encargado de gestionar las canciones
 *
 * Aqui residira la lógica de negocio relacionada
 * con las canciones
 *
 * @author Toni
 */

@Service
public class SongService {

    /**
     *
     * Obtiene todas las canciones disponibles
     *
     * @return lista de todas las canciones
     */

    public List<Song> getSongs() {

        List<Song> songs = new ArrayList<>();

        return songs;
    }
}
