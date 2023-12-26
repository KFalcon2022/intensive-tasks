package com.walking.intensive.chapter5.task22;

import java.io.*;
import java.util.*;

/**
 * Условие:
 * <a href="https://geometry-math.ru/homework/read-write.html">Чтение и запись</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<String> wordsList;
        FileUtilities fileUtilities = new FileUtilities();
        WordUtilities wordUtilities = new WordUtilities();
        final String inputFilePath = "input.txt";
        wordsList = wordUtilities.makeWordsList(fileUtilities.readFile(inputFilePath));

        TextAnalyzer textAnalyzer = new TextAnalyzer();
        String analysisResult = textAnalyzer.analyzeText(wordsList);

        final String resultFilePath = "output.txt";
        fileUtilities.writeResult(resultFilePath, analysisResult);
    }
}