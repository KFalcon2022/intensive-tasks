package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 5;
        double b = 25;
        double c = 5;

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
//        a × x2 + b × x + c = 0 .
        if (Double.compare(a, 0.0) == 0) {
            return "Аргумент \"a\" не может быть равен 0";
        }
        double D = Math.pow(b, 2) - (4.0 * a * c);
        double x1, x2;

        String textCount;
        if (D < 0) {
            textCount = "Количество решений: 0.";
        } else {
            x1 = (-b + Math.sqrt(D)) / (2.0 * a);
            if (Double.compare(D, 0.0) == 0) {
                textCount = "Количество решений: 1. Корень: " + x1;
            } else {
                x2 = (-b - Math.sqrt(D)) / (2.0 * a);
                textCount = "Количество решений: 2. Корни: " + x1 + ";" + x2;
            }
        }

        return textCount;
    }
}