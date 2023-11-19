package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static final String[] WORD_CASE = {"год", "года", "лет"};

    public static void main(String[] args) {

        int ageOutOfBounds = 20;

        System.out.println(getAgeString(ageOutOfBounds));
    }

    static String getAgeString(int age) {
        String stringAge = String.valueOf(age);
        int lastDigit = Integer.parseInt(stringAge.substring(stringAge.length() - 1));
        if (age < 0 || age > 127) {
            return "Ошибка, введите корректный возраст!";
        } else if (age == 1 || age > 20 && lastDigit == 1) {
            return String.format("Вам %d %s", age, WORD_CASE[0]);
        } else if ((age > 20 || age < 10) && lastDigit > 0 && lastDigit < 5) {
            return String.format("Вам %d %s", age, WORD_CASE[1]);
        } else {
            return String.format("Вам %d %s", age, WORD_CASE[2]);
        }
    }
}