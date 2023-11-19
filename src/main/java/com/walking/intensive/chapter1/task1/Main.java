package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String result = "Вам " + age;
        if ((age % 100 > 10 && age % 100 < 20) || (age % 10 == 0) || (age % 10 > 4)) {
            result += " лет";
        } else if (age % 10 == 1) {
            result += " год";
        } else {
            result += " года";
        }

        return result; // Заглушка. При реализации - удалить
    }
}