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

        double root1;
        double root2;


        if (a == 0) {
            if (b != 0) {
                root1 = -c / b;
                return "Количество решений: 1. Корень: " + root1;
            }
            if ((b == 0) && (c == 0)) {
                return "Бесконечное число решений.";
            }
        } else {
            double d = b * b - (4 * a * c);
            if (d == 0) {
                root1 = -b / (2 * a);
                return "Количество решений: 1. Корень: " + root1;
            } else if (d > 0) {
                root1 = (-b - Math.sqrt(d)) / (2 * a);
                root2 = (-b + Math.sqrt(d)) / (2 * a);
                if (root1 < root2) {
                    return "Количество решений: 2. Корни: " + root1 + ";" + root2;
                } else
                    return "Количество решений: 2. Корни: " + root2 + ";" + root1;
            }
        }
        return "Количество решений: 0.";
    }
}