package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNoc(1000, 2000));
        System.out.println(getNod(1000, 2000));
        System.out.println(getNodByEuclideanAlgorithm(1000, 2000));
    }

    static int getNoc(int m, int n) {
        return m / getNod(m, n) * n;
    }

    static int getNod(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }

        return m;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n == 0) {
            return m;
        }

        return getNodByEuclideanAlgorithm(n, m % n);
    }

    static int getNoc(int m, int n) {
        // Ваш код
        return 0;
    }

    static int getNod(int m, int n) {
        // Ваш код
        return 0;
    }

    static int getNodByEuclideanAlgorithm(int m, int n){
        // Ваш код
        return 0;
    }

}