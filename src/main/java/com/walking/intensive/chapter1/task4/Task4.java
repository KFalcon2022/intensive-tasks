package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double c = 2;

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {

        if (a == 0 && b == 0 && c != 0) {
            return "Количество решений: 0.";
        }

        if (a == 0 && b == 0) {
            return "Решений бесконечно";
        }

        double x1, x2;

        if (a == 0) {
            x1 = ((c / b) * -1);
            return "Количество решений:  1. Корень: " + x1;
        }

        if (b == 0 && c == 0) {
            return "Количество решений:  1. Корень: 0";
        }

        //Количество корней и решений
        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            x1 = ((-1 * b) / (2 * a));
            return " Корень: " + x1;
        }

        if (discriminant > 0) {
            x1 = ((-1 * b - Math.sqrt(discriminant)) / (2 * a));
            x2 = ((-1 * b + Math.sqrt(discriminant)) / (2 * a));

        } else {
            return "Количество решений: 0.";
        }

        return "Количество решений: 2. Корни: " + x1 + ";" + x2;
    }
}