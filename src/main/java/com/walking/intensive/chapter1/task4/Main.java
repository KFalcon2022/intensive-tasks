package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = 10;
        double c = 1;

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            return "Старший коэффициент не должен быть равен 0, уравнение не квадратное";
        }

        if (discriminant < 0) {
            return "Количество решений: 0.";
        } else if (discriminant == 0) {
            double x1 = -b / (a * a);
            return "Количество решений: 1. Корень: " + x1;
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (a * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (a * a);
            return "Количество решений: 2. Корни: " + x1 + ", " + x2;
        }
    }
}