package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        double a = 0;
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
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Решений бесконечно";
                }
                return "Количество решений: 0.";
            }
            double root = -c / b;
            return "Количество решений: 1. Корень: " + root;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double firstRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            double secondRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + firstRoot + ";" + secondRoot;
        }

        if (discriminant == 0) {
            double root = -b / (2 * a);
            return "Количество решений: 1. Корень: " + root;
        }

        return "Количество решений: 0.";
    }
}



