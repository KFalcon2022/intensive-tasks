package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        double a = 6;
        double b = 100;
        double c = 10;

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {

        if (a == 0 && b == 0 && c == 0) {
            return "Бесконечное количество решений";
        }

        if (a == 0 && b == 0) {
            return "Нет решений";
        }

        if (a == 0) {
            double x1 = -c / b;
            return "Количество решений: 1. Корень: " + x1;
        }

        double discriminant = b * b - 4 * a * c;
        String result;

        if (discriminant < 0) {
            result = "Количество решений: 0.";
        } else if (discriminant == 0) {
            double x1 = -b / (a * a);
            result = "Количество решений: 1. Корень: " + x1;
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (a * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (a * a);
            result = "Количество решений: 2. Корни: " + Math.min(x1, x2) + ", " + Math.max(x1, x2);
        }
        return result;
    }
}