package ru.sber.javaschool.lesson3;

public class RockMusic implements Music{
    @Override
    public String[] getSongs() {
        return new String[]{"some rock song #1", "some rock song #2", "some rock song #3"};
    }
}
