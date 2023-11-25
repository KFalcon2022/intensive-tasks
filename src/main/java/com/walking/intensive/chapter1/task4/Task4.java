package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        System.out.println(solveQuadraticEquation(0, 0, 0));
        System.out.println(solveQuadraticEquation(0, 0, 5));
        System.out.println(solveQuadraticEquation(0, 1, 2));
        System.out.println(solveQuadraticEquation(1, 0, 0));
        System.out.println(solveQuadraticEquation(1, 0, 1));
        System.out.println(solveQuadraticEquation(1, 0, -1));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 & b == 0 & c == 0) {
            return "Решений бесконечное множество";
        }
        if (a == 0 & b == 0) {
            return "Количество решений: 0.";
        }
        if (a == 0 & b != 0) {
            double xOne = -c / b;
            return String.format("Количество решений: 1. Корень %.3f", xOne);
        }

        double D = Math.pow(b, 2) - 4 * a * c;

        if (D > 0) {
            double xOne = ((-b) - Math.sqrt(D)) / (2 * a);
            double xTwo = ((-b) + Math.sqrt(D)) / (2 * a);
            return xOne > xTwo ? String.format("Количество решений: 2. Корни: %.3f; %.3f", xTwo, xOne) : String.format("Количество решений: 2. Корни: %.3f; %.3f", xOne, xTwo);
        } else if (D == 0) {
            double xOne = b / (2 * a);
            return String.format("Количество решений: 1. Корень %.3f", xOne);
        }

        return "Количество решений: 0.";
    }
}