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
        System.out.println("Наибольший общий делитель чисел через алгоритм Евклида: " + getGreatestCommonDivisorEuclidic(a, b));
    }

    public static int getSmallestCommonMultiple(int a, int b) {
        int result = a*b;

        for (int i = Math.min(a, b); i <= a * b; i+=Math.min(a, b)) {
            if ((i % a == 0) && (i % b == 0)) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        int result = 1;

        for (int i = Math.min(a, b); i >= 1; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                result = i;
                break;
            }
        }

        return result;
    }

    public static int getGreatestCommonDivisorEuclidic(int a, int b) {
        if (a > b) {
            a -= b;
        } else {
            b -= a;
        }

        if (a == b) {
            return a;
        }

        return getGreatestCommonDivisorEuclidic(a, b);
    }
}