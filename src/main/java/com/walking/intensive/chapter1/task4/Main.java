package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 1;
        double b = 9;
        double c = 2;

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

        if (a == 0) {
            return "На 0 делить нельзя!";
        }

        double discriminant = getDiscriminant(a, b, c);

        if (discriminant < 0) {
            return "Количество решений: 0.";
        } else if (discriminant == 0) {
            return "Количество решений: 1. Корень: " + getOneRoot(a, b);
        } else {
            double[] roots = getTwoRoots(a, b, c);
            return String.format("Количество решений: 2. Корни: %s",
                    roots[0] > roots[1] ? roots[0] + "; " + roots[1] : roots[1] + "; " + roots[0]);
        }
    }

    static double getOneRoot(double a, double b) {
        return -b / (2 * a);
    }

    static double[] getTwoRoots(double a, double b, double c) {
        double root1 = (-b + Math.sqrt(getDiscriminant(a, b, c)) / (2 * a));
        double root2 = (-b - Math.sqrt(getDiscriminant(a, b, c)) / (2 * a));

        double[] roots = new double[2];

        roots[0] = Math.round(root1 * 100) / 100.0;
        roots[1] = Math.round(root2 * 100) / 100.0;

        return roots;
    }

    static double getDiscriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}