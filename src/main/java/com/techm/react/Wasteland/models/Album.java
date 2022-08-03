package com.techm.react.Wasteland.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "album")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="album_title")
    private String title;

    @Column(name="album_artist")
    private String artists;

    @Column(name = "tracks")
    private int tracks;

    @Column(name = "album_length")
    private Time length;
}
