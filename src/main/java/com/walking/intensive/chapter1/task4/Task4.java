package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */

public class Task4 {
    public static void main(String[] args) {}

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
        double squareRoot1;
        double squareRoot2;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Решений бесконечно";
                } else {
                    return "Количество решений: 0.";
                }
            } else {
                squareRoot1 = - c / b;
                return "Количество решений: 1. Корень: " + (int) squareRoot1;
            }
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            squareRoot1 = (-b + Math.sqrt(discriminant) / (2 * a));
            squareRoot2 = (-b - Math.sqrt(discriminant) / (2 * a));
            if (squareRoot1 > squareRoot2) {
                double temp = squareRoot1;
                squareRoot1 = squareRoot2;
                squareRoot2 = temp;
            }
            return "Количество решений: 2. Корни: " + (int) squareRoot1 + ";" + (int) squareRoot2;
        } else if (discriminant == 0) {
            squareRoot1 = - b / (2 * a);
            return "Количество решений: 1. Корень: " + (int) squareRoot1;
        } else {
            return "Количество решений: 0.";
        }
    }
}