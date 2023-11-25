package com.walking.intensive.chapter1.task5;


import java.util.Arrays;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAngles(12, 13, 5)));

    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double s = getAreaByHeron(a, b, c);
        double[] array = new double[]{s * 2 / a, s * 2 / b, s * 2 / c};
        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double x = Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2;
        double y = Math.sqrt(2 * a * a + 2 * c * c - b * b) / 2;
        double z = Math.sqrt(2 * c * c + 2 * b * b - a * a) / 2;
        double[] array = new double[]{x, y, z};
        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double x = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        double y = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        double z = Math.sqrt(c * b * (a + b + c) * (c + b - a)) / (c + b);
        double[] array = new double[]{x, y, z};
        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double cosC = (b * b - c * c - a * a) / (2 * b * a);
        double A = Math.toDegrees(Math.acos(cosA));
        double C = Math.toDegrees(Math.acos(cosC));
        double B = 180 - A - C;
        double[] array = new double[]{A, C, B};
        Arrays.sort(array);
        return array;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double s = getAreaByHeron(a, b, c);
        return 2 * s / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {
        double s = getAreaByHeron(a, b, c);
        return a * b * c / (4 * s);

    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double sinA = Math.sqrt(1 - cosA * cosA);
        return b * c * sinA / 2;
    }
}