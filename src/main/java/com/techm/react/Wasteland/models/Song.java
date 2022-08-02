package com.techm.react.Wasteland.models;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "song")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
public class Song {

    @Id
    @GeneratedValue
    int id;

    @Column(name = "title")
    private String title;

    @Column(name = "album")
    private Album album;

    @Column(name = "artists")
    private String artists;

    @Column(name = "track")
    private int track;

    @Column(name = "track_length")
    private Time length;

//    @ManyToOne
//    private Album albs;

}
