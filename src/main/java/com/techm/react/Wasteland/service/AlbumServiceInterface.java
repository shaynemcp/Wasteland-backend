package com.techm.react.Wasteland.service;

import com.techm.react.Wasteland.models.Album;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface AlbumServiceInterface {
    List<Album> findAllAlbums();
}
