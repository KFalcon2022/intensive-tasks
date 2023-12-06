package com.walking.intensive.chapter2.task6;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int m = 150;
        int n = 75;

        System.out.println("Наименьшее общее кратное: " + getNoc(m, n));
        System.out.println("Наибольший общий делитель: " + getNod(m, n));
        System.out.println("Наибольший общий делитель по Евклиду " + getNodByEuclideanAlgorithm(m, n));

    }

    static int getNoc(int m, int n) {
        int product = m * n;
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return product / m;
    }

    static int getNod(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        for (int i = m; i >= 1; i--) {
            if (m % i != 0) {
                continue;
            }
            for (int y = n; y >= 1; y--) {
                if (m % i == 0 & n % i == 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {

        int nodByEuclideanAlgorithm;
        if (n == 0) {
            nodByEuclideanAlgorithm = m;
        } else {
            return getNodByEuclideanAlgorithm(n, m % n);
        }
        return nodByEuclideanAlgorithm;
    }
}