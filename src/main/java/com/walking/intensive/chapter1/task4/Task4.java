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
        String message = "Это не квадратное уравнение (a = 0)";

        if (a != 0) {
            double D = (b * b) - (4 * a * c); //дискриминант квадратного уравнения

            if (D < 0) {
                message = "Дискриминант отрицательный. Действительных корней нет";
            }
            if (D == 0) {
                double x = -b / 2 * a;
                message = "Количество решений: 1. Корень: " + x;
            }
            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                if(x2 > x1) {
                    message = "Количество решений: 2. Корни: " + x1 + ";" + x2;
                } else {
                    message = "Количество решений: 2. Корни: " + x2 + ";" + x1;
                }
            }
        }
        return message;
    }
}