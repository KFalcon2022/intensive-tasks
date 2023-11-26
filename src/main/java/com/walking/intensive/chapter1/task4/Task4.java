package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 8;
        double b = 30;
        double c = 7;

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
       double Discriminant = Math.pow (b, 2) - 4 * a * c;

        if (Discriminant == 0) {
            double root = - b / (2 * a);
            return "Количество решений: 1. Корень: " + root;
        }
        if (Discriminant > 0) {
            double root1 = (- b - Math.sqrt(Discriminant)) / (2 * a);
            double root2 = (- b + Math.sqrt(Discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + Math.max(root1, root2) + ", " + Math.min(root1, root2);
        }
        return "Количество решений: 0";
    }
}

