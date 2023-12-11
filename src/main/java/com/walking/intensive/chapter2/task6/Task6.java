package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

        System.out.println("NOK by getNoc: " + getNoc(36, 60));
        System.out.println("NOD by getNod: " + getNod(-5, 0));
        System.out.println("NOD by Euclidean: " + getNodByEuclideanAlgorithm(36, 0));

    }

    static int getNoc(int m, int n) {
        return m / getNod(m, n) * n;
    }

    static int getNod(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);

        if (m == 0 || n == 0) {
            return 0;
        }
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else n = n - m;
        }

        return m;
    }


    static int getNodByEuclideanAlgorithm(int m, int n) {
        // m > n; r[0] = m % n; r[1] = n % r[0]; ;...; r[i] % r[i-1];
        // while r[i] == 0; GCD = r[i-1];
        m = Math.abs(m);
        n = Math.abs(n);

        if (m < n) {
            int temp = n;
            n = m;
            m = temp;
        }
        if (n == 0) {
            return m;
        } else return getNodByEuclideanAlgorithm(n, m % n);
    }
}