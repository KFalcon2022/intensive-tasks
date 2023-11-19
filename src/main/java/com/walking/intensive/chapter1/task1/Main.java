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
        String ageString = "";
        if ((age % 10) == 1 & age != 11) {
            ageString = "Вам " + age + " год";
        } else if (((age % 10) == 2 & age != 12)
                || ((age % 10) == 3 & age != 13)
                || ((age % 10) == 4 & age != 14)) {
            ageString = "Вам " + age + " года";
        } else if (age == 11 || age == 12 || age == 13
                || age == 14 || (age % 10) == 5
                || (age % 10) == 6 || (age % 10) == 7
                || (age % 10) == 8 || (age % 10) == 9
                || (age % 10) == 0) {
            ageString = "Вам " + age + " лет";
        }
        return ageString;
    }

}