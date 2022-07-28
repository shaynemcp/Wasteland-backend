package com.techm.react.Wasteland.service;

import com.techm.react.Wasteland.models.Song;
import com.techm.react.Wasteland.repository.SongRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SongService {
    @Autowired
    SongRepo songRepo;

//    @Autowired
//    private ModelMapper modelMapper;

    public List<Song> findAllSongs() {

        List<Song> allSongs = songRepo.findAll();

        return allSongs;
    }
}
