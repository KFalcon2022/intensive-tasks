package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

//        System.out.println(solveQuadraticEquation(4, 0, 7));
//        System.out.println(solveQuadraticEquation(0, 2, 3));
//        System.out.println(solveQuadraticEquation(2, 5, -3));
//        System.out.println(solveQuadraticEquation(10, 5, 2));
//        System.out.println(solveQuadraticEquation(3, -10, 0));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 & b == 0) {
            return "Действительных корней нет";
        } else if (a == 0 & b != 0) {
            double xOne = -c / b;
            return String.format("Количество решений: 1. Корень %.3f", xOne);
        }

        double D = Math.pow(b, 2) - 4 * a * c;

        if (D > 0) {
            double xOne = ((-b) - Math.sqrt(D)) / (2 * a);
            double xTwo = ((-b) + Math.sqrt(D)) / (2 * a);
            return xOne > xTwo ? String.format("Количество решений: 2. Корни: %.3f; %.3f", xOne, xTwo) : String.format("Количество решений: 2. Корни: %.3f; %.3f", xTwo, xOne);
        } else if (D == 0) {
            double xOne = (-b) / (2 * a);
            return String.format("Количество решений: 1. Корень %.3f", xOne);
        } else {
            return "Действительных корней нет";
        }
    }
}