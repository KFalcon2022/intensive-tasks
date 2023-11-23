package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
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
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        }
        if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        }
        if (a == 0) {
            double root = -c / b;
            return String.format("Количество решений: 1. Корень: %.0f", root);
        }
        double descriminant = b * b - 4 * a * c;
        if (descriminant > 0) {
            double root1 = (-b  + Math.sqrt(descriminant)) / (2 * a);
            double root2 = (-b  - Math.sqrt(descriminant)) / (2 * a);

            if (root2 < root1) {
                double temp = root2;
                root2 = root1;
                root1 = temp;
            }

            return String.format("Количество решений: 2. Корни: %.0f; %.0f", root1, root2);
        }
        if (descriminant - 0 < 0.00001) {
            double root = -b / (2 * a);
            return String.format("Количество решений: 1. Корень: %.0f", root);
        }
        return "Что-то пошло не так";
    }
}