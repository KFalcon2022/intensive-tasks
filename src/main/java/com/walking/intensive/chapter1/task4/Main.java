package com.walking.intensive.chapter1.task4;

import java.text.DecimalFormat;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = -3;
        double b = -1;
        double c = 5;

        System.out.println(solveQuadraticEquation(a, b, c));

        a = 0;
        b = 2;
        c = -3;

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
        double x1, x2;
        String result;
        DecimalFormat df = new DecimalFormat("0");
        df.setMaximumFractionDigits(8);

        if (a == 0 && b == 0 && c != 0) {
            return "Некорректные данные";
        }

        if (a == 0 && b != 0) {
            x1 = -c / b;
            return String.format("""
                                 Линейное уравнение kx + b = 0
                                 Коэффициенты: k = %s, b = %s
                                 Корень: %s
                                 """, df.format(b), df.format(c), df.format(x1));
        }

        double discriminant = b * b - (4 * a * c);

        if (discriminant < 0) {
            result = "0";
        } else if (discriminant == 0) {
            x1 = -b / (2 * a);
            result = String.format("1. Корень: x = %s\n", df.format(x1));
        } else {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);

            result = (x1 < x2)
                    ? (String.format("2\nКорни: x1 = %s, x2 = %s\n",
                                     df.format(x1), df.format(x2)))
                    : (String.format("2\nКорни: x1 = %s, x2 = %s\n",
                                     df.format(x2), df.format(x1)));
        }

        return String.format("""
                             Квадратное уравнение ax^2 + bx + c = 0
                             Коэффициенты: a = %s, b = %s, c = %s
                             Количество решений:\s""", df.format(a), df.format(b), df.format(c)) + result;
    }
}