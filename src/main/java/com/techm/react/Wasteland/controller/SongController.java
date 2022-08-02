package com.techm.react.Wasteland.controller;

import com.techm.react.Wasteland.dto.SongDTO;
import com.techm.react.Wasteland.service.SongService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    SongService songService;

    @GetMapping("/songs/")
    public ResponseEntity<?> findAllSongs() {
        List<SongDTO> songs = songService.findAllSongs();
        for (SongDTO song : songs) {
            songs.add(modelMapper.map(song, SongDTO.class));
        }
        return ResponseEntity.ok().body(songs);
    }
}
