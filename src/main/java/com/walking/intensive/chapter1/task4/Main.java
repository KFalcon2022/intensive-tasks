package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(solveQuadraticEquation(0, 0, 0));
        System.out.println(solveQuadraticEquation(0, 0, 5));
        System.out.println(solveQuadraticEquation(0, 2, 4));
        System.out.println(solveQuadraticEquation(0, 2, -4));
        System.out.println(solveQuadraticEquation(3, 7, -6));
        System.out.println(solveQuadraticEquation(-1, 7, 8));
        System.out.println(solveQuadraticEquation(4, 4, 1));
        System.out.println(solveQuadraticEquation(2, 1, 1));
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
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Количество решений: Infinity.";
                } else {
                    return "Количество решений: 0.";
                }
            } else {
                return "Количество решений: 1. Корень:" + (-c) / b;
            }
        }

        double discriminant = getDiscriminant(a, b, c);

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            if (x1 < x2) {
                return "Количество решений: 2. Корни: " + x1 + ";" + x2;
            }

            return "Количество решений: 2. Корни: " + x2 + ";" + x1;
        } else if (discriminant == 0) {
            return "Количество решений: 1. Корень:" + (-b) / (2 * a);
        }
        return "Количество решений: 0.";
    }

    static double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}