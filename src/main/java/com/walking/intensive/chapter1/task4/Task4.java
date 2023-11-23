package com.walking.intensive.chapter1.task4;

public class Task4 {

    public static void main(String[] args) {
        // Примеры для тестирования
        double a = 1;
        double b = 0;
        double c = -1;

        System.out.println(solveQuadraticEquation(a, b, c));
    }
    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        } else if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        } else if (a == 0) {
            double root = c / b; // Изменено на c / b
            return String.format("Количество решений: 1. Корень: %s", formatRoot(root));
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                return String.format("Количество решений: 2. Корни: %s;%s", formatRoot(Math.min(root1, root2)), formatRoot(Math.max(root1, root2)));
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                return String.format("Количество решений: 1. Корень: %s", formatRoot(root));
            } else {
                return "Количество решений: 0.";
            }
        }
    }

    static String formatRoot(double root) {
        if (root == (long) root) {
            return String.format("%d", (long) root);
        } else {
            return String.format("%.2f", root);
        }
    }
}