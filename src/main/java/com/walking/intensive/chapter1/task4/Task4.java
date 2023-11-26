package com.walking.intensive.chapter1.task4;

import java.lang.Math;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 0;
        double c = 0;

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
        double x1;
        double x2;
        double discriminant;

        if (a == 0 && a == b && b == c) {
            return "Решений бесконечно";
        } else if (a != 0 && b == 0 && c == 0) {
            return "Количество решений: 1. Корень: 0";
        } else if (a == 0) {
            return solveLinearEquation(b, c);
        } else if (b != 0 && c != 0) {
            discriminant = Math.pow(b, 2) - 4 * a * c;
            if (discriminant < 0) {
                return "Количество решений: 0.";
            } else if (discriminant == 0) {
                x1 = -b / 2 * a;
                return "Количество решений: 1. Корень: " + (int) x1;
            } else {
                x1 = (-b - Math.sqrt(discriminant)) / 2 * a;
                x2 = (-b + Math.sqrt(discriminant)) / 2 * a;
                return "Количество решений: 2. Корни: " + compareRoots(x1, x2);
            }
        } else {
            return solveIncompleteQuadraticEquation(a, b, c);
        }
    }

    static String solveIncompleteQuadraticEquation(double a, double b, double c) {
        double x1;
        double x2;

//      Если b == 0, то квадратное уравнение принимает вид неполного уравнения: ax^2 + c = 0
        if (a != 0 && b == 0) {
            if (-c / a > 0) {
                x1 = Math.sqrt(-c / a);
                x2 = -Math.sqrt(-c / a);
                return "Количество решений: 2. Корни: " + compareRoots(x1, x2);
            }
//      Если c == 0, то квадратное уравнение принимает вид неполного уравнения: ax^2 + bx = 0.
        } else if (a != 0 && c == 0) {
            x1 = -b / a;
            return "Количество решений: 2. Корни: " + compareRoots(x1, 0); // Один из корней всегда равен нулю.
        }
        return "Количество решений: 0.";
    }

    static String solveLinearEquation(double b, double c) {
        double x;

//      Если a == 0, то это линейное уравнение типа bx + c = 0;
        if (b != 0) {
            x = c / b;
            return "Количество решений: 1. Корень: " + (int) x;
        } else {
            return "Количество решений: 0.";
        }
    }

    static String compareRoots(double x1, double x2) {
        return (x1 < x2 ? (int) x1 + ";" + (int) x2 : (int) x2 + ";" + (int) x1);
    }
}