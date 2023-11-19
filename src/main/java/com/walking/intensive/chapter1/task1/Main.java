package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        int age = 3;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String message;
        if (age < 0 || age > 127) {
            message = "Неверно введен возраст";
        } else if (age == 1 || (age > 20 && (age % 10 == 1))) {
            message = "Вам " + age + " год";
        } else if (age != 0 && age < 5 || (age > 20 && (age % 10 > 1 && age % 10 < 5))) {
            message = "Вам " + age + " года";
        } else {
            message = "Вам " + age + " лет";
        }
        return message;
    }
}
