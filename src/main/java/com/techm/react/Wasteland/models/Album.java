package com.techm.react.Wasteland.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "album")
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString

public class Album {

    @Column(name="album_title")
    private String title;

    @Column(name="album_artist")
    private String artists;

    @Column(name = "tracks")
    private int tracks;

    @Column(name = "album_length")
    private Time length;

}
