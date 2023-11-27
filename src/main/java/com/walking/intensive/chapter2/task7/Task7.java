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
            if ((i + getSumDivisor(i) == getSumDivisor(i) + getSumDivisor(getSumDivisor(i)))
                    && (i != getSumDivisor(i)) && (getSumDivisor(i) < m) && (i + getSumDivisor(i) > sumFriendlyPair)) {
                sumFriendlyPair = i + getSumDivisor(i);
                result = Math.max(i, getSumDivisor(i));
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