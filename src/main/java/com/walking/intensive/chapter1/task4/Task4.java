package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        double c = -1;

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
        if (a == 0) {       // Рассмотрим случаи, когда исходное уравнение не предсатвляет собой квадратное уравнение
            if (b != 0) {
                return "Количество решений: 1. Корень: " + String.valueOf((int) (-c / b));
            } else {
                if (c != 0)
                    return "Количество решений: 0.";
                else
                    return "Решений бесконечно";
            }
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0)
            return "Количество решений: 0.";
        else if (discriminant == 0)
            return "Количество решений: 1. Корень: " + String.valueOf((int) ((-b) / (2 * a)));
        else {
            double firstAnswer = (-b - Math.sqrt(discriminant)) / (2 * a);
            double secondAnswer = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + String.valueOf((int) firstAnswer) + ";" + String.valueOf((int) secondAnswer);
        }
    }
}