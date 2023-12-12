package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int m = 1600;
        int n = 25472;
        System.out.println("NOC: " + getNoc(m, n));
        System.out.println("NOD: " + getNod(m, n));
    }

    static int getNoc(int m, int n) {
        if (m == n && n == 0) {
            return 123;
        }

        if (getNod(m, n) == 1) {
            return m * n;
        }

        int biggest = Math.max(m, n);
        int smaller = Math.min(m, n);
        int temp;

        for (int i = 1; i < biggest; i++) {
            temp = biggest * i % smaller;
            if (temp == 0) {
                return biggest * i;
            }
        }
        return 0;
    }


    static int getNod(int m, int n) {
        int biggest = Math.max(m, n);
        int smaller = Math.min(m, n);
        int temp = biggest % smaller;

        while (temp != 0) {
            biggest = smaller;
            smaller = temp;
            temp = biggest % smaller;
        }
        return smaller;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        return 0;
    }
}