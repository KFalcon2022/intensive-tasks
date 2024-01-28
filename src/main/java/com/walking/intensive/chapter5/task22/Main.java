package com.walking.intensive.chapter5.task22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File(getPathname("input.txt"));

        File outputFile = new File(getPathname("output.txt"));

        writeToFile(outputFile, getTheMostMetWord(inputFile.getName()));
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

    private static void writeToFile(File file, String content) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file);

        byte[] buffer = content.getBytes();

        outputStream.write(buffer);
        outputStream.close();
    }

    private static String getTheMostMetWord(String fileName) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get(getPathname(fileName))));
        String preparedText = text.toUpperCase().replaceAll("\\p{Punct}", "");
        String[] wordsArray = preparedText.split("\\s+");

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String s : wordsArray) {
            wordsMap.merge(s, 1, Integer::sum);
        }

        Integer maxValue = 0;
        String theMostMetWord = null;
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                theMostMetWord = entry.getKey();
            }
        }

        return theMostMetWord + " " + wordsMap.get(theMostMetWord);
    }
}