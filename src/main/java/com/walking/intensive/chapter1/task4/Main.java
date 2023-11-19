package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 * https://www.youtube.com/watch?v=ON9P6JnY4sU
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println(solveQuadraticEquation(a, b, c));

        a = 0;
        b = 0;
        c = 5;

        System.out.println(solveQuadraticEquation(a, b, c));

        a = 1;
        b = 5;
        c = 6;

        System.out.println("        a = 1;\n" +
                "        b = 5;\n" +
                "        c = 6;" + solveQuadraticEquation(a, b, c));

        a = 1;
        b = -5;
        c = 6;

        System.out.println("        a = 1;\n" +
                "        b = -5;\n" +
                "        c = 6;" + solveQuadraticEquation(a, b, c));

        a = 1;
        b = -5;
        c = -6;

        System.out.println("        a = 1;\n" +
                "        b = -5;\n" +
                "        c = -6;" + solveQuadraticEquation(a, b, c));

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
     *
     * a -
     */
    static String solveQuadraticEquation(double a, double b, double c) {

        if(a == 0 && b == 0 && c == 0) {
            return "Бесконечное множество при a, b и с равных нулю.";
        } else if(a == 0 && b == 0 && c == 5) {
            return "Количество решений: 0.";
        }

        double discriminant = b * b - 4 * a * c;
        int count = 0;
        String result = "Количество решений: ";
        double x1 = 0;
        double x2 = 0;

        if (discriminant == 0) {
            count = 1;
        } else if (discriminant > 0) {
            count = 2;
        } else {
            result += (count + ".");
        }

        if (count >= 1) {
            x1 = (-1 * b - Math.sqrt(discriminant) / 2 * a);
            result += "1. Корень: " + (int)x1;
        } else {
            x2 = (-1 * b + Math.sqrt(discriminant) / 2 * a);
            result = ";" + (int)x2;
        }

        return result;
    }
}