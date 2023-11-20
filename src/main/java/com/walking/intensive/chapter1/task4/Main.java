package com.walking.intensive.chapter1.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        Для собственных проверок можете делать любые изменения в этом методе

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите коэффициенты уравнения a, b и c. Каждый с новой строки:");
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());
        reader.close();

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
        String numberOfSolutions = "Количество решений: ";
        double firstRoot, secondRoot;
        if (a == 0 && b == 0 && c == 0) return numberOfSolutions + "бесконечно.";
        else if (a == 0 && b == 0) return numberOfSolutions + 1 + ". Корень: " + c + ".";
        else if (a == 0 && c == 0 || b == 0 && c == 0) return numberOfSolutions + 1 + ". Корень: " + 0 + ".";

        else if (a == 0) {
            return numberOfSolutions + 1 + ". Корень: " + (-c / b) + ".";
        } else if (b == 0) {
            if (c < 0 && a < 0 || c > 0 && a > 0) return numberOfSolutions + 0 + ".";
            firstRoot = -Math.sqrt(c / a);
            secondRoot = Math.sqrt(c / a);
            return numberOfSolutions + 2 + ". Корни: " + firstRoot + ";" + secondRoot + ".";
        } else if (c == 0) {
            firstRoot = 0;
            secondRoot = -b / a;
            if (secondRoot > 0) return numberOfSolutions + 2 + ". Корни: " + firstRoot + ";" + secondRoot + ".";
            else return numberOfSolutions + 1 + ". Корень: " + firstRoot + ".";

        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant < 0) return numberOfSolutions + 0 + ".";
            else if (discriminant == 0) return numberOfSolutions + 1 + ". Корень: " + (-b / (2 * a)) + ".";
            else {
                firstRoot = -b + Math.sqrt(discriminant) / 2 * a;
                secondRoot = -b - Math.sqrt(discriminant) / 2 * a;

                if (firstRoot > secondRoot) {
                    double intermediateValue = firstRoot;
                    firstRoot = secondRoot;
                    secondRoot = intermediateValue;
                }

                return numberOfSolutions + 2 + ". Корни: " + firstRoot + ";" + secondRoot;
            }
        }
    }
}