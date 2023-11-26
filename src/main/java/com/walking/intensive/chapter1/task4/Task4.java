package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */

public class Task4 {
    public static void main(String[] args) {
//        double a = 1;
//        double b = -3;
//        double c = 2;
//
//        System.out.println(solveQuadraticEquation(a, b, c));
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
        // x1 - первый корень, x2 - второй корень
        double x1;
        double x2;

        String solveString = "Количество решений:";

        // Если a равно 0, то уравнение перестает быть квадратным
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return String.format("%s Бесконечное кол-во решений", solveString);
                } else {
                    return String.format("%s 0", solveString);
                }
            } else {
                x1 = - c / b;
                return String.format("%s 1. Корень: %.1f", solveString, x1);
            }
        }

        // Вычисляем дискриминант
        double D = b * b - 4 * a * c;

        if (D > 0) {
            x1 = (-b + Math.sqrt(D) / (2 * a));
            x2 = (-b - Math.sqrt(D) / (2 * a));
            if (x1 > x2) {
                double temp = x1;
                x1 = x2;
                x2 = temp;
            }
            return String.format("%s 2. Корень: %.1f; %.1f", solveString, x1, x2);
        } else if (D == 0) {
            x1 = - b / (2 * a);
            return String.format("%s 1. Корень: %.1f", solveString, x1);
        } else {
            return String.format("%s 0.", solveString);
        }
    }
}