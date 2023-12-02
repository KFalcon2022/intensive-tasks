package com.walking.intensive.chapter1.task4;

import java.lang.Math;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
        double b = 3;
        double c = 0;

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

        if (a == 0 && a == b && b == c) {
            return "Решений бесконечно";
        }

        double discriminant = b * b - 4 * a * c;
        if (a == 0 && b == 0 || discriminant < 0) {
            return "Количество решений: 0.";
        }

        if (a == 0) {
            return "Количество решений: 1. Корень: " + (int) (c / b);
        }

        if (c == 0 && b != 0) {
            double singleRoot = -b / a;
            return "Количество решений: 2. Корни: "
                    + (int) Math.min(singleRoot, 0) + ";" + (int) Math.max(singleRoot, 0);
        }

        if (discriminant > 0) {
            double firstRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            double secondRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " +
                    (int) Math.min(firstRoot, secondRoot) + ";" + (int) Math.max(firstRoot, secondRoot);
        } else {
            return "Количество решений: 1. Корень: " + (int) (-b / (2 * a));
        }
    }
}