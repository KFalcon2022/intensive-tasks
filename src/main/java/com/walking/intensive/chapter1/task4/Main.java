package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        double c = 6;
        System.out.println(solveQuadraticEquation(a,b,c));

    }
    static String solveQuadraticEquation(double a, double b, double c) {

        double discr = b * b - 4 * a * c;
        double x1;
        double x2;
        if (a == 0 & b == 0 & c == 0) {
            return "Количество решений бесконечно";
        } else if (discr < 0 || a == 0 & b == 0 & c != 0) {
            return "Количество решений 0";
        } else if (discr == 0) {
            x1 = (-1 * b) / (2 * a);
            return "Количество решений 1. " + "Корень:" + x1;
        } else {
            x1 = (-b + Math.sqrt(discr)) / (2 * a);
            x2 = (-b - Math.sqrt(discr)) / (2 * a);
            return "Количество решений 2. " + "Корни:" + x1 + ";" + x2;
        }
    }
}