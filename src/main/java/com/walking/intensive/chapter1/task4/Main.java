package com.walking.intensive.chapter1.task4;

import java.util.Scanner;

public class Main {
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
        double discriminant = b * b - 4 * a * c;
        int amountSolutions = 0;

        if (discriminant > 0) {
            int x1 = (int)((-b + Math.sqrt(discriminant)) / (2 * a));
            int x2 = (int)((-b - Math.sqrt(discriminant)) / (2 * a));

            amountSolutions++;
            if (a == 1 && (x1 + x2 == -b && x1 * x2 == c)) {             // Проверяю, есть ли решения по теореме Виетта.
                amountSolutions++;
            }

            String answer = "Количество решений: " + amountSolutions + ". " + "Корни: ";

            if (x1 < x2) {
                answer+= x1 + ";" + x2;
            }
            else if (x2 < x1) {
                answer += x2 + ";" + x1;
            }
            return answer;

        } else if (discriminant == 0) {
            int x = (int) (-b / 2 * a);
            amountSolutions++;
            if (a == 1 && (x + x == -b && x * x == c)) {
                amountSolutions++;
            }
            return "Количество решений: " + amountSolutions + ". " + "Корень: " + x;
        } else {
            return "Количество решений: " + amountSolutions;
        }
    }
}