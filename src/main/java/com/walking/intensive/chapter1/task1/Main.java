package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        for (int i = -1; i <= 128; i++) {
            System.out.println(getAgeString(i));
        }


    }

    static String getAgeString(int age) {
        int module = age % 100;
        if (age < 0 || age > 127) {
            return "Incorrect age!";
        } else if (module >= 11 && module <= 20) {
            return "Вам " + age + " лет";
        } else {
            module = age % 10;
            if (module == 1) {
                return "Вам " + age + " год";
            } else if (module >= 2 && module <= 4) {
                return "Вам " + age + " года";
            } else return "Вам " + age + " лет";
        }
    }
}