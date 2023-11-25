package com.walking.intensive.chapter1.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число a: ");
        double a = sc.nextInt();

        System.out.println("Введите число b: ");
        double b = sc.nextInt();

        System.out.println("Введите число c: ");
        double c = sc.nextInt();

        sc.close();

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "Решений бесконечно";
        }

        if (a == 0 && b == 0) {
            return "Количество решений: 0.";
        }

        if (a == 0) {
            int x = (int) (-c / b);
            return "Количество решений: 1." + " Корень: " + x;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            int x1 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
            int x2 = (int) ((-b - Math.sqrt(discriminant)) / (2 * a));

            String answer = "Количество решений: 2." + " Корни: ";

            if (x1 < x2) {
                answer += x1 + ";" + x2;
            } else if (x2 < x1) {
                answer += x2 + ";" + x1;
            }

            return answer;
        }
        if (discriminant == 0) {
            int x = (int) (-b / 2 * a);

            return "Количество решений: 1. " + "Корень: " + x;
        }

        return "Количество решений: 0.";
    }
}