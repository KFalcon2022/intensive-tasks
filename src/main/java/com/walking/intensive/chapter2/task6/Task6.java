package com.walking.intensive.chapter2.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число a: ");
        int a = sc.nextInt();

        System.out.println("Введите число b: ");
        int b = sc.nextInt();

        System.out.println("Наибольший общий делитель чисел " + a + " и " + b + ": " + getGreatestCommonDivisor(a, b));

        System.out.println("Наименьшее общее кратное чисел " + a + " и " + b + ": " + getLowestCommonMultiple(a, b));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }

        if (a % b == 0) {
            return b;
        }
        int remainder = a % b;
        return getGreatestCommonDivisor(b, remainder);
    }

    public static int getLowestCommonMultiple(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;                                      // Я так понимаю, что для того, чтобы реализовать нормальный return, когда делится на 0,
        }                                                  // мне нужно использовать exception, но я пока не знаю, как это реализовать.
                                                           // Или можно, чтобы метод возвращал String, тогда я смогу вывести слова "На ноль делить нельзя"
        return a * b / getGreatestCommonDivisor(a, b);     // или что-нибудь наподобие, но тогда я уже не смогу использовать это "число", так оно оно будет типа String.
    }
}