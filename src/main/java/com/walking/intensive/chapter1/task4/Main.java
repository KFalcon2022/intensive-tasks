package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
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
//        a × x2 + b × x + c = 0 .
        double D = Math.pow(b, 2) - (4.0 * a * c);
        if (D < 0) {
            return "Количество решений: 0.";
        }

        double x1;
        if (Double.compare(a, 0.0) == 0) {
            if (Double.compare(b, 0.0) == 0) {
                if (Double.compare(c, 0.0) == 0) {
                    return "Решений бесконечно";
                }
                return "Количество решений: 0.";
            }
            x1 = -c / b;
            return "Количество решений: 1. Корень: " + x1;
        }

        x1 = (-b + Math.sqrt(D)) / (2.0 * a);
        if (Double.compare(D, 0.0) == 0) {
            return "Количество решений: 1. Корень: " + x1;
        }

        double x2 = (-b - Math.sqrt(D)) / (2.0 * a);
        return "Количество решений: 2. Корни: " + x1 + ";" + x2;
    }
}