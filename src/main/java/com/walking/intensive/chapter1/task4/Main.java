package com.walking.intensive.chapter1.task4;

import static java.lang.Math.sqrt;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 0;
        double c = 3;

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
        double d = 0;
        double x1 = 0;
        double x2 = 0;
        int amountSolution = 0;
        String result = "";

        d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = (-b + sqrt(d)) / (2 * a);
            x2 = (-b - sqrt(d)) / (2 * a);
            amountSolution = 2;
        } else {
            if (d == 0) {
                x1 = -b / (2 * a);
                amountSolution = 1;
            }
        }
        if (amountSolution == 2) {
            result = "Количество решений: 2. Корни: " + Math.min(x1, x2) + ";" + Math.max(x1, x2);
        } else {
            if (amountSolution == 1) {
                result = "Количество решений: 1. Корень: " + x1;
            } else {
                result = "Количество решений: 0.";
            }
        }
        if (Double.isNaN(x1)) {
            result = "Невозможное уравнение";
        }
        return result; // Заглушка. При реализации - удалить
    }
}