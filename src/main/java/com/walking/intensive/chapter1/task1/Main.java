package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        for (int i = 0; i < 129; i++) {
            System.out.println(getAgeString(i));
        }

    }

    static String getAgeString(int age) {
        String answer;

        if (age < 1 || age > 127) {
            answer = "Некорректно указан возраст";
        } else if (age % 10 > 4 || age % 10 == 0 || age > 9 && age < 21 || age > 109 && age < 121) {
            answer = "Вам " + age + " лет";
        } else if (age % 10 == 1) {
            answer = "Вам " + age + " год";
        } else {
            answer = "Вам " + age + " года";
        }

        return answer;
    }
}