package com.walking.intensive.chapter2.task6;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-NOKNOD.html">ссылка</a>
 */
public class Task6 {
    public static void main(String[] args) {
        int m = 10;
        int n = 25;

        //validation
        if (validationInput(m, n)) {
            System.out.println("НОК(" + m + ", " + n + ") = " + getNoc(m, n));
            System.out.println("НОД(" + m + ", " + n + ") = " + getNod(m, n));
            System.out.println("НОД (рекурсивниый Евклид) (" + m + ", " + n + ") = " + getNodByEuclideanAlgorithm(m, n));

        } else {
            System.out.println("Введённые числа не соответствуют условиям задачи");
        }
    }

    static boolean validationInput(int m, int n) {
        // проверка на то, что положительные
        return m > 0 && n > 0;
    }

    static int getNoc(int m, int n) {

        return Math.abs(m * n) / getNod(m, n);
    }

    static int getNod(int m, int n) {
        int nod = 1; // начально значение НОД
        int min = Math.min(m, n); // находим наименьшее число между m і n

        for (int i = 2; i <= min; i++) {
            if (m % i == 0 && n % i == 0) {
                nod = i; // обновляем НОД если нашли общий делитель
            }
        }

        return nod;
    }

    static int getNodByEuclideanAlgorithm(int m, int n) {
        // Рекурсивная реализация алгоритма Евклида
        if (n == 0) {
            return m;
        }
        return getNodByEuclideanAlgorithm(n, m % n);
    }

}