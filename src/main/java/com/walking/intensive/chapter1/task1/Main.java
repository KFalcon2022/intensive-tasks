package com.walking.intensive.chapter1.task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        Для собственных проверок можете делать любые изменения в этом методе

        System.out.println(getAgeString(getAge()));
    }

    static int getAge() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = -1;

        while (age < 0 || age > 127) {
            System.out.print("Введите свой возраст: ");
            age = Integer.parseInt(reader.readLine());
        }

        reader.close();
        return age;
    }

    static String getAgeString(int age) {
//        Место для вашего кода
        if (age >= 11 && age <= 14 || age >= 111 && age <= 114) return ("Вам " + age + " лет");
        else if (age % 10 > 1 && age % 10 <= 4) return ("Вам " + age + " года");
        else if (age % 10 == 1) return ("Вам " + age + " год");
        else return ("Вам " + age + " лет");
    }
}