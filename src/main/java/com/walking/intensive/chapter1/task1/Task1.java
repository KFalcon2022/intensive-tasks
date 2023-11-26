package com.walking.intensive.chapter1.task1;

import java.util.Random;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(128);

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String stringEnd;

        if (age % 10 == 1 && age != 11 && age != 111) {
            stringEnd = "год";
        } else if ((age % 10 > 1 && age % 10 < 5) && !(age >= 12 && age <= 15)) {
            stringEnd = "года";
        } else {
            stringEnd = "лет";
        }

        return String.format("Вам %d %s", age, stringEnd); // Заглушка. При реализации - удалить
    }
}