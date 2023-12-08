package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        //int age = 0;
        for (int age = 500; age <= 700; age++) {
            System.out.println(getAgeString(age));
        }
    }

    static String getAgeString(int age) {
        String tail = "";
        int lastChar = age % 10;
        int doubleDec = age % 100;
        String temp = String.valueOf(age);

        if (lastChar == 0 || (lastChar > 4 && lastChar < 21) || (doubleDec > 4 && doubleDec < 21)) {
            tail = " лет";
        } else if (lastChar == 1 && age % 100 != 11) {
            tail = " год";
        } else if (lastChar >= 2 && lastChar <= 4) {
            tail = " года";
        }

        return "Вам " + age + tail;
    }
}