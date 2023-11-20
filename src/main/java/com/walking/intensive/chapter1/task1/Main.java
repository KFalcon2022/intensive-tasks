package com.walking.intensive.chapter1.task1;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        getAge();
    }

    static void getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 127 включительно:");
        int year = scanner.nextInt();

        scanner.close();

        if (year < 1 || year > 127) {
            System.out.println("Введенное число за пределами заданного периода.\n" +
                    "Запустите программу снова и введите число от 1 до 127 включительно.");
            return;
        }

        if ((year >= 11 && year <= 14) || (year >= 111 && year <= 114)) {
            System.out.println("Вам " + year + " лет");
        } else if (year % 10 == 1) {
            System.out.println("Вам " + year + " год");
        } else if (year % 10 == 2 || year % 10 == 3 || year % 10 == 4) {
            System.out.println("Вам " + year + " года");
        } else {
            System.out.println("Вам " + year + " лет");
        }
    }
}