package com.walking.intensive.chapter1.task4;

import static java.lang.Math.sqrt;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
        double b = 0;
        double c = -1;
        System.out.println(solveQuadraticEquation(a, b, c));
    }

    /**
     * При формировании строки, корни уравнения должны указываться по возрастанию.     * <p>
     * Примеры результирующей строки:     * <p>
     * Количество решений: 2. Корни: -4;4     * <p>
     * Количество решений: 1. Корень: 0     * <p>
     * Количество решений: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {
        double x1 = 0;
        double x2 = 0;
        int amountSolution = 0;
        String result = "";

        double d = b * b - 4 * a * c;
        if (a==0 & b ==0 & c !=0){
            return "Количество решений: 0.";
        }
        if (d > 0) {
            x1 = (-b + sqrt(d)) / (2 * a);
            x2 = (-b - sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
            amountSolution = 2;
        } else {
            if (d == 0) {
                x1 = -b / (2 * a);
                amountSolution = 1;
            }
        }
        if (amountSolution == 2) {
            result = "Количество решений: 2. Корни: " + Math.min(x1, x2) + ";" + Math.max(x1, x2);
        } else {
            if (amountSolution == 1) {
                if (x1==0){
                    x1 = (int)x1;
                }
                result = "Количество решений: 1. Корень: " + x1;
            } else {
                result = "Количество решений: 0.";
            }
        }
        System.out.println(d);
        if (Double.isNaN(x1)) {
            result = "Решений бесконечно";
        }
        return result; // Заглушка. При реализации - удалить    }
    }
}