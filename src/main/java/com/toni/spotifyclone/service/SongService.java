package com.toni.spotifyclone.service;

import com.toni.spotifyclone.model.Song;
import com.toni.spotifyclone.repository.SongRepository;

import org.springframework.stereotype.Service;
import com.toni.spotifyclone.exception.SongNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
     *Lista de canciones almacenada en memoria.
     */

    private final SongRepository songRepository;


    /**
     * Constructor del servicio.
     *
     * Se ejecuta una única vez cuando Spring crea el Bean
     * SongService al arrancar la aplicación.
     */

    public SongService(SongRepository songRepository) {

        this.songRepository = songRepository;

    }

    /**
     * Devuelve todas las canciones disponibles.
     *
     * @return lista de canciones.
     */
    public List<Song> getSongs() {
        return songRepository.findAll();
    }

    /**
     * Realiza una búsqueda de una canción por su identificador.
     *
     * @param id identificador de la canción.
     * @return canción encontrada.
     * @throws SongNotFoundException si no existe una canción con ese identificador.
     */
    public Song getSongById(String id) {

        Optional<Song> song = songRepository.findById(id);

        if (song.isPresent()) {
            return song.get();
        }
        throw new SongNotFoundException(id);
    }

    /**
     * Crea una nueva canción y la añade a la colección.
     *
     * @param song canción recibida desde el cliente.
     * @return canción creada.
     */
    public Song createSong(Song song) {

        return songRepository.save(song);
    }

    /**
     * Modifica los datos de una canción encontrado mediante su id.
     *
     * @param id Identificador de la canción.
     * @param updatedSong cancion con los nuevos datos.
     * @return cancion modificada.
     */

    public Song updateSong(String id, Song updatedSong) {

        Song song = getSongById(id);

        song.setTitulo(updatedSong.getTitulo());
        song.setArtista(updatedSong.getArtista());

        return songRepository.save(song);
    }

    /**
     * Elimina una canción encontrado mediante su id.
     *
     * @param id Identificador de la canción.
     */

    public void deleteSong(String id){

        Song song = getSongById(id);

        songRepository.delete(song);
    }


}
