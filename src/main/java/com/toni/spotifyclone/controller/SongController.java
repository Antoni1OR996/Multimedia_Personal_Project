package com.toni.spotifyclone.controller;

import com.toni.spotifyclone.model.Song;
import com.toni.spotifyclone.service.SongService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controlador encargado de gestionar las peticiones HTTP
 * relacionado con las canciones
 *
 * @author Toni
 */

@RestController
@RequestMapping("/songs")
public class SongController{

    private final SongService songService;

    public SongController(SongService songService){
        this.songService = songService;
    }

    @GetMapping
    public List<Song> getSongs(){
        return songService.getSongs();
    }

    @GetMapping("/{id}")
    public Song getSong(@PathVariable Long id){
        return songService.getSongById(id);
    }

    @PostMapping
    public ResponseEntity<Song> createSong(@RequestBody Song song){

        Song createdSong = songService.createSong(song);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdSong);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Song> updateSong(@PathVariable Long id, @RequestBody Song updatedSong){

        Song song = songService.updateSong(id, updatedSong);

        return ResponseEntity.ok(song);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSong(@PathVariable Long id){
        songService.deleteSong(id);

        return ResponseEntity.noContent().build();
    }
}
