package com.walking.intensive.chapter1.task4;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;

        while (true){
            System.out.print("Введите а: ");
            a = scanner.nextDouble();
            System.out.print("Введите b: ");
            b = scanner.nextDouble();
            System.out.print("Введите c: ");
            c = scanner.nextDouble();


        }
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
            return "Уравнение не является квадратным";
        } else if (b == 0 && c == 0) {
            return "Количество решений: 1. Корень: 0";
        } else if (b == 0) {
            if (c / a > 0) {
                return "Количество решений: 0";
            } else {
                return "Количество решений: 2. Корни: -" + sqrt(-c / a) + ";" + sqrt(-c / a);
            }
        } else if (c == 0) {
            return (-b / a) < 0 ? "Количество решений: 2. Корни: " + (-b / a) + ";0" : "Количество решений: 2. Корни: 0;" + (-b / a);
        } else {
            double discriminant = ((b * b) - 4 * a * c);
            if (discriminant < 0) {
                return "Количество решений: 0";
            } else if (discriminant == 0) {
                return "Количество решений: 1. Корень: " + (-b / (2 * a));
            } else {
                return "Количество решений: 2. Корни: " + ((-b - sqrt(discriminant))/ (2 * a)) + ";" + ((-b + sqrt(discriminant))/ (2 * a));
            }
        }
    }
}