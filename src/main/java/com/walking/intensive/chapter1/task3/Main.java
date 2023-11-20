package com.walking.intensive.chapter1.task3;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-leap-year.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(isLeap(1975));
        System.out.println(isLeap(1724));
        System.out.println(isLeap(2000));
        System.out.println(isLeap(1300));

    }

    static boolean isLeap(int year) {
        boolean isLeap;

        int remainderOfDivisionOnFour = year % 4;
        int remainderOfDivisionOnOneHundred = year % 100;

        // Если год не кратен 4, то он точно невисокосный
        if (remainderOfDivisionOnFour != 0) {
            isLeap = false;
        } else {
            // Если год кратен 4, но не кратен 100, он високосный
            if (remainderOfDivisionOnOneHundred != 0) {
                isLeap = true;
            } else {
                // Если результат деления года на 100 кратен 4, то год високосный,
                // а если не кратен - невисокосный
                isLeap = (year / 100) % 4 == 0;
            }
        }

        return isLeap;
    }
}