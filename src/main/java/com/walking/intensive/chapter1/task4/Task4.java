package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        /*double a = 4;
        double b = 2;
        double c = 5;*/

        System.out.println(solveQuadraticEquation(0, 0, 0));
        System.out.println(solveQuadraticEquation(0, 0, 5));
        System.out.println(solveQuadraticEquation(0, 1, 2));
        System.out.println(solveQuadraticEquation(1, 0, 0));
        System.out.println(solveQuadraticEquation(1, 0, 1));
        System.out.println(solveQuadraticEquation(1, 0, -1));

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

        if (a == 0 & b == 0 & c == 0) {
            return "Решений бесконечно";
        }

        double D = b * b - 4 * a * c;

        if (a == 0 & b == 0 || D < 0) {
            return "Количество решений: 0.";
        } else if (a == 0) {
            double solutionA = -c / b;
            return "Количество решений: 1. Корень: " + solutionA;
        } else if (D == 0) {
            double solutionA = -b / (2 * a);
            return "Количество решений: 1. Корень: " + solutionA;
        } else {
            double solutionA = (-b - Math.sqrt(D)) / (2 * a);
            double solutionB = (-b + Math.sqrt(D)) / (2 * a);
            return "Количество решений: 2. Корни: " + solutionA + ";" + solutionB;
        }
    }
}