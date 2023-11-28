package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {

    public static void main(String[] args) {
        int a = 84;
        int b = 90;

        System.out.println("Наибольший общий делитель: \n" + getNod(a, b));
        System.out.println("Рекурсия, алгоритм Евклида: \n" + getNodByEuclideanAlgorithm(a, b));
        System.out.println("Наименьшее общее кратное: \n" + getNoc(a, b));

    }

    static int getNoc(int m, int n) {

        return Math.abs(m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {

        while (n != 0) {
            int tempBuffer = n;
            n = m % n;
            m = tempBuffer;
        }
        return m;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {

        if (n == 0) {
            return m;
        } else {
            return getNodByEuclideanAlgorithm(n, m % n);
        }
    }

}