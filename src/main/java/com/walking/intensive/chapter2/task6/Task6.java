package com.walking.intensive.chapter2.task6;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int m = 7;
        int n = 7;

        System.out.println("Наименьшее общее кратное: " + getNoc(m, n));
        System.out.println("Наибольший общий множитель: " + getNod(m, n));
        System.out.println("Наибольший общий множитель по Евклиду " + getNodByEuclideanAlgorithm(m, n));

    }

    static int getNoc(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);

        for (int i = 1; i <= (Math.max(m, n)); i++) {
            for (int y = 1; y <= (Math.max(m, n)); y++) {
                if (m * i == n * y) {
                    return n * y;
                }
            }
        }
        return 0;
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
        m = Math.abs(m);
        n = Math.abs(n);
        if (m != 0 & n != 0) {
            if (m > n) {
                if (m % n == 0) {
                    return n;
                }
                return getNodByEuclideanAlgorithm(m % n, n);
            } else {
                if (n % m == 0) {
                    return m;
                }
                return getNodByEuclideanAlgorithm(n % m, m);
            }
        }
        return 0;
    }
}