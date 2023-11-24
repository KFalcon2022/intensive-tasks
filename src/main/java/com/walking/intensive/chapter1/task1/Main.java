package com.walking.intensive.chapter1.task1;

/**
 * Условие: Рекорд долгожительства на данный момент составляет 127 лет.
 * Напишите программу, которая будет печатать: "Вам n лет". Программа должна корректно отрабатывать правила русского языка.
 * Пример верного исполнения кода: "Вам 5 лет", "Вам 4 года". Пример неверной работы программы: "Вам 14 года".
 * PS: Если Вы уже знакомы с методами, то реализовать через метод. Если нет, то в main.
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

        int age = 5;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (((age >= 5 && age <= 20) || (age >= 105 && age <= 120)) || ((age % 10) >= 5 && (age % 10) <= 9) || ((age % 100) >= 5 && (age % 100) <= 9)) {
            System.out.println("Вам " + age + " лет");
        } else if (age == 1 || (age % 10) == 1 || (age % 100) == 1) {
            System.out.println("Вам " + age + " год");
        } else if (((age % 10) >= 2 && (age % 10) <= 4) || ((age % 100) >= 2 && (age % 100) <= 4)) {
            System.out.println("Вам " + age + " года");
        }
        return null;

    }
}