package com.walking.intensive.chapter2.task6;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int m = 15;
        int n = 45;
        System.out.println("Наименьшее общее кратное: " + getNoc(m, n));
        System.out.println("Наибольший общий делитель: " + getNod(m, n));
        System.out.println("Наибольший общий делитель по Евклиду " + getNodByEuclideanAlgorithm(m, n));

    }

    static int getNoc(int m, int n) {
        int product = m * n;
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return product / m;
    }

    static int getNod(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        int nod = 0;
        for (int i = Math.min(m, n); i >= 1; i--) {
            if (m % i == 0 & n % i == 0) {
                nod = i;
                break;
            }
        }
        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {

//        int nodByEuclideanAlgorithm;
        if (n == 0) {
            return m;
        }
        return getNodByEuclideanAlgorithm(n, m % n);
    }
}