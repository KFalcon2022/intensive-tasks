package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 0;
        double c = 5;

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
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        }

        if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        }

        double x1 = 0;
        double x2 = 0;
        double d = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            x1 = -c / b;
            return String.format("Количество решений: 1. Корень: %d", (int) x1);
        }

        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / 2 * a;
            x2 = (-b + Math.sqrt(d)) / 2 * a;
            return String.format("Количество решений: 2. Корни: %d;%d", (int) x1, (int) x2);
        }

        if (d == 0) {
            x1 = (-b - Math.sqrt(d)) / 2 * a;
            return String.format("Количество решений: 1. Корень: %d", (int) x1);
        }

        return "Количество решений: 0.";
    }
}