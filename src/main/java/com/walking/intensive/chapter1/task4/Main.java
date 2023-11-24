package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
        double b = 0;
        double c = -1;

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
        double discriminant = b * b - 4 * a * c;

        if (a != 0 && discriminant > 0) {
            double root1 = (b * -1 + Math.sqrt(discriminant)) / (a * 2);
            double root2 = (b * -1 - Math.sqrt(discriminant)) / (a * 2);

            return String.format("Количество решений: 2. Корни: %f; %f",
                    Math.min(root1, root2), Math.max(root1, root2));
        }

        if ((a != 0 && discriminant == 0) || (a == 0 && b != 0)) {
            double root;
            if (a != 0) {
                root = (b * -1) / (a * 2);
            } else {
                root = (c * -1) / b;
            }

            return String.format("Количество решений: 1. Корень: %f", root);
        }

        if (a == 0 && c == 0) {
            return "Решений бесконечно";
        }

        return "Количество решений: 0.";
    }
}