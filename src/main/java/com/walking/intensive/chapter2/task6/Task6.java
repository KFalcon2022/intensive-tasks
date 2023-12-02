package com.walking.intensive.chapter2.task6;

import java.util.ArrayList;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNodByEuclideanAlgorithm(205,600));
    }

    static int getNoc(int m, int n) {

        return (m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {
        int nod = 0;
        for (int i = 1; i <= n && i <= m; i++) {
            if (m % i == 0 && n % i == 0) {
                nod = i;
            }
        }

        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        int minNumber = Math.min(m, n);
        int remainder = Math.max(m, n) % minNumber;
        System.out.println(m + "    " + n);
        if (remainder != 0) {
            return getNodByEuclideanAlgorithm(minNumber, remainder);
        }

        return minNumber;
    }
}