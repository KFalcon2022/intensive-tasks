package com.walking.intensive.chapter5.task22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("input.txt");
        Scanner scanner = new Scanner(input);
        ArrayList<String> wordsList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String string;
            string = String.valueOf(scanner.nextLine()).replaceAll(("\\pP"), "").toLowerCase();
            String[] words = string.split(" ");
            Collections.addAll(wordsList, words);
        }
        scanner.close();

        Map<String, Integer> wordFrequency = wordsList.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));

        int maxFreqeuncy = Collections.max(wordFrequency.values());
        Collection<String> collection = wordFrequency.keySet();
        String theWord = "";

        for (String key : collection
        ) {
            int frequency = wordFrequency.get(key);
            if (frequency == maxFreqeuncy) {
                theWord = key;
                break;
            }
        }

        File output = new File("output.txt");
        PrintWriter printWriter = new PrintWriter(output);

        printWriter.println(theWord + " " + maxFreqeuncy);
        printWriter.close();
    }
}