package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 111;
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age > 10 && age <= 20) {
            System.out.print(age);
            System.out.println(" лет");
        }
        if (age == 101) {
            System.out.print(age);
            System.out.println(" год");
        }
        if (age == 111) {
            System.out.print(age);
            System.out.println(" лет");
        }
        int x = 1;
        if (age > 21 | age > 100) {
            x = age % 10;
        }
        if (x == 1 && age == 1) {
            System.out.print(age);
            System.out.println(" год");
        }
        if (x >= 2 && x <= 4) {
            System.out.print(age);
            System.out.println(" года");
        }
        if (age >= 2 && age <= 4) {
            System.out.print(age);
            System.out.println(" года");
        }
        if (age >= 5 && age <= 10) {
            System.out.print(age);
            System.out.println(" лет");
        }
        if (x >= 5) {
            System.out.print(age);
            System.out.println(" лет");
        }

        return null;
    }
}