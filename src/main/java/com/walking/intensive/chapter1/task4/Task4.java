package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 1;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    static String solveQuadraticEquation(double a, double b, double c) {

        if (a == 0 && b == 0 && c == 0) {
            return ("Решений бесконечно");
        }

        double x1, x2;

        if (a == 0 && b != 0) {
            x1 = -c / b;
            return ("Количество решений: 1. Корень: " + (int) x1);
        }

        double discriminant = b * b - 4 * a * c;

        if (a == 0 || discriminant < 0) {
            return ("Количество решений: 0.");
        }
        if (discriminant == 0) {
            x1 = -b / (2 * a);
            return ("Количество решений: 1. Корень: " + (int) x1);
        }
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return ("Количество решений: 2. Корни: " + (int) x1 + ";" + (int) x2);
    }
}