package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
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
        double D = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(D)) / 2 * a;
        double x2 = (-b - Math.sqrt(D)) / 2 * a;

        if (a == 0 & b == 0 & c == 0) {
            return "Решений бесконечно";
        } else if (a == 0 & b == 0 & c != 0) {
            return "Количество решений: 0.";
        } else if (a == 0 & b != 0 & c != 0) {
            return "Количество решений: 1. Корень: " + c / -b;
        } else if (a != 0 & b == 0 & c != 0) {
            if (-c / a < 0) {
                return "Количество решений: 0.";
            } else {
                return "Количество решений: 2. Корни: " + -Math.sqrt(-c / a) + ";" + Math.sqrt(-c / a);
            }
        } else {
            if (D < 0) {
                return "Количество решений: 0.";
            } else if (D == 0) {
                return "Количество решений: 1. Корень: " + x1;
            } else {
                return "Количество решений: 2. Корни: " + -x1 + ";" + x2;
            }
        }
    }
}

