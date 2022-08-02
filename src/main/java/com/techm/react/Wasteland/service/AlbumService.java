package com.techm.react.Wasteland.service;

import com.techm.react.Wasteland.dto.AlbumDTO;
import com.techm.react.Wasteland.models.Album;
import com.techm.react.Wasteland.repository.AlbumRepo;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

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
}
