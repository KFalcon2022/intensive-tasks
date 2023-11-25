package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

            double a = 1;
            double b = -8;
            double c = 15;

            System.out.println(solveQuadraticEquation(a, b, c));

        }
        static String solveQuadraticEquation(double a, double b, double c) {
            if (a == 0 && b == 0 && c == 0) {
                return "Решений бесконечно";
            } else if (a == 0 && b == 0) {
                return "Количество решений: 0.";
            } else if (a == 0 && c != 0) {
                return "Количество решений: 1. Корень: " + (-c / b);
            }
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root = (-b - Math.sqrt(discriminant)) / (2 * a);
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                return "Количество решений: 2. Корни: " + Math.min(root, root1) + " ; " + Math.max(root, root1);

            } else if (discriminant == 0) {
                return "Количество решений: 1" + (-b / (2 * a));

            } else {
                return "Количество решений 0.";
            }
        }
    }


