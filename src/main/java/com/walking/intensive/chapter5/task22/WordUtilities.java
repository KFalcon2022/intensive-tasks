package com.walking.intensive.chapter5.task22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class WordUtilities {
    List<String> makeWordsList(String line) {
        String[] lineArray = line.toLowerCase(Locale.ROOT)
                .split("\\p{Punct}\s|\s");

        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList(lineArray));
        return words;
    }
}
