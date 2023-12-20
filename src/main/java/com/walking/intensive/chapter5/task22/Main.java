package com.walking.intensive.chapter5.task22;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String song = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Патиссон\\intensive-tasks\\src\\main\\java\\com\\walking\\intensive\\chapter5\\task22\\input.txt"))) {
            String line = reader.readLine();

            while (line != null) {
                song += line + " ";
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String longestWord= findLongestWord(splitSong(song));
        String resultString = longestWord + " is written " + countWord(splitSong(song),longestWord)+ " times";
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Патиссон\\intensive-tasks\\src\\main\\java\\com\\walking\\intensive\\chapter5\\task22\\output.txt");
            writer.write(resultString);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
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
