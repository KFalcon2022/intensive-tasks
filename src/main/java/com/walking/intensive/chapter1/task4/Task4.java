package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
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

        if (a == 0 && b == 0 && c == 0) {
            return "Количество решений: Бесконечное множество";
        }
        if (a == 0 && b == 0) {
            return "Количество решений: 0";
        }
        if (a == 0) {
            double root = - c / b;
            if (root == 0){
            return "Количество решений: 1. Корень: " + Math.abs(root);
            }
            return "Количество решений: 1. Корень: " + root;
        }
        double Discriminant = Math.pow(b, 2) - 4 * a * c;

        if (Discriminant == 0) {
            double root = -b / (2 * a);
            if (root == 0){
                return "Количество решений: 1. Корень: " + Math.abs(root);
            }
            return "Количество решений: 1. Корень: " + root;
        }
        if (Discriminant > 0) {
            double root1 = (-b - Math.sqrt(Discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(Discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + Math.max(root1, root2) + ", " + Math.min(root1, root2);
        }
        return "Количество решений: 0";
    }
}

