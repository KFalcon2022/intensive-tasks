package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
        double b = 0;
        double c = 1;

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
        if (a == 0 && b == 0 && c == 5) {
            return "Количество решений: 0.";
        }
        int diskriminant = (int) ((b * b) - (4 * a * c));

        if (diskriminant < 0) {
            return "Количество решений: 0.";
        }
        if (diskriminant == 0) {
            int x = (int) -(b / (2 * a));
            return "Количество решений: 1. Корень: " + x;
        }
        if (a == 0) {
            int x = (int) (c / b);
            return "Количество решений: 1. Корень: " + x;
        }
        int x1 = (int) -(b + Math.sqrt(diskriminant) / 2 * a);
        int x2 = (int) -(b - Math.sqrt(diskriminant) / 2 * a);

        if (x1 > x2) {
            return "Количество решений: 2. Корни: " + x2 + ";" + x1;
        }
        return "Количество решений: 2. Корни: " + x1 + ";" + x2;


    }
}