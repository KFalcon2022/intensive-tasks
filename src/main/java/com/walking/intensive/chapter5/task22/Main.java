package com.walking.intensive.chapter5.task22;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {
        Metallica metallica = new Metallica(); // Здесь хранится песня
        Path input = (Paths.get(".\\src\\main\\java\\com\\walking\\intensive\\chapter5\\task22\\input.txt")); // Путь, где будет лежать input.txt

        if (Files.notExists(input)) { // Если файла нет, то создаем
            Files.createFile(input);
        }

        try {
            Files.write(input, metallica.getNothingElseMatters().getBytes()); // Записываем песню в файл
        } catch (Exception e) {
            System.out.println("Oops");
        }

        List<String> songWords = new ArrayList<>(); // Создаем массив для слов из песни

        try (BufferedReader reader = Files.newBufferedReader(input)) { // Считываем слова по отдельности, сразу приводя к нижнему регистру и удаляя знаки препинания
            while (reader.ready()) {
                songWords.addAll(Arrays.asList(reader.readLine().toLowerCase().replaceAll("[,.]", "").split("\s+")));
            }
        }

        HashMap<String, Integer> wordCount = new HashMap<>(); // Создадим ассоциативный массив, где слова будут уникальными ключами, а значения - сколько раз встретилось слово в песне

        int maxValue = Integer.MIN_VALUE;
        String key = null;

        for (String word : songWords) {
            if (!wordCount.containsKey(word)) { // Если такого слова нет
                wordCount.put(word, 1); // то кладем его в мапу и записываем, что встретилось 1 раз
            } else {
                wordCount.put(word, 1 + wordCount.get(word)); // Если такое слово есть, то добавляем количество его встреч
            }
            if (wordCount.get(word) >= maxValue) { // По пути определяем победителя, если победителей несколько, то выпишем последнего
                maxValue = wordCount.get(word);
                key = word;
            }
        }

        Path output = (Paths.get(".\\src\\main\\java\\com\\walking\\intensive\\chapter5\\task22\\output.txt")); // Путь, где будет лежать output.txt

        if (Files.notExists(output)) { // Если файла нет, то создаем
            Files.createFile(output);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(output.toString()))) { // Записываем в файл результат
            writer.write(key + " " + maxValue);
        }
    }
}
