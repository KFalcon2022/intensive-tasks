package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

        double a = 10;
        double b = 15;
        double c = 17;

        double arr = getInscribedCircleRadius(a, b, c);

       /* for (double v : arr) {
            System.out.println(v);
        }*/
        System.out.println(arr);


    }

    static double getAreaByHeron(double a, double b, double c) {

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {

        double s = getAreaByHeron(a, b, c);
        double[] heights = new double[3];
        heights[0] = 2 / a * s;
        heights[1] = 2 / b * s;
        heights[2] = 2 / c * s;
        Arrays.sort(heights);

        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        double mA = Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(b, 2) - Math.pow(a, 2)) / 2;
        double mB = Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(a, 2) - Math.pow(b, 2)) / 2;
        double mC = Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2)) / 2;

        double[] medians = new double[3];
        medians[0] = mA;
        medians[1] = mB;
        medians[2] = mC;
        Arrays.sort(medians);

        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода
        double bA = Math.sqrt(c * b * (a + b + c) * (c + b - a)) / (c + b);
        double bB = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        double bC = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);

        double[] bisectors = new double[3];
        bisectors[0] = bA;
        bisectors[1] = bB;
        bisectors[2] = bC;
        Arrays.sort(bisectors);

        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {

        double acosA = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)));
        double acosB = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
        double acosC = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(b, 2) - Math.pow(a, 2)) / (2 * c * b)));

        double[] acos = new double[3];
        acos[0] = acosA;
        acos[1] = acosB;
        acos[2] = acosC;
        Arrays.sort(acos);

        return acos;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        double p = (a + b + c) / 2;
        double r = Math.sqrt(((p - a) * (p - b) * (p - c)) / p);
        return r;
    }

    static double getCircumradius(double a, double b, double c) {

        double r = (a * b * c) / (4 * getAreaByHeron(a, b, c));
        return r;
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }
}