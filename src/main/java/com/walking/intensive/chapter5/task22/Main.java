package com.walking.intensive.chapter5.task22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder fileText = new StringBuilder();
        try {
            File input = new File(".\\src\\main\\java\\com\\walking\\intensive\\chapter5\\task22\\input.txt");
            Scanner myScanner = new Scanner(input);
            while (myScanner.hasNextLine()) {
                fileText.append(myScanner.nextLine()).append(" ");
            }
            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка в чтении файла");
            e.printStackTrace();
        }
        try {
            File myObj = new File(".\\src\\main\\java\\com\\walking\\intensive\\chapter5\\task22\\output.txt");
            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write(wordUsedMax(fileText));
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка в записи файла");
            e.printStackTrace();
        }
    }

    public static String wordUsedMax(StringBuilder stringBuilder) {
        while (stringBuilder.indexOf(",") != -1) {
            stringBuilder.deleteCharAt(stringBuilder.indexOf(","));
        }
        String[] arrayStringBuilder = stringBuilder.toString().toLowerCase().split(" ");
        HashMap<String, Integer> wordUsed = new HashMap<>();
        for (String str : arrayStringBuilder) {
            if (wordUsed.containsKey(str)) {
                int used = wordUsed.get(str) + 1;
                wordUsed.put(str, used);
            } else {
                wordUsed.put(str, 1);
            }
        }
        ArrayList<Integer> values = new ArrayList<>(wordUsed.values());
        StringBuilder strWordAndValues = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wordUsed.entrySet()) {
            if (Objects.equals(entry.getValue(), Collections.max(values))) {
                strWordAndValues.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
            }
        }
        return strWordAndValues.toString();
    }
}