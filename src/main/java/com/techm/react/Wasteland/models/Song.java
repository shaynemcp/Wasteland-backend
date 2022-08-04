package com.techm.react.Wasteland.models;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @JoinColumn(name = "album")
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Album album;

    @Column(name = "artists")
    private String artists;

    @Column(name = "track")
    private int track;

    @Column(name = "track_length")
    private Time length;
}
