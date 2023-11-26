package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        double a = 12;
        double b = 2;
        double c = -18;

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
        if (b == 0 && -c / a < 0) {
            return "Количество решений: 0.";
        }
        if (a == 0) {
            return "Количество решений: 1. Корень: " + (-c) / b;
        }
        if (b == 0 && c == 0) {
            return "Количество решений: 1. Корень: 0";
        }


        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double rootFirst = (-b + Math.sqrt(discriminant)) / (2 * a);
        double rootSecond = (-b - Math.sqrt(discriminant)) / (2 * a);

        return "Количество решений: 2. Корни: " + rootFirst + ", " + rootSecond;
    }
}