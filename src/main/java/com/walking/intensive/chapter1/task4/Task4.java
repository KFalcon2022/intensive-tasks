package com.walking.intensive.chapter1.task4;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коэффициенты квадратного уравнения: ");
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        System.out.println(solveQuadraticEquation(a, b, c));
        in.close();
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c != 0) {
            return "Количество решений: 0.";
        }
        if (a == 0 && b == 0 && c == 0) {
            return "Количество решений: 1. Корень: 0";
        }

        byte count = getNumSolution(a, b, c);
        if (count == 2) {
            double x1 = getFirstSolution(a, b, c);
            double x2 = getSecondSolution(a, b, c);

            if (x1 > x2) {
                return "Количество решений: 2. Корни: " + x2 + ";" + x1;
            }
            if (x1 < x2) {
                return "Количество решений: 2. Корни: " + x1 + ";" + x2;
            }
        }
        if (count == 1) {
            return "Количество решений: 1. Корень: " + getFirstSolution(a, b, c);
        }
        return "Количество решений: 0.";
    }

    static byte getNumSolution(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            return 2;
        }
        if (d == 0) {
            return 1;
        }
        return 0;
    }

    static double getFirstSolution(double a, double b, double c) {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }

    static double getSecondSolution(double a, double b, double c) {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
    }
}