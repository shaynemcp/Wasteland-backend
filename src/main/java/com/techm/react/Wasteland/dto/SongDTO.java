package com.techm.react.Wasteland.dto;

import com.techm.react.Wasteland.models.Album;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SongDTO {

    private String title;
    private AlbumDTO album;
    private String artists;
    private int track;
    private Time length;


}
