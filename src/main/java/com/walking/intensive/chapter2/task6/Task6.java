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
        return (m * n) / getNod;
    }

    static int getNod(int m, int n) {
        int mathAbs_m = Math.abs(m);
        int mathAbs_n = Math.abs(n);
        int maxNum = Math.max(mathAbs_m, mathAbs_n);
        if (n == 0 || m == 0 || mathAbs_m == mathAbs_n) {
            return maxNum;
        }
        int nod = 1;
        for (int i = 2; i < maxNum; i++) {
            if (mathAbs_m % i == 0 && mathAbs_n % i == 0) {
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