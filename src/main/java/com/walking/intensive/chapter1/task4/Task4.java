package com.walking.intensive.chapter1.task4;

import java.text.DecimalFormat;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 4;
        double b = -2;
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
        DecimalFormat formatter = new DecimalFormat("#.##");
        if (a == 0 && b == 0) {
            if (c == 0) {
                return "Решений бесконечно";
            }
            return "Количество решений: 0.";
        }

        if (((a == 0 && b != 0) || (a != 0 && b == 0)) && c == 0) {
            return "Количество решений: 1. Корень: 0";
        }

        if (a == 0 && b != 0) {
            return "Количество решений: 1. Корень: " + formatter.format(-c / b);
        }

        if (a != 0 && b == 0) {
            double div = -c / a;
            if (div < 0) {
                return "Количество решений: 0.";
            }
            return solveUsingDiscriminant(a, b, c);
        }

        return solveUsingDiscriminant(a, b, c);
    }

    static String solveUsingDiscriminant(double a, double b, double c) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + formatter.format(x1) + ";" + formatter.format(x2);
        }
        if (discriminant == 0) {
            return "Количество решений: 1.  Корень: " + formatter.format(-b / (2 * a));
        }
        return "Количество решений: 0.";
    }
}