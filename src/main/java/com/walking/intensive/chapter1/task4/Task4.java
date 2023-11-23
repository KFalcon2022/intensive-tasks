package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
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

        String result = "";
        if (a == 0) {
            result =  "Решений бесконечно";
        } else if (b == 0 && c == 0) {
            result = "Количество решений: 1. Корень: 0";
        } else if (b == 0) {
            result = c / a > 0 ? "Количество решений: 0." : "Количество решений: 2. Корни: -" + Math.sqrt(-c / a) + ";" + Math.sqrt(-c / a);
        } else if (c == 0) {
            result = (-b / a) < 0 ? "Количество решений: 2. Корни: " + (-b / a) + ";0" : "Количество решений: 2. Корни: 0;" + (-b / a);
        }
        if (!result.isEmpty()) {
            return result;
        }
        double discriminant = ((b * b) - 4 * a * c);
        if (discriminant < 0) {
            result = "Количество решений: 0.";
        } else if (discriminant == 0) {
            result = "Количество решений: 1. Корень: " + (-b / (2 * a));
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result = x1 < x2 ? "Количество решений: 2. Корни: " + x1 + ";" + x2 : "Количество решений: 2. Корни: " + x2 + ";" + x1;
        }
        return result;
    }
}