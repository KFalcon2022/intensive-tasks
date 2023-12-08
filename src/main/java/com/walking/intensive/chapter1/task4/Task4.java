package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double c = 2;

        System.out.println(solveQuadraticEquation(a, b, c));
    }

    static String solveQuadraticEquation(double a, double b, double c) {
        int setRoots;
        int x1, x2 = 0;
        String outputTail;

        if (a == 0 && b == 0 && c != 0) return "Количество решений: 0.";
        if (a == 0 && b == 0 && c == 0) return "Решений бесконечно";

        if (a == 0 && b != 0) {
            setRoots = 1;
            x1 = (int) ((c / b) * -1);
            return "Количество решений: " + setRoots + ". Корень: " + x1;
        }

        if (b == 0 && c == 0) {
            setRoots = 1;
            x1 = 0;
            return "Количество решений: " + setRoots + ". Корень: " + x1;
        }

        //Количество корней и решений
        double discriminant = b * b - 4 * a * c;
        if (discriminant == 0) {
            setRoots = 1;
            x1 = (int) ((-1 * b) / (2 * a));
            outputTail = " Корень: " + x1;
        } else if (discriminant > 0) {
            setRoots = 2;
            outputTail = " Корни: ";
            x1 = (int) ((-1 * b - Math.sqrt(discriminant)) / (2 * a));
            x2 = (int) ((-1 * b + Math.sqrt(discriminant)) / (2 * a));

        } else return "Количество решений: 0.";

        String result = "Количество решений: " + setRoots + "." + outputTail + x1 + ";" + x2;

        return result;
    }
}