package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 1;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
//        Место для вашего кода

        int longevityRecord = 127;
            if (age % 10 == 1 && age != 11 && age != 111) {
                return "Вам " + age + " год";
            } else if ((age % 10 == 2 && age != 12 && age != 112) || (age % 10 == 3 && age != 13 && age != 113) || (age % 10 == 4 && age != 14 && age != 114)) {
                return "Вам " + age + " года";
            } else {
                return "Вам " + age + " лет";
            }
    }
}