package ru.sber.javaschool.lesson3;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class WinampTest {

    @Mock
    Music music;
    @InjectMocks
    Winamp musicPlayer;

    @Test
    public void playMusic() {
        when(music.getSongs()).thenReturn(new String[]{"some test song #1"});
        Assert.assertEquals("some test song #1", musicPlayer.playMusic());
    }

    @Test
    public void getName() {
       Assert.assertEquals("Winamp music player", musicPlayer.getName());
    }

    @Test
    public void getVersion() {
        Assert.assertEquals("2.90", musicPlayer.getVersion());
    }

}