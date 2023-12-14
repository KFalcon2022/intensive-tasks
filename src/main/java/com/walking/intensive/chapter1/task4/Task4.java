package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 2;
        double b = 8;
        double c = 8;

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

        double D = Math.pow(b, 2) - 4 * a * c;

        if (D < 0 || (a == 0 && b == 0)) {
            return "Количество решений: 0.";
        }

        double sqrtD = Math.sqrt(D);
        double denominator = 2 * a;

        if (D == 0 || a == 0) {
            return "Количество решений: 1. Корень: " + (a == 0 ? (int) (-c / b) : (int) (-b / denominator));
        }

        int x1 = (int) ((-b + sqrtD) / denominator);
        int x2 = (int) ((-b - sqrtD) / denominator);
        return "Количество решений: 2. Корни: " + Math.min(x1, x2) + ";" + Math.max(x1, x2);
    }
}