package ru.sber.javaschool.lesson3;

public class PopMusic implements Music{
    @Override
    public String[] getSongs() {
        return new String[]{"some pop song #1", "some pop song #2"};
    }
}
