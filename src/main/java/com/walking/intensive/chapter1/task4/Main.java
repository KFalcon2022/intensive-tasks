package com.walking.intensive.chapter1.task4;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите переменную a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите переменную b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите переменную c: ");
        double c = scanner.nextDouble();
        scanner.close();

        System.out.println(solveQuadraticEquation(a, b, c));

    }
    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "бесконечное множество решений";
        }

        if (a == 0 && b == 0) {
            return "некорректное уравнение";
        }

        if (a == 0) {
            return "уравнение не квадратное, x=" + (-c / b);
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + Math.min(x1, x2) + "; " + Math.max(x1, x2);
        }

        if (discriminant == 0) {
            double x = (-b) / (2 * a);
            return "Количество решений: 1. Корень: " + x;
        } else {
            return "Количество решений: 0.";
        }
    }
}