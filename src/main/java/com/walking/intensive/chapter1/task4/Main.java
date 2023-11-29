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
        // this should be completely redundant since
        // if a equals 0 it's no more quadratic equation
        // <a href="https://en.wikipedia.org/wiki/Quadratic_equation#:~:text=equation%20is%20linear%2C%20not%20quadratic"></a>
        if (a == 0 & b != 0 & c != 0) {
            // if a equals 0 there should be an exception
            System.out.println("Количество решений: 1. Корень: " + Math.round((-c) / b));
        } else if (a >= 0 & b == 0 & c > 0) {
            System.out.println("Количество решений: 0.");
        } else if (a == 0 & b == 0 & c == 0) {
            System.out.println("Решений бесконечно");
        } else if (b == 0 & ((a > 0 & c < 0) || (a < 0 & c > 0))) {
            double x = Math.round(Math.sqrt((-c) / a));
            System.out.println("Количество решений: 2. Корни: " + -Math.round(x) + ";" + Math.round(x));
        } else if (a != 0 & b != 0 & c != 0) {
            System.out.println(solveQuadraticEquation(a, b, c));
        } else {
            System.out.println("Количество решений: 1. Корень: 0");
        }

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
            return "Количество решений: 1. Корень: " + Math.round(x);
        } else if (discriminant > 0) {
            double xFirst = ((-b) + Math.sqrt(discriminant)) / 2 * a;
            double xSecond = ((-b) - Math.sqrt(discriminant)) / 2 * a;
            if (xFirst >= xSecond) {
                return "Количество решений: 2. Корни: " + Math.round(xFirst) + ";" + Math.round(xSecond);
            } else {
                return "Количество решений: 2. Корни: " + Math.round(xSecond) + ";" + Math.round(xFirst);
            }
        }
        
        return "";
    }
}
