package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        int age = 0;
        for (int i = -1; i < 129; i++) {
            System.out.println(getAgeString(i));
        }

    }

    static String getAgeString(int age) {
        String s = "";
        if (age > 127 || age < 0) {
            return "Проверьте правильность ввода возраста";
        }

        switch (age % 10) {
            case 1:
                if (age % 100 == 11) {
                    s = "Вам " + age + " лет";
                } else {
                    s = "Вам " + age + " год";
                }
                break;
            case 2, 3, 4:
                if (age % 100 == 12 || age % 100 == 13 || age % 100 == 14) {
                    s = "Вам " + age + " лет";
                } else {
                    s = "Вам " + age + " года";
                }
                break;
            case 0, 5, 6, 7, 8, 9:
                s = "Вам " + age + " лет";
        }
        return s;
    }
}