package ru.sber.javaschool.lesson3;

public class RapMusic implements Music{
    @Override
    public String[] getSongs() {
        return new String[]{"some rap song #1", "some rap song #2", "some rap song #3", "some rap song #4"};
    }
}
