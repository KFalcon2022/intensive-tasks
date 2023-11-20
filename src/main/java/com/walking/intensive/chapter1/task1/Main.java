package com.walking.intensive.chapter1.task1;
/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 127;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age < 1 || age > 127) {
            return "Введенное число за пределами заданного периода.\n" +
                    "Запустите программу снова и введите число от 1 до 127 включительно.";
        }

        if ((age >= 11 && age <= 14) || (age >= 111 && age <= 114)) {
            return "Вам " + age + " лет";
        } else if (age % 10 == 1) {
            return "Вам " + age + " год";
        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }
}