package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 2;
        double b = 0;
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
        String solution = "Количество решений: ";

        if ((a == 0) && (b != 0)) {
            double x = -c / b;
            return solution + "1. Корень: " + x;
        } else if ((b == 0) && (a == 0) && (c != 0)) {
            return solution + "0. Решений не существует (в действительных числах)";
        } else if ((b == 0) && (a == 0) && (c == 0)) {
            return solution + "бесконечное множество решений";
        } else {
            double determinant = Math.pow(b, 2) - 4 * a * c;
            if (determinant > 0) {
                double x1 = (-b + Math.sqrt(determinant)) / 2 / a;
                double x2 = (-b - Math.sqrt(determinant)) / 2 / a;
                if (x1 > x2) {
                    double temp = x1;
                    x1 = x2;
                    x2 = temp;
                }
                return solution + "2. Корни: " + x1 + ";" + x2;
            } else if (determinant == 0) {
                double x = -b / 2 / a;
                return solution + "1. Корень: " + x;
            } else {
                return solution + "0. Решений не существует (в действительных числах)";
            }
        }
    }
}