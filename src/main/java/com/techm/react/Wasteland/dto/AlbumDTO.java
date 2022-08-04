package com.techm.react.Wasteland.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlbumDTO {

    private String title;
    private String artists;
    private int tracks;
    private Time length;

}
