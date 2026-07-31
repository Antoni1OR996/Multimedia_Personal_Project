package com.toni.spotifyclone.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.toni.spotifyclone.model.Song;


public interface SongRepository extends MongoRepository<Song,String> {
}
