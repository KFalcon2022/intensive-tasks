package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {

        System.out.println(getNoc(24, 54));
        System.out.println(getNod(24, 54));
        System.out.println(getNodByEuclideanAlgorithm(24, 54));
    }

    static int getNoc(int m, int n) {

        return (m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {

        while (m != 0 || n != 0) {
            if (m > n) {
                if (m % n == 0) {

                    return n;
                }
                m %= n;
            } else {
                if (n % m == 0) {

                    return m;
                }
                n %= m;
            }
        }

        return m + n;
    }

    static int getNodByEuclideanAlgorithm(int m, int n){
        if (m % n == 0) {

            return n;
        }
        if (n % m == 0) {

            return m;
        }

        return m > n ? getNodByEuclideanAlgorithm(m % n, n) : getNodByEuclideanAlgorithm(m, n % m);
    }
}
