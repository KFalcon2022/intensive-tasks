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

        if (a == 0) {

            if (b != 0 ) {
                double root = (-c) / b;
                return "Количество решений: 1. Корень: " + Math.round(root);
            } else {
                return "Количество решений: 0.";
            }
        }

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant == 0) {
            double root = -b / (2 * a);
            return "Количество решений: 1. Корень: " + Math.round(root);
        }

        if (discriminant > 0) {
            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + Math.round(root1) + ";" + Math.round(root2);
        }

        return "Количество решений: 0.";
    }
}