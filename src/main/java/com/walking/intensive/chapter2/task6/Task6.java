package src.main.java.com.walking.intensive.chapter2.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.println("Наименьшее общее кратное чисел: " + getSmallestCommonMultiple(a, b));
        System.out.println("Наибольший общий делитель чисел: " + getGreatestCommonDivisor(a, b));
        System.out.println("Наибольший общий делитель чисел через алгоритм Евклида: " + getGreatestCommonDivisorByEuclid(a, b));
    }

    public static int getSmallestCommonMultiple(int a, int b) {
        for (int i = 1; i <= a * b; i++) {
            if ((i % a == 0) && (i % b == 0)) {
                return i;
            }
        }

        return a * b;
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        for (int i = Math.max(a, b); i >= 1; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                return i;
            }
        }

        return 1;
    }

    public static int getGreatestCommonDivisorByEuclid(int a, int b) {
        if (a > b) {
            a -= b;
        } else {
            b -= a;
        }

        if (a == b) {
            return a;
        }

        return getGreatestCommonDivisorByEuclid(a, b);
    }
}