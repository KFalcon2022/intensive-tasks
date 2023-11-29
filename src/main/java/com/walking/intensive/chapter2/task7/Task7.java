package com.walking.intensive.chapter2.task7;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/java-friendly-number.html">ссылка</a>
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Введите число от 1 до 999 999: ");
            num = scanner.nextInt();
        }
        while (num < 1 || num > 1000000);

        System.out.println("Наибольшее число из пары дружественных чисел, которое меньше " + num + " равняется: " + getFriendlyPair(num));
    }

    static int getFriendlyPair(int m) {
        int result = 0;
        int sumFriendlyPair = 0;

        for (int i = 0; i <= m; i++) {
            int sumDivisor = getSumDivisor(i);

            if ((i + sumDivisor == sumDivisor + getSumDivisor(sumDivisor)) && (i != sumDivisor) && (sumDivisor < m) && (i + sumDivisor > sumFriendlyPair)) {
                sumFriendlyPair = i + sumDivisor;
                result = Math.max(i, sumDivisor);
            }
        }

        return result;
    }

    static int getSumDivisor(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}