package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 2;
        double b = -8;
        double c = 4;

        System.out.println(solveQuadraticEquation(a, b, c));

    } static String beautifier (double d) {
        int beautified;
        try {
            beautified = Integer.valueOf((int) d);
            return String.valueOf(beautified);
        }
        catch (Exception e) {
            return String.valueOf(d);
        }
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
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        } else if (a == 0 && b == 0 && c != 0) {
            return "Количество решений: 0.";
        } else if (a == 0 && b != 0) {
            return "Количество решений: 1. Корень: " + beautifier(-c / b);
            //String.valueOf(-c / b);
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant < 0) {
                return "Количество решений: 0.";
            } else if (discriminant == 0) {
                return "Количество решений: 1. Корень: " + beautifier(-b / 2 * a);
                //String.valueOf(-b / 2 * a);
            } else {
                return "Количество решений: 2. Корни: " + beautifier((-b - Math.sqrt(discriminant)) / (2 * a))  + ";" + beautifier((-b + Math.sqrt(discriminant)) / (2 * a));
                //String.valueOf(-b + Math.sqrt(discriminant) / 2 * a) + ";" + String.valueOf(-b - Math.sqrt(discriminant) / 2 * a);
            }
        }
    }
}