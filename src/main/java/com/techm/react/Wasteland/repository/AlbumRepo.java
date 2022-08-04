package com.techm.react.Wasteland.repository;

import com.techm.react.Wasteland.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AlbumRepo extends JpaRepository<Album, Integer> {

    public abstract List<Album> findByArtist(String artist);

    public abstract List<Album> findAll();
}
