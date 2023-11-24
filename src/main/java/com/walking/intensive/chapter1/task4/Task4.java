package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        double a = 1;
        double b = 0;
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
        String solution;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    solution = "Решений бесконечно";
                } else {
                    solution = "Количество решений: 0.";
                }
            } else {
                int x = (int) (-c / b);
                solution = "Количество решений: 1. Корень: " + x;
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                int x2 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
                int x1 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
                solution = "Количество решений: 2. Корни: " + x1 + ";" + x2;
            } else if (discriminant == 0) {
                int x = (int) (-b / (2 * a));
                solution = "Количество решений: 1. Корень: " + x;
            } else {
                solution = "Количество решений: 0.";
            }
        }

        return solution;
    }
}
