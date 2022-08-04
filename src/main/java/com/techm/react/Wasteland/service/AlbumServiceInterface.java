package com.techm.react.Wasteland.service;

import com.techm.react.Wasteland.dto.AlbumDTO;
import com.techm.react.Wasteland.models.Album;

import java.util.List;

public interface AlbumServiceInterface {
    List<AlbumDTO> findAllAlbums();
}
