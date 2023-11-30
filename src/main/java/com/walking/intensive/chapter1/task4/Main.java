package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = 4;
        double c = 5;

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {

        String resultCount = "Количество решений: %d.";

        if (a == 0 && b == 0 && c == 0) {
            return "Количество решений: бесконечно";
        }

        if (a == 0 && b != 0 && c != 0) {
            return String.format(resultCount, 1) + String.format(" Корень: %,.2f", c * (-1) / b);
        }

        double discr = (b * b) - (4 * a * c);

        if (discr == 0) {
            return String.format(resultCount, 1) + String.format(" Корень: %,.2f", (-1) * b / (2 * a));
        }
        if (discr > 0) {
            return String.format(resultCount, 2) + String.format(" Корни: %,.2f;%,.2f", ((-1) * b + java.lang.Math.sqrt(discr)) / (2 * a),
                    ((-1) * b - java.lang.Math.sqrt(discr)) / (2 * a));
        }

        return String.format(resultCount, 0);
    }
}