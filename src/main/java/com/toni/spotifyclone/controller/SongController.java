package com.toni.spotifyclone.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.toni.spotifyclone.model.Song;
import com.toni.spotifyclone.service.SongService;

/**
 * Controlador REST encargado de gestionar las peticiones HTTP
 * relacionadas con las canciones.
 *
 * @author Toni
 */

@RestController
@RequestMapping("/songs")
public class SongController{

    private final SongService songService;

    /**
     * Constructor único del SongController.
     *
     * @param songService servicio encargado de gestionar las canciones.
     */
    public SongController(SongService songService){
        this.songService = songService;
    }

    /**
     * Obtiene todas las canciones.
     *
     * @return lista de canciones.
     */
    @GetMapping
    public List<Song> getSongs(){
        return songService.getSongs();
    }

    /**
     * Obtiene una cancion mediante su identificador.
     *
     * @param id identificador único de la canción.
     * @return canción encontrada.
     */
    @GetMapping("/{id}")
    public Song getSongById(@PathVariable String id){
        return songService.getSongById(id);
    }

    /**
     * Crea una canción nueva.
     *
     * @param song cancion a añadir.
     * @return respuesta HTTP.
     */
    @PostMapping
    public ResponseEntity<Song> createSong(@RequestBody Song song){

        Song createdSong = songService.createSong(song);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdSong);
    }

    /**
     * Modifica los datos de una canción encontrada mediante su identificador.
     *
     * @param id identificador único de la canción.
     * @param updatedSong canción a modificar.
     * @return respuesta HTTP.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Song> updateSong(@PathVariable String id, @RequestBody Song updatedSong){

        Song song = songService.updateSong(id, updatedSong);

        return ResponseEntity.ok(song);
    }

    /**
     * Elimina una canción encontrada mediante su identificador.
     *
     * @param id identificador único de la canción.
     * @return respuesta HTTP.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSong(@PathVariable String id){
        songService.deleteSong(id);

        return ResponseEntity.noContent().build();
    }
}
