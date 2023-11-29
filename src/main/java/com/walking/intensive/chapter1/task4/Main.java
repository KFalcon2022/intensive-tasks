package com.walking.intensive.chapter1.task4;

import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        Scanner inputFirst = new Scanner(System.in);
        System.out.println("a = ");
        double a = inputFirst.nextDouble();
        Scanner inputSecond = new Scanner(System.in);
        System.out.println("b = ");
        double b = inputSecond.nextDouble();
        Scanner inputThird = new Scanner(System.in);
        System.out.println("c = ");
        double c = inputThird.nextDouble();
        System.out.println(solveQuadraticEquation(a, b, c));
    }

    /**
     * При формировании строки, корни уравнения должны указываться по возрастанию.
     * <p>
     * Примеры результирующей строки:
     * <p>
     * Количество решений: 2. Корни: -4;4
     * <p>
     * Количество решений: 1. Корень: 0
     * <p>
     * Количество решений: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b*b - 4 * a * c;

        if (discriminant < 0) {
            return "Количество решений: 0.";
        } else if (discriminant == 0) {
            double x = (-b) / 2 * a;
            return "Количество решений: 1. Корень: " + x;
        } else if (discriminant > 0) {
            double xFirst = ((-b) + Math.sqrt(discriminant)) / 2 * a;
            double xSecond = ((-b) - Math.sqrt(discriminant)) / 2 * a;
            if (xFirst >= xSecond) {
                return "Количество решений: 2. Корни: " + xFirst + ";" + xSecond;
            } else if (xFirst < xSecond) {
                return "Количество решений: 2. Корни: " + xSecond + ";" + xFirst;
            }
        }

        return "";
    }
}