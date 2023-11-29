package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int a = 13;
        int b = 19;

        System.out.println(getNoc(a, b));
        System.out.println(getNod(a, b));
    }

    static int getNoc(int m, int n) {
        int noc;
        int index = 1;

        while (true) {
            if (index % m == 0 && index % n == 0) {
                noc = index;
                break;
            }
            index++;
        }
        return noc;
    }

    static int getNod(int m, int n) {
        int nod = 0;

        for (int i = Integer.MAX_VALUE; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {

        return 0;
    }
}