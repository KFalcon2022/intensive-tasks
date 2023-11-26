package com.walking.intensive.chapter2.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число n: ");
        int n = sc.nextInt();

        System.out.println("Введите число m: ");
        int m = sc.nextInt();

        System.out.println("Значение максимального дружественного числа: ");
        int maxValue = sc.nextInt();

        System.out.println("Наибольшее число из пары дружественных чисел: " + getMaxFriendlyNumber(n, m, maxValue));
    }

    public static int getMaxFriendlyNumber(int n, int m, int maxValue) {
        if (n > 0 && m > 0) {
            Math.max(getFriendlyNumber(n, m, maxValue), getFriendlyNumber(m, n, maxValue));
        }

        return 0;
    }

    private static int getFriendlyNumber(int num1, int num2, int maxValue) {
        int sumDividers = 0;

        for (int i = 1; i < num1; ++i) {
            if (num1 % i == 0) {
                sumDividers += i;
            }
        }

        if (sumDividers == num2 && sumDividers <= maxValue) {
            return sumDividers;
        }

        return 0;
    }
}