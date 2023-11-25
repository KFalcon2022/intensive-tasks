package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(getAreaByHeron(12, 13, 5));
        System.out.println(Arrays.toString(getHeights(12, 13, 5)));
        System.out.println(Arrays.toString(getAngles(3, 4, 5)));
    }

    static double getAreaByHeron(double a, double b, double c) {
        return Math.sqrt(semiPerimeter(a, b, c) * (semiPerimeter(a, b, c) - a) * (semiPerimeter(a, b, c) - b) * (semiPerimeter(a, b, c) - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double heigthA = 2 * getAreaByHeron(a, b, c) / a;
        double heigthB = 2 * getAreaByHeron(a, b, c) / b;
        double heigthC = 2 * getAreaByHeron(a, b, c) / c;
        double[] arr = {heigthA, heigthB, heigthC};
        Arrays.sort(arr);
        return arr;

    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double medianA = 0.5 * Math.sqrt(2 * (b * b + c * c) - a * a);
        double medianB = 0.5 * Math.sqrt(2 * (a * a + c * c) - b * b);
        double medianC = 0.5 * Math.sqrt(2 * (a * a + b * b) - c * c);
        double[] arr = {medianA, medianB, medianC};
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double bisectorA = Math.sqrt(b * c * (a + b + c) * (b + c - a)) / b + c;
        double bisectorB = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / a + c;
        double bisectorC = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / a + b;
        double[] arr = {bisectorA, bisectorB, bisectorC};
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double angelAC = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double angelAB = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        double angelBC = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));

        double[] arr = {angelAC, angelAB, angelBC};
        Arrays.sort(arr);
        return arr;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        return Math.sqrt(((semiPerimeter(a, b, c) - a) * (semiPerimeter(a, b, c) - b) * (semiPerimeter(a, b, c) - c)) / semiPerimeter(a, b, c));
    }

    static double getCircumradius(double a, double b, double c) {
                return a * b * c / (4 * Math.sqrt(semiPerimeter(a, b, c) * (semiPerimeter(a, b, c) - a) * (semiPerimeter(a, b
                , c) - b) * (semiPerimeter(a, b, c) - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {


        return 0; // Заглушка. При реализации - удалить
    }

    static double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }


}