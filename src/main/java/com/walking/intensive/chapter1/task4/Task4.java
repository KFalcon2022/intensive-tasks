package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 1;
        double c = 2;

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
        //не полные квадратные уровнения
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        }
        if (a == 0 && b != 0 && c != 0) {
            return "Количество решений: 1. Корень: " + c;
        }
        if (b == 0 && c != 0) {
            double multiplier = (-c) / a;
            if (multiplier > 0) {
                double rootOne = -Math.sqrt((-c) / a);
                double rootTwo = Math.sqrt((-c) / a);
                return "Количество решений: 2. Корни " + rootOne + ";" + rootTwo;
            }
            if (multiplier < 0) {
                return "Количество решений: 0.";
            }
        }
        if (b != 0 && c == 0) {
            return "Количество решений: 2. Корни " + 0 + ";" + ((-b) / a);
        }
        if (b == 0 && c == 0) {
            return "Количество решений: 1. Корень 0";
        }

        //полные квадратные уравнения
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            return "Количество решений: 0.";
        }
        if (discriminant > 0) {
            double rootOne = (-b - Math.sqrt(discriminant)) / (2 * a);
            double rootTwo = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни " + rootOne + ";" + rootTwo;
        }
        return "Количество решений: 1. Корень " + ((-b) / (2 * a));
    }
}
