package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        int age = 111;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age % 10 == 1 && age / 10 != 1 && age / 10 != 11) {                        // 2-ое и 3-ье условие - проверка на то, что age не входит в диапазон от 10 до 19 и от 110 до 119
            return "Вам " + String.valueOf(age) + " год";
        } else if (age % 10 < 5 && age % 10 > 1 && age / 10 != 1 && age / 10 != 11) {
            return "Вам " + String.valueOf(age) + " года";
        } else {
            return "Вам " + String.valueOf(age) + " лет";
        }
    }
}