package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        double c = 0;

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
            int x1 = (int) (c / b);
            return "Количество решений: 1. Корень: " + x1;
        }

        double discriminant = b * b - 4 * a * c;
        String result;

        if (discriminant < 0) {
            result = "Количество решений: 0.";
        } else if (discriminant == 0) {
            int x1 = (int) (-b / (2 * a));
            result = "Количество решений: 1. Корень: " + x1;
        } else {
            int x1 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
            int x2 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));
            result = "Количество решений: 2. Корни: " + Math.min(x1, x2) + ";" + Math.max(x1, x2);
        }
        return result;
    }
}