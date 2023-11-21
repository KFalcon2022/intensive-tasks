package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 124;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        // 1 год, 2, 3, 4 года, 5 - 20, 21 год, 22 - 24 года, 25 - 30 лет,
        if (age < 0 || age > 127) {
            return "Wrong age";
        }

        int lastNum = getLastNum(age);
        if (lastNum == 1) {
            return "Вам " + age + " год";
        } else if (lastNum >= 2 && lastNum <= 4) {
            return "Вам " + age + " года";
        } else {
            return "Вам " + age + " лет";
        }
    }

    static int getLastNum(int age) {
        if (age < 10) {
            age += 10;
        }
        return age % 10;
    }
}