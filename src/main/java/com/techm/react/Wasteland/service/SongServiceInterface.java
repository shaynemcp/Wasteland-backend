package com.techm.react.Wasteland.service;

import com.techm.react.Wasteland.dto.SongDTO;
import com.techm.react.Wasteland.models.Song;

import java.util.List;

public interface SongServiceInterface {
    List<SongDTO> findAllSongs();

    SongDTO getSongByTitle(String title) throws NoSuchFieldException;
}
