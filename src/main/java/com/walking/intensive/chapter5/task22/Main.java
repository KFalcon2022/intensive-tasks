package com.walking.intensive.chapter5.task22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        final String INPUT_FILE_NAME = "input.txt";
        final String OUTPUT_FILE_NAME = "output.txt";

        try {
            File outputFile = new File(getPathname(OUTPUT_FILE_NAME));

            writeToFile(outputFile, getTheMostMetWord(INPUT_FILE_NAME));

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getPathname(String fileName) {
        String separator = File.separator;

        return "src" +
                separator + "main" +
                separator + "java" +
                separator + "com" +
                separator + "walking" +
                separator + "intensive" +
                separator + "chapter5" +
                separator + "task22" +
                separator + fileName;
    }

    private static void writeToFile(File file, String content) {
        FileOutputStream outputStream;

        try {
            outputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Output file is not found");
        }

        byte[] buffer = content.getBytes();

        try {
            outputStream.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException("Stream writing error");
        }

        try {
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException("Stream closing error");
        }
    }

    private static String getTheMostMetWord(String fileName) {
        byte[] textAsBytes;
        try {
            textAsBytes = Files.readAllBytes(
                    Paths.get(getPathname(fileName)));
        } catch (IOException e) {
            throw new RuntimeException("It's not possible to read the file");
        }

        String text = new String(textAsBytes);

        String preparedText = text.toUpperCase()
                .replaceAll("\\p{Punct}", "");

        String[] wordsArray = preparedText.split("\\s+");

        int maxValue = 0;
        String theMostMetWord = null;

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : wordsArray) {
            wordsMap.merge(word, 1, Integer::sum);

            if (wordsMap.get(word) > maxValue) {
                maxValue = wordsMap.get(word);
                theMostMetWord = word;
            }
        }

        return theMostMetWord + " " + wordsMap.get(theMostMetWord);
    }
}