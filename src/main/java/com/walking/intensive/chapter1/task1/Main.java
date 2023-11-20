package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static final String[] WORD_CASE = {"год", "года", "лет"};

    public static void main(String[] args) {

        System.out.println(getAgeString(-9));
        System.out.println(getAgeString(128));
        for (int i = 0; i < 128; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
        String stringAge = String.valueOf(age);

        int lastDigit = age % 10;
        int secondLastDigit = 0;

        if (stringAge.length() >= 2) {
            secondLastDigit = (age / 10) % 10;
        }

        if (age < 0 || age > 127) {
            return "Ошибка! Введите правильный возраст.";
        } else if (lastDigit == 1 && secondLastDigit != 1) {
            return String.format("Вам %d %s", age, WORD_CASE[0]);
        } else if (lastDigit > 1 && lastDigit < 5 && secondLastDigit != 1) {
            return String.format("Вам %d %s", age, WORD_CASE[1]);
        } else {
            return String.format("Вам %d %s", age, WORD_CASE[2]);
        }
    }
}
