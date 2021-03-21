package ru.sber.javaschool.lesson3;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;
import lombok.Value;

import java.util.Random;

@Value
public class Winamp implements MusicPlayer{
    Music music;
    String name;
    String version;

    {
        name = "Winamp music player";
        version = "2.90";
    }
    public Winamp(Music music) {
        this.music = music;
    }

    @Override
    public String playMusic() {
        Random random = new Random();
        String[] songs = music.getSongs();
        int index = random.nextInt(songs.length);
        return songs[index];
    }
}
