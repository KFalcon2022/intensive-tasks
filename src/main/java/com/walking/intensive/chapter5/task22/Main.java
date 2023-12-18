package com.walking.intensive.chapter5.task22;

import java.io.*;
import java.util.*;

/**
 * Условие:
 * <a href="https://geometry-math.ru/homework/read-write.html">Чтение и запись</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String lyricsPath = "input.txt";
        String resultFilePath = "output.txt";

        writeResult(resultFilePath, LyricsAnalyzer.getMostFrequentWords(readFile(lyricsPath)));
    }

    static List<String> readFile(String readPath) throws IOException {
        List<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(readPath))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] lineArray = line.toLowerCase(Locale.ROOT)
                        .split("\\p{Punct}\s|\s");
                words.addAll(Arrays.asList(lineArray));
            }
        }

        return words;
    }

    static void writeResult(String writePath, String result) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writePath))) {
            writer.write(result);
        }
    }
}