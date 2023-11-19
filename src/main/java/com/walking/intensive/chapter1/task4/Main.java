package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 2;
        double b = 7;
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
        //        Место для вашего кода

        if (a==0 && b==0){
            return "Нет решений";
        }

        if (a ==0){
            double x = -c/b;
            return "Количество решений: 1, корень: " + x;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            return "Количество решений: 0";
        }
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            return "Количество решений: 2, корни: " + x1 + " ; " + x2;
        }
        else  {
            double x = -b / (2 * a);

            return "Количество решений: 1, корень: " + x;
        }
    }
}