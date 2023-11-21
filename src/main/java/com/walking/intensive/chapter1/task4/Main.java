package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    static String solveQuadraticEquation(double a, double b, double c) {

        if (a == 0 && b == 0 && c == 0) {
            return "Бесконечное число решений.";
        }

        if (a == 0 && b == 0) {
            return "Нет решений.";
        }

        double discriminant = b * b - 4 * a * c;

        if (isQuadratic(a)) {
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                return "Количество решений: 2. Корни: " + x1 + ", " + x2;
            } else if (discriminant == 0) {
                double x = (-b / (2 * a));

                return "Количество решений: 1. Корень: " + x;
            }
             return ("Количество решений: 0.");
        }

         return "Уравнение линейное. Число решений: 1, корень: " + (-c / b);
    }

    static boolean isQuadratic(double a) {
        return (a != 0);
    }
}
