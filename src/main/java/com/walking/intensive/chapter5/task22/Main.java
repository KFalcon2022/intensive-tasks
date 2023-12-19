package com.walking.intensive.chapter5.task22;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String[] splitSong(String song) {
        return song.split("[,\\s]+");
    }

    public static String findLongestWord(String[] songWords) {
        String longestWord = songWords[0];
        for (String i : songWords) {
            if (i.length() > longestWord.length()) {
                longestWord = i;
            }
        }
        return longestWord;
    }

    public static int countWord(String[] songWords, String longestWord) {
        int count = 0;
        for (String i : songWords) {
            if (i.equalsIgnoreCase(longestWord)) {
                count++;
            }
        }
        return count;
    }


}
