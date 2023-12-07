package com.walking.intensive.chapter2.task6;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n = in.nextInt();
        System.out.print("Введите второе число: ");
        int m = in.nextInt();

        // System.out.println("NOD: " + getNod(n, m));
        System.out.print("NOC: " + getNoc(n, m));
    }

    static int getNoc(int m, int n) {
        if (n == 0 && m == 0) {
            return 0;
        }
        if (n == m) {
            return n;
        }
        if (Integer.max(m, n) % Integer.min(m, n) == 0) {
            return Integer.max(m, n);
        }
        if (getNod(n, m) == 1) {
            return n * m;
        }
        int rec = Integer.max(m, n);
        while (rec % Integer.min(m, n) != 0 || rec % Integer.max(m, n) != 0) {
            rec += Integer.max(m, n);
        }
        return rec;
    }

    static int getNod(int m, int n) {
        if (n == 0 && m == 0) {
            return 1;
        }
        if (n == m) {
            return n;
        }
        if (Integer.max(m, n) % Integer.min(m, n) == 0) {
            return Integer.min(m, n);
        }
        int min = Integer.min(m, n), max = Integer.max(m, n), rec = 0;
        while (max % min != 0) {
            rec = max;
            max = Integer.max(min, rec - min);
            min = Integer.min(min, rec - min);
        }
        return min;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n == 0 && m == 0) {
            return 1;
        }
        if (n == m) {
            return n;
        }
        if (Integer.max(m, n) % Integer.min(m, n) == 0) {
            return Integer.min(m, n);
        }
        return getNodByEuclideanAlgorithm(Integer.min(m, n), Integer.max(m, n) % Integer.min(m, n));
    }
}