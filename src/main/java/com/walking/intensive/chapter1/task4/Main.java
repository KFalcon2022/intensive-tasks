package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(solveQuadraticEquation(4, -5, 6));
        System.out.println(solveQuadraticEquation(2, -7, 8));
        System.out.println(solveQuadraticEquation(0, 0, 0));
        System.out.println(solveQuadraticEquation(0, 0, 5));
        System.out.println(solveQuadraticEquation(1, -3, 2));

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
        if (a == 0 && b == 0 && c == 0) {
            return "Количество решений: бесконечное количество";
        }

        if (a == 0 & b == 0) {
            return "Количество решений: 0";
        }

        if (a == 0) {
            double x = -c / b;
            return "Количество решений: 1. Корень: " + x;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + Math.min(x1, x2) + " ; " + Math.max(x1, x2);
        }

        if (discriminant == 0) {
            double x = -b / (2 * a);
            return "Количество решений: 1. Корень: " + x;
        }

        return "Количество решений: 0";
    }
}
