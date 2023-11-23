package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        double a = -4;
        double b = 8;
        double c = 12;

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
        if (a == 0) {
            if (b == 0) {
                return c == 0 ? "Решений бесконечно" : "Количество решений: 0.";
            } else {
                double x = -c / b;
                return "Количество решений: 1. Корень: " + x;
            }
        }

        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            return "Количество решений: 2. Корень: " + Math.min(x1, x2) + ";" + Math.max(x1, x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            return "Количество решений: 1. Корень: " + x;
        } else {
            return "Количество решений: 0.";

        }
    }
}