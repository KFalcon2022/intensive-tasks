package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = -3;
        double b = 1;
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
        //        Место для вашего кода

        if (a == 0 && b != 0) {
            return "Это не квадратное уравнение";
        }
        else if (a == 0 && b == 0) {
            return "Некорректные данные";
        }

        double x1, x2;
        String result;

        double discriminant = b * b - (4 * a * c);

        if (discriminant < 0) {
            result = "0";
        }
        else if (discriminant == 0) {
            x1 = -b / (2 * a);
            result = "1. Корень: " + x1;
        }
        else {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);

            result = (x1 < x2)
                    ? ("2. Корни: " + x1 + ";" + x2)
                    : ("2. Корни: " + x2 + ";" + x1);
        }

        return "Количество решений: " + result; // Заглушка. При реализации - удалить
    }
}