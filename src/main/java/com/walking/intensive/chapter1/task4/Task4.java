package com.walking.intensive.chapter1.task4;
import java.lang.Math;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        double a = 0;
        double b = 5;
        double c = -10;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "Бесконечное множество решений";
        }
        if (a == 0 && b == 0 && c != 0 || b == 0 && c > 0) {
            return "invalid numbers";
        }
        if (b == 0 && c < 0) {
            double x1 = Math.sqrt(-c / a);
            double x2 = -Math.sqrt(-c / a);
            return "Количество решений: 2. Корни: " + Math.min(x1, x2) + ";" + Math.max(x1, x2);
        }
        if (b == 0 && c == 0) {
            return "Количество решений: 1. Корень: 0";
        }
        if (a == 0) {
            return String.format("Количество решений: 1. Корень %f", -c / b);
        }
        double diskr = b * b - 4 * a * c;
        double x1 = ((-b + Math.sqrt(diskr)) / 2 * a);
        double x2 = ((-b - Math.sqrt(diskr)) / 2 * a);
        if (diskr < 0) {
            return "Количество решений: 0.";
        }
        if (diskr == 0) {
            return String.format("Количество решений: 1. Корень: %f", x1);
        }
        return "Количество решений: 2. Корни: " + Math.min(x1, x2) + ";" + Math.max(x1, x2);

    }
}