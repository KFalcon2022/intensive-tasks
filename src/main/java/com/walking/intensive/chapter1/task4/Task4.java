package com.walking.intensive.chapter1.task4;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
        double b = 0;
        double c = -1;

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
        //        Место для вашего кода
        String resultCount = "Количество решений: %d.";
        int[] roots = new int[2];

        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        } else if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        } else if (b == 0 && c == 0) {
            return "Количество решений: 1. Корень: 0";
        } else if (a == 0) {
            roots[0] = (int) Math.round(c * (-1) / b);
            return String.format(resultCount, 1) + String.format(" Корень: %d", roots[0]);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant == 0) {
                roots[0] = (int) Math.round((-1) * b / (2 * a));
                return String.format(resultCount, 1) + String.format(" Корень: %d", roots[0]);
            } else if (discriminant > 0) {
                roots[0] = (int) Math.round(((-1) * b - Math.sqrt(discriminant)) / (2 * a));
                roots[1] = (int) Math.round(((-1) * b + java.lang.Math.sqrt(discriminant)) / (2 * a));
                Arrays.sort(roots);
                return String.format(resultCount, 2) + String.format(" Корни: %d;%d",
                        roots[0],
                        roots[1]);
            } else {
                return String.format(resultCount, 0);
            }
        }

    }
}