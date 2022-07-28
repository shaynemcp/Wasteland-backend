package com.techm.react.Wasteland.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Time;

@Entity
@Table(name = "song")
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString

public class Song {

    @Column(name = "title")
    private String title;

    @Column(name = "album")
    private String album;

    @Column(name = "artists")
    private String artists;

    @Column(name = "track")
    private int track;

    @Column(name = "track_length")
    private Time length;

    @ManyToOne
    private Album albs;

}
