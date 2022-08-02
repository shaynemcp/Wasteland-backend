package com.techm.react.Wasteland.controller;

import com.techm.react.Wasteland.dto.AlbumDTO;
import com.techm.react.Wasteland.service.AlbumService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class AlbumController {

    ModelMapper modelMapper;
    AlbumService albumService;

    @GetMapping("/albums/")
    public ResponseEntity<?> findAllSongs() {
        List<AlbumDTO> albums = albumService.findAllAlbums();
        for (AlbumDTO album : albums) {
            albums.add(modelMapper.map(album, AlbumDTO.class));
        }
        return ResponseEntity.ok().body(albums  );
    }
}
