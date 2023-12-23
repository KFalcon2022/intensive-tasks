package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        //  Для собственных проверок можете делать любые изменения в этом методе

        for (int i = 0; i < 127; i++) {
            System.out.println(getAgeString(i));
        }
    }

    static String getAgeString(int age) {
        //  Место для вашего кода

        // Скорее всего это кривое решение и можно сделать красивее
        switch (age % 100) {
            case 11, 12, 13, 14 -> {
                return String.format("Вам %d лет", age);
            }
        }

        switch (age % 10) {
            case 1 -> {
                return String.format("Вам %d год", age);
            }
            case 2, 3, 4 -> {
                return String.format("Вам %d года", age);
            }
            case 0, 5, 6, 7, 8, 9 -> {
                return String.format("Вам %d лет", age);
            }
        }

        return null; // Заглушка. При реализации - удалить
    }
}