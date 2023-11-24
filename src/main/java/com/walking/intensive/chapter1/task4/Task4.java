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
        //        Место для вашего кода
        String message = "Решений бесконечно";

        if (a == 0 & b == 0 & c == 0) {
            return message;
        } else if (a == 0 & b == 0) {
            //double x = -c / b;
            message = "Количество решений: 0.";
            return message;
        } else if (a == 0) {
            double x = -c / b;
            message = String.format("Количество решений: 1. Корень: %.0f", x);
            return message;
        } else {
            double D = (b * b) - (4 * a * c); //дискриминант квадратного уравнения

            if (D < 0) {
                message = "Количество решений: 0.";
            }
            if (D == 0) {
                double x = -b / 2 * a;
                if (x == -0.0){
                    x = Math.abs(x);
                }
                message = String.format("Количество решений: 1. Корень: %.0f", x);
            }
            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                if (x2 > x1) {
                    message = String.format("Количество решений: 2. Корни: %.0f;%.0f" , x1 , x2);
                } else {
                    message = String.format("Количество решений: 2. Корни: %.0f;%.0f" , x2 , x1);
                }
            }
        }

        return message;
    }
}