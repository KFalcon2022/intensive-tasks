package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(getNodEuclideanAlgorithm(15, 20));
        System.out.println(getNodEuclideanAlgorithm(12, 30));

        System.out.println(getNod(15, 20));
        System.out.println(getNod(12, 30));

        System.out.println(getNod(-5, -30));

        System.out.println(getNoc(15, 20));
        System.out.println(getNoc(7, 30));

        System.out.println(getNoc(7, 3));
        System.out.println(getNod(7, 3));
        System.out.println(getNodEuclideanAlgorithm(7, 0));

    }

    static void checkValue(int m, int n) {
        if (m < 1 || n < 1) {
            throw new IllegalArgumentException("В расчетах допускаются только натуральные числа");
        }
    }

    static int getNoc(int m, int n) {
        checkValue(m, n);

        return (m / getNod(m, n)) * n;
    }

    static int getNod(int m, int n) {
        checkValue(m, n);

        int buffer = m;
        if (m < n) {
            m = n;
            n = buffer;
        }

        while (n > 0) {
            m = m % n;
            buffer = m;
            m = n;
            n = buffer;
        }

        return m;
    }

    static int getNodEuclideanAlgorithm(int m, int n) {
        //переименовал метод, т.к. предлоги плохо использовать в именах
        checkValue(m, n);

        return getNodRecursion(m, n);
    }

    static int getNodRecursion(int m, int n) {
        return n > 0 ? getNodRecursion(n, m % n) : m;
    }


}