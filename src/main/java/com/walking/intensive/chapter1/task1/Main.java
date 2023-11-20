package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

//        Для собственных проверок можете делать любые изменения в этом методе

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int age = scanner.nextInt();
        scanner.close();

        getAgeString(age);
    }

    static void getAgeString(int age) {

        if (age <= 0) {
            System.out.println("Возраст введен не верно, попробуйте еще раз.");
        }

        else {

            switch (age % 10) {
                case 1 -> System.out.println("Вам " + age + " год.");
                case 2, 3, 4 -> System.out.println("Вам " + age + " года.");
                default -> System.out.println("Вам " + age + " лет.");

            }
        }
    }
}