package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 1;
        double b = -8;
        double c = 15;

        System.out.println(solveQuadraticEquation(a, b, c));

    }
    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        } else if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        } else if (a == 0 && c != 0) {
            double x1 = -c / b;
            return "Количество решений: 1. Корень: " +  x1;
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: -1;1 x1 " + x1 + ", x2 = " + x2;

        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
            return "Количество решений: 1, x = " + x;

        } else {
            return "Количество решений: 0.";
        }
    }
}

