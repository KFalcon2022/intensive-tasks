package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 99;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String result = "Некорректный возраст";
        int remainderNum = age % 10;
        if (!YearsNoMore127AndNonNegative(age)) {
            return result;
        }
        if (remainderNum == 1 && (age > 20 && age < 110) | age == 121) {
            result = ": Вам " + age + " год";
        } else if (remainderNum > 1 && remainderNum < 5 && (age > 20 && age < 110 | age > 120 && age < 125) ) {
            result = ": Вам " + age + " года";
        } else {
            result = ": Вам " + age + " лет";
        }
        return result;
    }

    static boolean YearsNoMore127AndNonNegative(int age) {
        return age >= 0 && age < 128;
    }
}
