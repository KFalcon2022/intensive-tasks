package com.walking.intensive.chapter5.task22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile = new File(getPathname("input.txt"));

        String songWords = "So close no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters\n\n" +
                "Trust I seek and I find in you\n" +
                "Every day for us something new\n" +
                "Open mind for a different view\n" +
                "And nothing else matters\n\n" +
                "Never cared for what they do\n" +
                "Never cared for what they know, whoa\n" +
                "But I know\n\n" +
                "So close no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n\n" +
                "Never cared for what they do\n" +
                "Never cared for what they know, whoa\n" +
                "But I know\n\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters\n\n" +
                "Trust I seek and I find in you\n" +
                "Every day for us something new\n" +
                "Open mind for a different view\n" +
                "And nothing else matters\n\n" +
                "Never cared for what they say\n" +
                "Never cared for games they play\n" +
                "Never cared for what they do\n" +
                "Never cared for what they know\n" +
                "And I know\n\n" +
                "So close no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "No, nothing else matters";

        writeToFile(inputFile, songWords);

        File outputFile = new File(getPathname("output.txt"));
        String theMostMetWord = getTheMostMetWord(inputFile.getName());

        writeToFile(outputFile, theMostMetWord);
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