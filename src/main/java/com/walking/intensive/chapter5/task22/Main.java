package com.walking.intensive.chapter5.task22;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            String text = readTextFromFile(inputFilePath);

            Map<String, Integer> wordCount = countWords(text);

            String mostFrequentWord = findMostFrequentWord(wordCount);

            writeResultToFile(outputFilePath, mostFrequentWord, wordCount.get(mostFrequentWord));

            System.out.println("Запись: " + outputFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readTextFromFile(String filePath) throws Exception {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }

        return sb.toString();
    }

    private static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = text.toLowerCase().split("\\P{L}+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    private static String findMostFrequentWord(Map<String, Integer> wordCount) {
        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentWord;
    }

    private static void writeResultToFile(String filePath, String word, int count) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(word + " " + count);
        }
    }
}