package com.walking.intensive.chapter5.task22;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
    static HashMap<String, Integer> hashMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\egor.djun\\Desktop\\input.txt";
        String fileOutput = "C:\\Users\\egor.djun\\Desktop\\output.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName));
             FileWriter writer = new FileWriter(fileOutput)) {
            String line;

            while ((line = reader.readLine()) != null) {                                //считываем строки
                StringTokenizer tokenizer = new StringTokenizer(line);

                while (tokenizer.hasMoreTokens()) {                                    //разбиваем строки на слова
                    String token = tokenizer.nextToken().toLowerCase().replaceAll("\\p{Punct}", "");

                    if (hashMap.containsKey(token)) {                                    //если нашел совпадение по ключю
                        hashMap.put(token, hashMap.get(token) + 1);                    //тогда обновляем значение
                        continue;
                    }

                    hashMap.put(token, 1);
                }
            }

            int maxValueInMap = Collections.max(hashMap.values());
            String keyMap = "";

            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() == maxValueInMap) {
                    keyMap = entry.getKey();
                }
            }

            writer.write(keyMap + " = " + maxValueInMap);
        }
    }
}