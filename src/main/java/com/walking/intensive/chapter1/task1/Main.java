package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 11;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age < 0) {
            return "Возраст не может быть отрицательным!";
        } else if ((age % 10 == 1) && (age % 100 != 11)) {
            return String.format("Вам %d год.", age);
        } else if ((age % 10 == 2) && (age % 100 != 12) || 
                   (age % 10 == 3) && (age % 100 != 13) || 
                   (age % 10 == 4) && (age % 100 != 14)) {
            return String.format("Вам %d года.", age);
        } else {
            return String.format("Вам %d лет.", age);
        }
    }
}