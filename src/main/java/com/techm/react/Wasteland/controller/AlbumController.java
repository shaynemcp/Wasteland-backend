package com.techm.react.Wasteland.controller;

import com.techm.react.Wasteland.dto.AlbumDTO;
import com.techm.react.Wasteland.models.Album;
import com.techm.react.Wasteland.service.AlbumService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin(originPatterns = "*", exposedHeaders = "*", allowedHeaders = "*")
public class AlbumController {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    AlbumService albumService;

    @GetMapping("/albums/")
    public ResponseEntity<?> findAllSongs() {
        List<AlbumDTO> albums = albumService.findAllAlbums();
        return ResponseEntity.ok().body(albums);
    }
}
