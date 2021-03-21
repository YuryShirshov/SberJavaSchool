package ru.sber.javaschool.lesson4;

import java.io.*;

public class FileProcessor {

    public void process(String aSourceFileName, String aDestFileName) throws IOException {
        FileReader fileReader = new FileReader(aSourceFileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(aDestFileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) break;
                String newLine = line.replace("6", " ");
                bufferedWriter.write(newLine);
            }
        } finally {
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            fileReader.close();
        }
    }
}
