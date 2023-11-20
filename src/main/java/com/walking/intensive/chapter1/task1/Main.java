package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        String name = "Проверяющий";
        int age = 99;
        System.out.println(getAgeString(name, age));
    }

    static String getAgeString(String name, int age) {
        String result = "Некорректный возраст";
        int remainderNum = age % 10;
        if (!isYearsNoMore127AndNonNegative(age)) {
            return result;
        }
        if (remainderNum == 1 && (age > 20 | age == 1)) {
            result = name + ": Вам " + age + " год";
        } else if (remainderNum > 1 && remainderNum < 5 && (age > 20 | age < 5)) {
            result = name + ": Вам " + age + " года";
        } else {
            result = name + ": Вам " + age + " лет";
        }
        return result;
    }

    static boolean isYearsNoMore127AndNonNegative(int age) {
        return age >= 0 && age < 128;
    }
}
