package ru.sber.javaschool;

import ru.sber.javaschool.lesson3.Music;
import ru.sber.javaschool.lesson3.MusicPlayer;
import ru.sber.javaschool.lesson3.RapMusic;
import ru.sber.javaschool.lesson3.Winamp;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Music music = new RapMusic();
        MusicPlayer musicPlayer = new Winamp(music);
        System.out.println("Now play: " + musicPlayer.playMusic());
    }
}
