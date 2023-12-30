package com.walking.intensive.chapter5.task22;

import java.util.List;
import java.util.Locale;

public class WordUtilities {
    List<String> collectWordList(String line) {
        String[] lineArray = line.toLowerCase(Locale.ROOT)
                .split("\\p{Punct}\s|\s|\n");

        return List.of(lineArray);
    }
}
