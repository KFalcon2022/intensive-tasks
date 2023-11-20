package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
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
        //        Место для вашего кода
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double squareRoot1 = 0, squareRoot2 = 0;

        if (Double.isNaN(discriminant)) {
            discriminant = 0;
        }

        if (discriminant < 0) {
            return "Количество решений: 0.";
        }

        if (discriminant == 0) {
            squareRoot1 = -b / (2 * a);
        }

        if (Double.isNaN(squareRoot1)) {
            squareRoot1 = 0;
            return "Количество решений: 1. Корень: " + squareRoot1;
        }

        if (discriminant > 0) {
            squareRoot1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            squareRoot2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }

        if (Double.isNaN(squareRoot1)) {
            squareRoot1 = 0;
        }

        if (Double.isNaN(squareRoot2)) {
            squareRoot2 = 0;
        }

        if (squareRoot1 > squareRoot2) {
            return "Количество решений: 2. Корень: " + squareRoot2 + ", " + squareRoot1;
        }

        else {
            return "Количество решений: 2. Корень: " + squareRoot1 + ", " + squareRoot2;
        }
    }
}