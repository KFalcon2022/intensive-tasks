package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(solveQuadraticEquation(2, 10, 1));
        System.out.println(solveQuadraticEquation(25, 10, 1));
        System.out.println(solveQuadraticEquation(50, 10, 1));
        System.out.println(solveQuadraticEquation(0, 10, 1));
        System.out.println(solveQuadraticEquation(0, 0, 1));
        System.out.println(solveQuadraticEquation(50, 0, 0));

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
        double discriminant = b * b - 4 * a * c;
        if(a==0 && b!=0){
            x1=-c/b;
            return "Количество решений 1. Корень: " + x1;
        }
        if(a==0 && b==0){
            return "Количество решений: 0.";
        }
        if (discriminant == 0) {
            x1 = -b / (2 * a);
            return "Количество решений 1. Корень: " + x1;
        } else if (discriminant > 0) {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений 2. Корни: " + x1 + ";" + x2;
        } else {
            return "Количество решений: 0.";
        }

    }
}