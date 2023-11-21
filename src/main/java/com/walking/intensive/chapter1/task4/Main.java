package com.walking.intensive.chapter1.task4;

public class Main {
    public static void main(String[] args) {
        // Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println(solveQuadraticEquation(a, b, c));
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
        double squareRoot1, squareRoot2;
        if (a == 0 && b == 0 && c == 0) {
            return "Количество решений: бесконечное множество.";
        }
        if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        }
        if (a == 0) {
            squareRoot1 = -c / b;
            return "Количество решений: 1. Корень: " + ((squareRoot1 == -0.0) ? "0.0" : squareRoot1);
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return "Количество решений: 0.";
        }
        if (discriminant == 0) {
            squareRoot1 = -b / (2 * a);
            return "Количество решений: 1. Корень: " + ((squareRoot1 == -0.0) ? "0.0" : squareRoot1);
        }
        squareRoot1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        squareRoot2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return "Количество решений: 2. Корень: " + ((squareRoot1 > squareRoot2) ? squareRoot2 + " " + squareRoot1 : squareRoot1 + " " + squareRoot2);


    }
}


