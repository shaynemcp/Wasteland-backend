package com.techm.react.Wasteland.repository;

import com.techm.react.Wasteland.models.Album;
import com.techm.react.Wasteland.models.Song;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class SongRepoTest {

    @Autowired
    SongRepo songRepo;

    @InjectMocks
    Song songs;

    @Mock
    SongRepo songRepo1;



    @Test
    void  test_findAllPositive(){


        List<Song> actual = songRepo1.findAll();

        Album album = new Album(1,"Wasteland","Brent Faiyaz", 19,Time.valueOf("59:00"));

        Song song1 = new Song(1,"Angel", album, album.getArtists(), 19, album.getLength());
        Song song2 = new Song(2, "All Mine", album, album.getArtists(), 6, album.getLength());
        Song song3 = new Song(3, "Addictions", album, album.getArtists(), 14, album.getLength());

        List<Song> expected = new ArrayList<>();
        expected.add(song1);
        expected.add(song2);
        expected.add(song3);

        Assertions.assertEquals(expected, actual);

    }
}
