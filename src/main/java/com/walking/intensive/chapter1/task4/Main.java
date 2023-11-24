package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 4;
        double b = 12;
        double c = 5;

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

        double x1 = 0, x2 = 0;

        int solutionsNum = 0;
        if (a == 0 && b == 0 && c == 0) {
            solutionsNum = 1;
        } else if (a == 0 && b == 0 && c != 0) {
            solutionsNum = 0;
        } else {

            double discriminant = Math.pow(b, 2) - 4 * a * c;
            System.out.println(discriminant);

            if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                solutionsNum++;
                x2 = (-b - Math.sqrt(discriminant)) / (2*a);
                solutionsNum++;
            }
        }

        System.out.println(x1);
        System.out.println(x2);

        String roots = "";
        switch (solutionsNum) {
            case (1):
                roots = "Корень: " + x1;
                break;
            case (2):
                roots = "Корни: " + x1 + ";" + x2;
                break;
            case (0):
                roots = "";
                break;
            default:
                roots = "Не бывает такого :) ";
         };

        return String.format("Количество решений: %d. %s", solutionsNum, roots);
    }
}