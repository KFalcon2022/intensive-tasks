package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 3;
        double b = 2;
        double c = 0;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    static String solveQuadraticEquation(double a, double b, double c) {

        if (a == 0 && b != 0) {
            return ("Количество решений: 1. Корень:" + -c / b);
        }

        if (a == 0 && b == 0 && c == 0) {
            return ("Количество решений: бесконечно");
        }

        if (a == 0 && b == 0 && c != 0) {
            return ("Количество решений: 0");
        }

        double d = b * b - 4 * a * c;

        double x1 = (-b - Math.sqrt(d)) / (2 * a);

        double x2 = (-b + Math.sqrt(d)) / (2 * a);

        if (d == 0)

            return ("Количество решений: 1. Корень:" + x1);

        else if (d < 0)

            return ("Количество решений: 0");

        else if (x1 < x2)

            return ("Количество решений: 2. Корни:" + x1 + " ," + x2);

        else

            return ("Количество решений: 2. Корни:" + x2 + " ," + x1);

    }
}