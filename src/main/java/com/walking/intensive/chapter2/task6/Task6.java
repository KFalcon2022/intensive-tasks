package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 25;
        System.out.printf("Наименьшее общее кратное чисел %d и %d равно %d\n",firstNumber, secondNumber, getNoc(firstNumber, secondNumber));
        System.out.printf("Наибольший общий делитель(через рекурсию методом Евклида) чисел %d и %d равно %d\n", firstNumber, secondNumber, getNodByEuclideanAlgorithm(firstNumber, secondNumber));
        System.out.printf("Наибольший общий делитель чисел %d и %d равно %d\n", firstNumber, secondNumber, getNod(firstNumber, secondNumber));
    }

    static int getNoc(int m, int n) {
        return Math.abs(m * n) / getNodByEuclideanAlgorithm(m, n);
    }

    static int getNod(int m, int n) {
        while (m != 0 && n != 0) {
            if (m > n) {
                m = m % n;
            } else {
                n = n % m;
            }
        }

        return m + n;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        if (n != 0 && m != 0) {

            //return m > n ? getNodByEuclideanAlgorithm(m % n, n) : getNodByEuclideanAlgorithm(m, n % m);
            return getNodByEuclideanAlgorithm(Math.max(m,n) % Math.min(m,n), Math.min(m,n));
        }

        return n + m;
    }

}