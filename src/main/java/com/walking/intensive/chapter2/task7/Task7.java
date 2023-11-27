package com.walking.intensive.chapter2.task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Значение максимального дружественного числа: ");
        int maxValue = sc.nextInt();

        System.out.println("Наибольшее число из пары дружественных чисел не более числа " + maxValue + ": " + getMaxFriendlyNumber(maxValue));
    }

    public static int getMaxFriendlyNumber(int maxValue) {
        int x = maxValue - 1;

        while (x > 1) {
            int sumFirst = x;
            int secondNum = sumFirst;
            int sumSecond = getSumDividers(secondNum);
            int firstNum = sumSecond;
            int newSumFirstNum = getSumDividers(firstNum);

            if (newSumFirstNum == sumFirst && firstNum != secondNum) {
                return getMaxNum(firstNum, secondNum, maxValue);
            }
            x--;
        }
        return 0;
    }

    private static int getSumDividers(int number) {
        int sum = 0;
        int x = number;

        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static int getMaxNum(int first, int second, int maxValue) {
        if (first >= maxValue || second >= maxValue) {
            return Math.min(first, second);
        }
        return Math.max(first, second);
    }
}