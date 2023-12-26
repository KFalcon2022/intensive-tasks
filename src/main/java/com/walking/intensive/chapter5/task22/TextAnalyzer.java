package com.walking.intensive.chapter5.task22;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalyzer {


    String analyzeText(List<String> words) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        words.forEach(word -> wordsMap.compute(word, (key, value) -> value == null ? 1 : value + 1));

        return getMostFrequentWords(wordsMap);
    }

    private String getMostFrequentWords(HashMap<String, Integer> wordsMap) {
        int maxFrequency = Collections.max(wordsMap.values());
        StringBuilder mostFrequentWords = new StringBuilder();

        for (Map.Entry<String, Integer> entry: wordsMap.entrySet()) {
            if (entry.getValue().equals(maxFrequency)) {
                mostFrequentWords.append(entry.getKey())
                        .append(" ")
                        .append(entry.getValue());
            }
        }

        return mostFrequentWords.toString();
    }
}