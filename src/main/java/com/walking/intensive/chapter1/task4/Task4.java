package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
        double a = 10;
        double b = 4;
        double c = -40;
        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        }
        if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        }
        if (a == 0) {
            var x = -c / b;
            return "Количество решений: 1. Корень: " + (int)x;
        }
        var discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            return "Количество решений: 0.";
        }
        if (discriminant > 0) {
            var x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            var x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + (int)Math.min(x1, x2) + ";" + (int)Math.max(x1, x2);
        } else {
            var x = -b / (2 * a);
            return "Количество решений: 1. Корень: " + (int)x;
        }
    }
}