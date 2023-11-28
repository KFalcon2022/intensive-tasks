package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        System.out.println(getAreaByHeron(a, b, c));
        System.out.println(Arrays.toString(getHeights(a, b, c)));
        System.out.println(Arrays.toString(getMedians(a, b, c)));
        System.out.println(Arrays.toString(getBisectors(a, b, c)));
        System.out.println(Arrays.toString(getAngles(a, b, c)));
        System.out.println(getInscribedCircleRadius(a, b, c));
        System.out.println(getCircumradius(a, b, c));
       // System.out.println(getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double semiperimeter = (a + b + c) / 2;

        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double[] heights = new double[3];
        heights[0] = (2 * getAreaByHeron(a, b, c)) / a;
        heights[1] = (2 * getAreaByHeron(a, b, c)) / b;
        heights[2] = (2 * getAreaByHeron(a, b, c)) / c;
        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] medians = new double[3];
        medians[0] = 0.5 * Math.sqrt(2.0 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2));
        medians[1] = 0.5 * Math.sqrt(2.0 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(b, 2));
        medians[2] = 0.5 * Math.sqrt(2.0 * (Math.pow(b, 2) + Math.pow(a, 2)) - Math.pow(c, 2));
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] bisectors = new double[3];
        bisectors[0] = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        bisectors[1] = Math.sqrt(b * c * (b + c + a) * (b + c - a)) / (b + c);
        bisectors[2] = Math.sqrt(a * c * (a + c + b) * (a + c - b)) / (a + c);
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] angles = new double[3];
        angles[0] = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
        angles[1] = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b)));
        angles[2] = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)));
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        return (2 * getAreaByHeron(a, b, c)) / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {
        //        Место для вашего кода

        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

//    static double getAreaAdvanced(double a, double b, double c) {
//        //        Место для вашего кода
//
//        return 0; // Заглушка. При реализации - удалить
//    }
}