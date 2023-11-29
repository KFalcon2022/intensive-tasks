package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

        System.out.println(getNoc(24, 54));
        System.out.println(getNod(24, 54));
    }

    static int getNoc(int m, int n) {

        return (m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {

        while (m != n) {
            if (m > n) {
                m -= n;
            } else {
                n -= m;
            }
        }

        return m;
    }

    static int getNodByEuclideanAlgorithm(int m, int n){


        return m;
    }

}