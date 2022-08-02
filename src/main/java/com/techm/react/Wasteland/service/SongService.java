package com.techm.react.Wasteland.service;

import com.techm.react.Wasteland.dto.SongDTO;
import com.techm.react.Wasteland.models.Song;
import com.techm.react.Wasteland.repository.SongRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SongService implements SongServiceInterface{
    @Autowired
    SongRepo songRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<SongDTO> findAllSongs() {

        List<SongDTO> songDTOS = new ArrayList<>();

        List<Song> songs = songRepo.findAll();
        for(Song s: songs) {
            songDTOS.add(modelMapper.map(s, SongDTO.class));
        }

        return songDTOS;
    }

    public SongDTO getSongByTitle(String title) throws NoSuchFieldException {
        SongDTO song = new SongDTO();
        if(title == song.getTitle()){
            return song;
        }
        else throw new NoSuchFieldException("The song by that title does not exist");
    }

    public SongDTO findByTrack(int track) {
        SongDTO song = new SongDTO();
        if(song.getTrack() == track) {
            return song;
        }
        return null;
    }



}
