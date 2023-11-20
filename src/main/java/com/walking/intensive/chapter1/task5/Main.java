package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getAreaByHeron(3, 4, 5));
        System.out.println(Arrays.toString(getHeights(3, 4, 5)));
        System.out.println(Arrays.toString(getMedians(3, 4, 5)));
        System.out.println(Arrays.toString(getBisectors(3, 4, 5)));
        System.out.println(Arrays.toString(getAngles(3, 4, 5)));
        System.out.println(getInscribedCircleRadius(3, 4, 5));
        System.out.println(getCircumradius(3, 4, 5));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double[] getHeights(double a, double b, double c) {

        double[] heights = new double[3];
        double s = getAreaByHeron(a, b, c);

        heights[0] = s / a;
        heights[1] = s / b;
        heights[2] = s / c;

        Arrays.sort(heights);

        return heights;
    }

    static double[] getMedians(double a, double b, double c) {

        double[] medians = new double[3];

        medians[0] = getMedian(a, b, c);
        medians[1] = getMedian(b, c, a);
        medians[2] = getMedian(c, a, b);

        Arrays.sort(medians);

        return medians;
    }


    static double[] getBisectors(double a, double b, double c) {

        double[] bisectors = new double[3];

        bisectors[0] = getBisector(a, b, c);
        bisectors[1] = getBisector(b, c, a);
        bisectors[2] = getBisector(c, a, b);

        Arrays.sort(bisectors);

        return bisectors;
    }

    static double[] getAngles(double a, double b, double c) {

        double[] angles = new double[3];

        angles[0] = getAngle(a, b, c);
        angles[1] = getAngle(b, c, a);
        angles[2] = getAngle(c, a, b);

        Arrays.sort(angles);

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        return 2 * getAreaByHeron(a, b, c) / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {

        double p = 1.0 / 2 * (a + b + c);

        return a * b * c / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }


    static double getMedian(double a, double b, double c) {
        return (1.0 / 2 * Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)));
    }

    static double getBisector(double a, double b, double c) {
        return Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
    }

    static double getAngle(double a, double b, double c) {
        return Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / 2 / a / b));
    }
}