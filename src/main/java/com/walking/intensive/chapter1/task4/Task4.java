package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {

        double a = 5;
        double b = 5;
        double c = 0;

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {

        double root1 = 0;
        double root2;
        String zeroSolution = "Количество решений: 0.";
        String oneSolution = "Количество решений: 1. Корень: ";
        String twoSolutions = "Количество решений: 2. Корни: ";

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Решений бесконечно";
                }
                return zeroSolution;
            }
            return oneSolution + (-c / b);
        }

        if (b == 0) {
            if (-c / a > 0) {
                root1 = -Math.sqrt(-c / a);
                root2 = -root1;
                return twoSolutions + root1 + ";" + root2;
            }
            return c == 0 ? oneSolution + root1 : zeroSolution;
        }

        if (c == 0) {
            root2 = -b / a;
            return root2 > 0 ? twoSolutions + root1 + ";" + root2 : twoSolutions + root2 + ";" + root1;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return zeroSolution;
        }

        if (discriminant == 0) {
            root1 = -b / (2 * a);
            return oneSolution + root1;
        }

        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        return root2 > root1 ? twoSolutions + root1 + ";" + root2 : twoSolutions + root2 + ";" + root1;
    }
}
