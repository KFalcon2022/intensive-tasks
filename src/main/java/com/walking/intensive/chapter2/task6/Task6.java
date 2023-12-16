package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNoc(9, 81));
        System.out.println(getNod(88, 648));
        System.out.println(getNodByEuclideanAlgorithm(54, 765));
    }

    static int getNoc(int m, int n) {
        int noc = m * n;

        for (int i = noc; i >= m; i -= m) {
            if (i % n == 0) {
                noc = i;
            }
        }

        return noc;
    }

    static int getNod(int m, int n) {
        int nod = 1;
        int min = Math.min(m, n);

        for (int i = min; i >= 1; i--) {
            if ((m % i == 0) && (n % i == 0)) {
                nod = i;
                break;
            }
        }

        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (m % n == 0) {
            return n;
        }

        return getNodByEuclideanAlgorithm(n, m % n);
    }

}
