package com.walking.intensive.chapter1.task4;

import static java.lang.Math.sqrt;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(solveQuadraticEquation(1, 0, -1));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        double x1 = 0, x2 = 0;
        int amountSolution = 0;

        double d = b * b - 4 * a * c;
        if (Double.isNaN(x1)) {
            amountSolution = 3;
        }
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            amountSolution = 2;
        }
        if (d == 0) {
            x1 = -b / (2 * a);
            amountSolution = 1;
        }
        if (a == 0) {
            System.out.println("Это не квадратное уравнение");
            amountSolution = 0;
        }
        return switch (amountSolution) {
            case 3 -> "Решений бесконечно";
            case 2 -> "Количество решений: 2. Корни: " + Math.min(x1, x2) + ";" + Math.max(x1, x2);
            case 1 -> "Количество решений: 1. Корень: " + x1;
            case 0 -> "Количество решений: 0.";
            default -> "Решений бесконечно";
        };
    }
}
