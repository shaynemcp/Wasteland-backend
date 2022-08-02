package com.techm.react.Wasteland.service;

import com.sun.xml.bind.v2.TODO;
import com.techm.react.Wasteland.dto.AlbumDTO;
import com.techm.react.Wasteland.models.Album;
import com.techm.react.Wasteland.repository.AlbumRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@Service
public class AlbumService implements AlbumServiceInterface{
    @Autowired
    AlbumRepo albumRepo;
    @Autowired
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
