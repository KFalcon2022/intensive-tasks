package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ваш возраст:");
        int age = input.nextInt();
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        int decadeRemain = age % 10;
        int centuryRemain = age % 100;

        if (decadeRemain == 1 & centuryRemain != 11) {
            return "Вам " + age + " год";
        } else if ((decadeRemain == 2 & centuryRemain != 12)
                || (decadeRemain == 3 & centuryRemain != 13)
                || (decadeRemain == 4 & centuryRemain != 14)) {
            return "Вам " + age + " года";
        } else if (centuryRemain == 11 || centuryRemain == 12
                || centuryRemain == 14 || centuryRemain == 13
                || decadeRemain == 5 || decadeRemain == 6
                || decadeRemain == 7 || decadeRemain == 8
                || decadeRemain == 9 || decadeRemain == 0) {
            return "Вам " + age + " лет";
        }

        return "";
    }
}