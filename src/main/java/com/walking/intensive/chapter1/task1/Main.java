package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static final String[] WORD_CASE = {"год", "года", "лет"};

    public static void main(String[] args) {

        for (int i = 0; i < 128; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
        String stringAge = String.valueOf(age);

        int lastDigit = age % 10;
        int beforeLastDigit = 0;

        if (stringAge.length() >= 2) {
            beforeLastDigit = Integer.parseInt(String.valueOf(stringAge.charAt(stringAge.length() - 2)));
        }

        if (lastDigit == 1 && beforeLastDigit != 1) {
            return String.format("Вам %d %s", age, WORD_CASE[0]);
        } else if (lastDigit > 1 && lastDigit < 5 && beforeLastDigit != 1) {
            return String.format("Вам %d %s", age, WORD_CASE[1]);
        } else {
           return String.format("Вам %d %s", age, WORD_CASE[2]);
        }
    }
}