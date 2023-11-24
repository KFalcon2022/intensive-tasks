package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 4;
        double c = 2;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    /**
     * При формировании строки, корни уравнения должны указываться по возрастанию.
     * <p>
     * Примеры результирующей строки:
     * <p>
     * Количество решений: 2. Корни: -4;4
     * <p>
     * Количество решений: 1. Корень: 0
     * <p>
     * Количество решений: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {

        double d = b * b - 4 * a * c;

        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        }

        if (a == 0 && b == 0 || d < 0) {
            return "Количество решений: 0.";
        }

        if (a == 0) {
            int x = (int) Math.round(-c/b);

            return "Количество решений: 1. Корень: " + x;
        }

        if (d == 0) {
            int x = (int) Math.round(-b / (2 * a));

            return "Количество решений: 1. Корень: " + x;
        }

        int x1 = (int) Math.round((-b + Math.sqrt(d)) / (2 * a)), x2 = (int) Math.round((-b - Math.sqrt(d)) / (2 * a));

        if (x1 < x2) {
            return "Количество решений: 2. Корни: " + x1 + ";" + x2;
        }
        return "Количество решений: 2. Корни: " + x2 + ";" + x1;

    }
}
