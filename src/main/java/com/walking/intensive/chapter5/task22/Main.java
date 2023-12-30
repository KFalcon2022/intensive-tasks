package com.walking.intensive.chapter5.task22;

import java.util.*;

/**
 * Условие:
 * <a href="https://geometry-math.ru/homework/read-write.html">Чтение и запись</a>
 */
public class Main {
    private static final String INPUT_FILE_PATH =
            "src/main/java/com/walking/intensive/chapter5/task22/resources/input.txt";
    private static final String RESULT_FLE_PATH =
            "src/main/java/com/walking/intensive/chapter5/task22/resources/output.txt";


    public static void main(String[] args) {
        List<String> wordList =
                new WordUtilities().collectWordList(new SimpleFileReader().readFile(INPUT_FILE_PATH));
        String analysisResult = new TextAnalyzer().analyzeText(wordList);
        new SimpleFileWriter().writeResult(RESULT_FLE_PATH, analysisResult);
    }
}