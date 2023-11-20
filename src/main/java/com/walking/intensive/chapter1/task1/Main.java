package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 1;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String message;
        int lastDigit = age % 10;
        int penultDigit = (age / 10) % 10;

        if (penultDigit != 1 && lastDigit == 1) {
            message = "Вам " + age + " " + "год";
        } else if (penultDigit != 1 && (lastDigit == 2 || lastDigit == 3 || lastDigit == 4)) {
            message = "Вам " + age + " " + "года";
        } else {
            message = "Вам " + age + " " + "лет";
        }
        return message;
    }
}
