package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
        double b = 4;
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
        //        Место для вашего кода
        String resultCount = "Количество решений: %d.";
        String result;

        if (a == 0 && b == 0 && c == 0) {
            result = "Количество решений: бесконечно";
        } else if (a == 0 && b == 0 && c != 0) {
            result = "Количество решений: решений нет";
        } else if (a == 0 && b != 0 && c != 0) {
            result = String.format(resultCount, 1) + String.format(" Корень: %,.2f", c * (-1) / b);
        } else {
            double discr = Math.pow(b, 2) - 4 * a * c;

            if (discr == 0) {
                result = String.format(resultCount, 1) + String.format(" Корень: %,.2f", (-1) * b / (2 * a));
            } else if (discr > 0) {
                result = String.format(resultCount, 2) + String.format(" Корни: %,.2f;%,.2f", ((-1) * b + java.lang.Math.sqrt(discr)) / (2 * a),
                        ((-1) * b - Math.sqrt(discr)) / (2 * a));
            } else {
                result = String.format(resultCount, 0);
            }
        }

        return result;
    }
}