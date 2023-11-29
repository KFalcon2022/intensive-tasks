package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNod(98, 35));
        System.out.println(getNoc(98, 35));
        System.out.println(getNodByEuclideanAlgorithm(98, 35));
    }

    static int getNoc(int m, int n) {
        int getNod = getNod(m, n);
        int mult = m * n;
        int result = mult / getNod;
        return result;
    }

    static int getNod(int m, int n) {
        int maxNum = Math.max(Math.abs(m), Math.abs(n));
        int nod = 1;
        if (n == 0 || m == n) {
            return Math.abs(m);
        }
        for (int i = 2; i < maxNum; i++) {
            if (Math.abs(m) % i == 0 && Math.abs(n) % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n == 0) {
            return Math.abs(m);
        }
        return getNodByEuclideanAlgorithm(n, m % n);
    }

}