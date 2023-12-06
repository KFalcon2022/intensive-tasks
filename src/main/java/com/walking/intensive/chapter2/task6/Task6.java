package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

    }

    static int getNoc(int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        }
        int greaterNumber = Math.max(m, n);
        int smallerNumber = Math.min(m, n);
        int noc = greaterNumber;
        while (noc % smallerNumber != 0) {
            noc += noc;
        }
        return noc;


    }

    static int getNod(int m, int n) {
        // Ваш код
        if (m == 0 || n == 0) {
            return 0;
        }
        return getNoc(m, n) / Math.abs(m * n);
    }

    static int getNodByEuclideanAlgorithm(int m, int n){
        // Ваш код
        if (m == 0 || n == 0) {
            return 0;
        }

            while (m != n) {
                if (m > n) {
                    m = m - n;
                } else {
                    n = n - m;
                }
            }
            return m;
    }

}