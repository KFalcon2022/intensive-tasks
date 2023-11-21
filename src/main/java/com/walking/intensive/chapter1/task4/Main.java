package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 * https://www.youtube.com/watch?v=ON9P6JnY4sU
 * https://developers.sber.ru/help/gigachat/catalog/kak-reshit-kvadratnoe-uravnenie
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 0;
        double c = 0;


        System.out.println(solveQuadraticEquation(a, b, c));

        a = 0;
        b = 0;
        c = 5;

        System.out.println(solveQuadraticEquation(a, b, c));

        a = 1;
        b = 5;
        c = 6;
        System.out.println("дискиминант " + getDiscriminant(a, b, c));
        System.out.println("a = 1; b = 5; c = 6; " + solveQuadraticEquation(a, b, c));

        a = 1;
        b = -5;
        c = 6;
        System.out.println("дискиминант " + getDiscriminant(a, b, c));
        System.out.println("a = 1; b = -5; c = 6; " + solveQuadraticEquation(a, b, c));

        a = 1;
        b = -5;
        c = -6;
        System.out.println("дискиминант " + getDiscriminant(a, b, c));
        System.out.println("a = 1; b = -5; c = -6; " + solveQuadraticEquation(a, b, c));

        a = 1;
        b = 0;
        c = 1;
        System.out.println("дискиминант " + getDiscriminant(a, b, c));
        System.out.println("a = 1; b = 0; c = 1; " + solveQuadraticEquation(a, b, c));
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

    static double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
    static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0 && b == 0 && c == 0) {
            return "Любое значение x будет являться решением этого уравнения.";
        } else if (a == 0 && b == 0) {
            return "Количество решений: Нет решений.";
        }

        double discriminant = getDiscriminant(a, b, c);
        String result = "Количество решений: ";
        double x1 = 0;
        double x2 = 0;

        if (discriminant < 0) {
            result += "0. Уравнение не имеет действительных корней.";
        } else if (discriminant > 0) {
            x1 = ((-1 * b - Math.sqrt(discriminant)) / 2 * a);
            x2 = ((-1 * b + Math.sqrt(discriminant)) / 2 * a);
            result += "2. Корень: " + x1 + ";" + x2;
        } else {
            x1 = (-1 * b) / (2 * a);
            result += "1. Корень:" + x1;
        }

        return result;
    }
}
