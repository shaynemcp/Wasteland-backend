package com.techm.react.Wasteland.repository;

import com.techm.react.Wasteland.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepo extends JpaRepository<Song, Integer> {

    public abstract List<Song> findAll();

    public abstract List<Song> findByArtist();

    public abstract Song findByTrack();
}
