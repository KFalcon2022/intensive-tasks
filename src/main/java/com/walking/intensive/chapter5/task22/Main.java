package com.walking.intensive.chapter5.task22;

import java.io.*;
import java.util.*;

/**
 * Условие:
 * <a href="https://geometry-math.ru/homework/read-write.html">Чтение и запись</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "/Volumes/Projects/Develop/input.txt";
        String outputFilePath = "/Volumes/Projects/Develop/output.txt";
        List<String> words = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath))) {

            while (bufferedReader.ready()) {
                String[] line = bufferedReader.readLine().split("\\p{Punct}\s|\s");
                words.addAll(Arrays.asList(line));
            }

            bufferedWriter.write(getMaxFrequencyWords(words));
            System.out.println(getMaxFrequencyWords(words));
        }
    }

    static String getMaxFrequencyWords(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        StringBuilder maxFrequencyWords = new StringBuilder();

        for (String word: words) {
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, 1);
            } else {
                int wordFrequency = wordsMap.get(word);
                wordsMap.replace(word, wordFrequency + 1);
            }
        }
        
        int maxFrequency = Collections.max(wordsMap.values());

        for (Map.Entry<String, Integer> entry: wordsMap.entrySet()) {
            if (entry.getValue().equals(maxFrequency)) {
                maxFrequencyWords
                        .append(entry.getKey())
                        .append(" ")
                        .append(entry.getValue());
            }
        }

        return maxFrequencyWords.toString();
    }
}