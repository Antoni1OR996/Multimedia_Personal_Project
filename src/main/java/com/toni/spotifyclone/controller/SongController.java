package com.toni.spotifyclone.controller;

import com.toni.spotifyclone.model.Song;
import com.toni.spotifyclone.service.SongService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

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
}
