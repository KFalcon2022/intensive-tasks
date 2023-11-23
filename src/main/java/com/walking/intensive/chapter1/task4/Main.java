package com.walking.intensive.chapter1.task4;
/*
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

/*
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 1;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    static String solveQuadraticEquation(double a, double b, double c) {

        String answer = "";

        if (a == 0 && b != 0 && c != 0) {
            answer = "Уравнение линейное х = " + String.format("%.1f", (-c/b));
        } else if (a == 0 && b == 0) {
            answer = "Количество решений: 0";
       } else {
            double d = (b * b - 4 * a * c);
            System.out.println(d);
            if (d < 0) {
                answer = "Количество решений: 0";
            } else if (d == 0){
                answer +="Количество решений 1. Корень: " + String.format("%.1f", (-b/(2*a)));
            } else if (d > 0) {
                double root1 = (-b - Math.sqrt(d)) / (2 * a);
                double root2 = (-b + Math.sqrt(d)) / (2 * a);
                if (root1 > root2){
                    answer +="Количество решений 2. Корни: " + String.format("%.1f", root1) + "; " + String.format("%.1f", root2);
                } else {
                    answer +="Количество решений 2. Корни: " + String.format("%.1f", root2) + "; " + String.format("%.1f", root1);
                }
            }
        }
        return answer;
    }
}