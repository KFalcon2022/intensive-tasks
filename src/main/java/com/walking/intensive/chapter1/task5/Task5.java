package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("123 - " + getAreaByHeron(1, 2, 3));

    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double squareX2 = 2 * getAreaByHeron(a, b, c);
        double[] array = new double[3];
        array[0] = squareX2 / a;
        array[1] = squareX2 / b;
        array[2] = squareX2 / c;
        Arrays.sort(array);

        return array;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = 0.5 * Math.sqrt(2 * b * b + 2 * c * c - a * a);
        array[1] = 0.5 * Math.sqrt(2 * a * a + 2 * c * c - b * b);
        array[2] = 0.5 * Math.sqrt(2 * a * a + 2 * b * b - c * c);
        Arrays.sort(array);

        return array;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c);
        array[1] = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        array[2] = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        Arrays.sort(array);

        return array;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double cosB = (a * a + c * c - b * b) / (2 * a * c);
        double cosC = (a * a + b * b - c * c) / (2 * a * b);
        double arccosA = Math.acos(cosA);
        double arccosB = Math.acos(cosB);
        double arccosC = Math.acos(cosC);
        double[] array = new double[3];
        array[0] = Math.toDegrees(arccosA);
        array[1] = Math.toDegrees(arccosB);
        array[2] = Math.toDegrees(arccosC);
        Arrays.sort(array);

        return array;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double square = getAreaByHeron(a, b, c);
        double halfPerimeter = (a + b + c) / 2;

        return square / halfPerimeter;
    }

    static double getCircumradius(double a, double b, double c) {
        double square = getAreaByHeron(a, b, c);

        return (a * b * c) / (4 * square);
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double sinA = Math.sqrt(1 - cosA * cosA);

        return 0.5 * b * c * sinA;
    }
}
