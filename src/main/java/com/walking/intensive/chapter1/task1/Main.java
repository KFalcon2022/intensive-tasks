package com.walking.intensive.chapter1.task1;

import java.util.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш возраст? ");
        int age = sc.nextInt();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        String correctEnding;
        int nums = age % 100;

        if (nums >= 11 && nums <= 19) {
            correctEnding = "лет";
        } else {
            int num = age % 10;
            correctEnding = switch (num) {
                case 1 -> "год";
                case 2, 3, 4 -> "года";
                default -> "лет";
            };
        }
        return "Вам " + age + " " + correctEnding + ".";
    }
}