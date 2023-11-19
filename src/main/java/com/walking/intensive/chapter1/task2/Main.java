package com.walking.intensive.chapter1.task2;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-house.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age % 10 == 1 && age % 100 != 11) {
            return String.format("Вам %d год", age);
        }
        if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 10 || age % 100 >= 20)) {
            return String.format("Вам %d года", age);
        }
        return String.format("Вам %d лет", age);
    }
}