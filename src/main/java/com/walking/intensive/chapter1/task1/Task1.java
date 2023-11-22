package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        int age = 100;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String s1 = "Вам " + age + " год";
        String s2 = "Вам " + age + " года";
        String s3 = "Вам " + age + " лет";
        String s = new String();
        if (age > 0 && age < 5 || age > 20 && age < 105 || age > 120) {
            if (age % 10 > 1 && age % 10 < 5) {
                s = s2;
            } else if (age % 10 == 1) {
                s = s1;
            } else {
                s = s3;
            }
        } else if (age == 0 || age > 4 && age < 21 || age > 104) {
            s = s3;
        }
        return s;
    }
}