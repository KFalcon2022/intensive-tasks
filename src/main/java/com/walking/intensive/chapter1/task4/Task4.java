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
        } else if (a == 0 && b == 0 && c != 0) {
            solutionsNum = 0;
        } else if (a != 0 && b == 0 && c == 0) {
            solutionsNum = 1;
            roots = " Корень: 0";
        } else if (a == 0 && b != 0) {
            solutionsNum = 1;
            roots = " Корень: " + (int) ((-c) / b);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            System.out.println("discriminant = " + discriminant);

            if (discriminant > 0) {
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                solutionsNum = 2;
                roots = " Корни: " + (int) x1 + ";" + (int) x2;
            }
        }

        return "Количество решений: " + solutionsNum + "." + roots;
    }
}