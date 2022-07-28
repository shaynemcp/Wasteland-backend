package com.techm.react.Wasteland.repository;

import com.techm.react.Wasteland.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<Song, Integer> {
}
