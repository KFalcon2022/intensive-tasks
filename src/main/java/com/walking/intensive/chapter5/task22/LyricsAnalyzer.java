package com.walking.intensive.chapter5.task22;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LyricsAnalyzer {

    static String getMostFrequentWords(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        StringBuilder mostFrequentWords = new StringBuilder();

        for (String word: words) {
            wordsMap.compute(word, (key, value) -> (value == null) ? 1 : value + 1);
        }

        int maxFrequency = Collections.max(wordsMap.values());

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
