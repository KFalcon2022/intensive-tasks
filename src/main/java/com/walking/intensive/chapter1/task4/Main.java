package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
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
        int solutionNumber = 0;
        String solution = null;

        if ((a == 0) && (b != 0)) {             //проверяем простые решения
            solutionNumber = 1;
            double x = -c / b;
            solution = "Корень: " + x;
        } else if ((b == 0) && (a != 0) && (c < 0)) {
            solutionNumber = 2;
            double x1 = Math.sqrt(c);
            double x2 = -x1;
            solution = "Корни: " + x1 + ";" + x2;
        } else if ((b == 0) && (a != 0) && (c == 0)) {
            solutionNumber = 1;
            double x = 0;
            solution = "Корень: " + x;
        } else if ((b == 0) && (a == 0) && (c != 0)) {
            solution = "Ненулевой коэфициент \"c\" оказался равен 0. Логическая ошибка. Проверьте ввод.";
        } else if ((b == 0) && (a == 0) && (c == 0)) {
            solution = "0 = 0";
        } else {                                //проверяем решения через детерминант
            double determinant = Math.pow(b, 2) - 4 * a * c;
            if (determinant > 0) {
                solutionNumber = 2;
                double x1 = (-b + Math.sqrt(determinant)) / 2 / a;
                double x2 = (-b - Math.sqrt(determinant)) / 2 / a;
                //solution = "Корни: %f;%f".formatted(x1,x2); //оказывается приводит к float
                solution = "Корни: " + x1 + ";" + x2;
            } else if (determinant == 0) {
                solutionNumber = 1;
                double x = -b / 2 / a;
                solution = "Корень: " + x;
            } else {
                solution = "";
            }
        }

        return "Количество решений: %d. %s".formatted(solutionNumber, solution);
    }
}