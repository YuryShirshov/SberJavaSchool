package ru.sber.javaschool;

import ru.sber.javaschool.lesson4.FileProcessor;

import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя входного файла: ");
        String sourceFileName = scanner.nextLine();
        System.out.print("Введите имя выходного файла:");
        String destFileName = scanner.nextLine();
        FileProcessor fileProcessor = new FileProcessor();
        try {
            fileProcessor.process(sourceFileName, destFileName);
            System.out.println("Обработка прошла успешно");
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }

    }
}
