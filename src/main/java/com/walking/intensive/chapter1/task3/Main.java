package com.walking.intensive.chapter1.task3;

import java.util.ArrayList;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 *
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

        ArrayList<Integer> years = new ArrayList<>();
        years.add(1764);
        years.add(1832);
        years.add(1966);
        years.add(2040);
        years.add(1988);
        years.add(1820);
        years.add(2004);
        years.add(1917);
        years.add(2024);

        for (int i : years) {
            System.out.println(i + " " + isLeap(i));
        }
    }

    static boolean isLeap(int year) {

        if (year <= 0) {
            System.out.println("Введен неверный год");
            return false;
        }

        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }
}