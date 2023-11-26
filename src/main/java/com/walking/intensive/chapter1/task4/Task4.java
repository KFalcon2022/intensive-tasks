package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 5;
        double b = 1;
        double c = 4;

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

        int solutionsNum = 0;
        String roots = "";

        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        }

        if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        }

        if (b == 0 && c == 0) {
            return "Количество решений: 1. Корень: 0";
        }

        if (a == 0) {
            solutionsNum = 1;
            roots =  String.format(" Корень: %.1f", (-c) / b);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            System.out.println("discriminant = " + discriminant);

            if (discriminant > 0) {
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                solutionsNum = 2;
                roots = String.format(" Корни: %.1f; %.1f", x1, x2);
            }
        }

        return "Количество решений: " + solutionsNum + "." + roots;
    }
}