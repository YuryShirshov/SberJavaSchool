package ru.sber.javaschool;

import ru.sber.javaschool.lesson4.FileProcessor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source FileName: ");
        String sourceFileName = scanner.nextLine();
        System.out.print("Enter dest FileName:");
        String destFileName = scanner.nextLine();
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.process(sourceFileName, destFileName);
    }
}
