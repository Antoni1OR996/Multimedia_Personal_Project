package com.toni.spotifyclone.controller;

import com.toni.spotifyclone.model.Song;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {

    @GetMapping("/song")
    public Song getSong(){
        return new Song(
                1L,
                "Imagine",
                "Jhon Lenon"
        );
    }
}
