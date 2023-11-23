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

        if (a == 0 && b == 0 && c == 0 ){
            return "Бесконечное количество решений.";
        }

        if (a == 0 && b == 0) {
            return "Нет решений";
        }

        if (a == 0) {
            return "Количество решений: 1. Корень: " + c / b;
        }


        double d = (b * b) - (4 * a * c);
        if (d < 0) {
            return "Количество решений: 0.";
        }

        if (d == 0) {
            double x = (b * -1) / ( 2 * a );
            return "Количество решений: 1. Корень: " + x;
        }


        double x1 = ((b * -1) + (Math.sqrt(d)) ) / ( 2 * a );
        double x2 = ((b * -1) - (Math.sqrt(d)) ) / ( 2 * a );

        if (x1 < x2) {
                return "Количество решений: 2. Корни:" + x1 + ";" + x2;
            }

        return "Количество решений: 2. Корни:" + x2 + ";"+ x1;

    }
}