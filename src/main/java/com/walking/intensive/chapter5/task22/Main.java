package com.walking.intensive.chapter5.task22;

import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * Условие:
 * <a href="https://geometry-math.ru/homework/read-write.html">Чтение и запись</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://followlyrics.com/lyrics/4664742/txt");
        String lyricsPath = "/Volumes/Projects/Develop/input.txt";
        String resultFilePath = "/Volumes/Projects/Develop/output.txt";
        List<String> words = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(url.openStream()));
             BufferedWriter lyricsWriter =
                     new BufferedWriter(new OutputStreamWriter(new FileOutputStream(lyricsPath)));
             BufferedWriter resultWriter = new BufferedWriter(new FileWriter(resultFilePath))) {

            while (reader.ready()) {
                String line = reader.readLine();

                lyricsWriter.write(line);
                lyricsWriter.newLine();
                System.out.println(line);

                String[] lineArray = line.toLowerCase(Locale.ROOT).split("\\p{Punct}\s|\s");
                words.addAll(Arrays.asList(lineArray));
            }

            String mostFrequentWord = getMostFrequentWords(words);
            resultWriter.write(mostFrequentWord);
            System.out.println(mostFrequentWord);
        }
    }

    static String getMostFrequentWords(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        StringBuilder mostFrequentWords = new StringBuilder();

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
                mostFrequentWords
                        .append(entry.getKey())
                        .append(" ")
                        .append(entry.getValue());
            }
        }

        return mostFrequentWords.toString();
    }
}