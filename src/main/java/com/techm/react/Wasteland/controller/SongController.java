package com.techm.react.Wasteland.controller;

import com.techm.react.Wasteland.dto.SongDTO;
import com.techm.react.Wasteland.models.Song;
import com.techm.react.Wasteland.service.SongService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(originPatterns = "*", exposedHeaders = "*", allowedHeaders = "*")
public class SongController {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    SongService songService;

    @GetMapping("/songs/")
    public ResponseEntity<?> findAllSongs() {
        List<SongDTO> songs = songService.findAllSongs();
        return ResponseEntity.ok().body(songs);
    }
}
