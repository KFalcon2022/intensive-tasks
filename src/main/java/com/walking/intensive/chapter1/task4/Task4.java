package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 2;
        double b = -4;
        double c = 20;

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
            return "Вы ввели значения всех коэффициентов равное 0. Поздравляем, 0 = 0!";
        }
        if (a == 0 && b == 0) {
            return "Проверьте корректность ввода коэфициентов. Выражение " + c + " = 0 не имеет смысла.";
        }
        if (c == 0 && (a == 0 || b == 0)) {
            return "Количество решений: 1. Корень: 0.";
        }
        if (a == 0) {
            return "Внимание, вы ввели коэффициент а = 0. В таком случаем уравнение не является квадратным. Корень: " +
                    c / b * -1 + ".";
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-1 * b - Math.pow(discriminant, 0.5)) / (2 * a);
        double x2 = (-1 * b + Math.pow(discriminant, 0.5)) / (2 * a);

        if (discriminant == 0) {
            x1 = (-1 * b) / (2 * a);
            return "Количество решений: 1. Корень: " + x1 + ".";
        }
        if (discriminant > 0) {
            if (x1 < x2) {
                return "Количество решений: 2. Корни: " + x1 + "; " + x2 + ".";
            }
            return "Количество решений: 2. Корни: " + x2 + "; " + x1 + ".";
        }

        return "Решений данного уравнения нет.";
    }
}