package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 8;
        double b = 3;
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

            if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Решений бесконечно";
                } else {
                    return "Количество решений: 0.";
                }
            } else {
                double aZero = -c / b;
                int roundedAZero = (int)aZero;
                return "Количество решений: 1. Корень: " + roundedAZero;
            }
        } else {

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {

                double firstMS = (-b + Math.sqrt(discriminant)) / (2 * a);
                double secondMS = (-b - Math.sqrt(discriminant)) / (2 * a);
                int roundedFirstMS = (int) Math.floor(firstMS);
                int roundedSecondMS = (int) Math.floor(secondMS);
                return "Количество решений: 2. Корни: " + Math.min(roundedFirstMS, roundedSecondMS) + ";" + Math.max(roundedFirstMS,roundedSecondMS);

            } else if (discriminant == 0) {

                double disZero =  -b / (2 * a);
                int roundedDisZero = (int)disZero;
                return "Количество решений: 1. Корень: " + roundedDisZero;

            } else {

                return "Количество решений: 0.";
            }

        }

    }

}