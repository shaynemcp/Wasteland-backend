package com.techm.react.Wasteland.service;

import com.sun.xml.bind.v2.TODO;
import com.techm.react.Wasteland.dto.AlbumDTO;
import com.techm.react.Wasteland.models.Album;
import com.techm.react.Wasteland.repository.AlbumRepo;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AlbumService implements AlbumServiceInterface{
    AlbumRepo albumRepo;
    private ModelMapper modelMapper;

    public List<AlbumDTO> findAllAlbums() {
        List<AlbumDTO> albumDTOS = new ArrayList<>();

        List<Album> albums = albumRepo.findAll();

        for(Album a: albums) {
            albumDTOS.add(modelMapper.map(a, AlbumDTO.class));
        }
        return albumDTOS;
    }

    //TODO: findByArtist() implementation
    public List<AlbumDTO> findByArtist() {
        List<AlbumDTO> albumDTOS = new ArrayList<>();

        List<Album> albums = albumRepo.findAll();

        // if artists are equal perform next operation below
        for(Album a: albums) {
            albumDTOS.add(modelMapper.map(a, AlbumDTO.class));
        }

        return albumDTOS;
    }
}
