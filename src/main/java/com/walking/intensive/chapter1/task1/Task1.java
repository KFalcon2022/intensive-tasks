package com.walking.intensive.chapter1.task1;

import java.util.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число лет (только целые значения): ");
        int age = sc.nextInt();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int age10 = age % 10,
                age100 = age % 100;

        if (age < 0) {
            return "Возможно, Вы не родились";
        }

        if (age > 200) {
            return "Возможно, Вы вампир";
        }

        if ((age100 >= 10 && age100 <= 19) || (age10 == 0 || age10 >= 5)) {
            return "Вам " + age + " лет";
        } else if (age10 == 1) {
            return "Вам " + age + " год";
        } else if (age10 >= 2 && age10 <= 4) {
            return "Вам " + age + " года";
        }

        return "Возможно, Вы Дементор";
    }
}