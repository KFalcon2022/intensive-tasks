package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 12;

        System.out.println(getAgeString(age));

    }

    static String getAgeString(int age) {
        if (age < 0 || age > 127) {
            return "Введеный возраст некорректен";
        } else {
            if (age > 10 && age < 15 || age > 110 && age < 115) {
                return "Вам " + age + " лет.";
            } else if (age == 1 || age % 10 == 1) {
                return "Вам " + age + " год.";
            } else if (age > 1 && age < 5 || age % 10 > 1 && age % 10 < 5) {
                return "Вам " + age + " года.";
            } else {
                return "Вам " + age + " лет.";
            }
        }
    }
}