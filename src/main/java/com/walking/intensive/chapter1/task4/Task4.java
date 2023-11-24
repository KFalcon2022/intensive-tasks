package com.walking.intensive.chapter1.task4;

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
        String resultCount = "Количество решений: %d.";
        String result;

        if (a == 0 && b == 0 && c == 0) {
            result = "Решений бесконечно";
        } else if (a == 0 && b == 0 && c != 0) {
            result = "Количество решений: 0.";
        } else if (a != 0 && b == 0 && c == 0){
            result = "Количество решений: 1. Корень: 0";
        }
        else if (a == 0 && b != 0 && c != 0) {
            result = String.format(resultCount, 1) + String.format(" Корень: %d", Math.round(c * (-1) / b));
        } else {
            double discr = Math.pow(b, 2) - 4 * a * c;

            if (discr == 0) {
                result = String.format(resultCount, 1) + String.format(" Корень: %d", Math.round((-1) * b / (2 * a)));
            } else if (discr > 0) {
                result = String.format(resultCount, 2) + String.format(" Корни: %d;%d",
                        Math.round(((-1) * b - Math.sqrt(discr)) / (2 * a)),
                        Math.round(((-1) * b + java.lang.Math.sqrt(discr)) / (2 * a)));
            } else {
                result = String.format(resultCount, 0);
            }
        }

        return result;
    }
}