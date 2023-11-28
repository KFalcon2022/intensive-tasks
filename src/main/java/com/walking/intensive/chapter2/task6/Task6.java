package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

    }

    static int getNoc(int m, int n) {
        if (getNod(m, n) == 0) {
            return 0;
        } else {
            return Math.abs(m * n) / getNod(m, n);
        }
    }

    static int getNod(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        int nod = 1;
        for (int i = 1; i <= Math.min(m, n); i++) {
            if (m % i == 0 && n % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n){
        // Ваш код
        return 0;
    }

}