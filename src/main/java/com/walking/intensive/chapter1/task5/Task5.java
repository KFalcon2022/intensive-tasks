package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void Main(String[] args) {
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (!isExisting(a, b, c)) {
            return 0;
        }
        return Math.sqrt(getHalfPerimeter(a, b, c) * (getHalfPerimeter(a, b, c) - a) * (getHalfPerimeter(a, b, c) - b) * (getHalfPerimeter(a, b, c) - c));
    }

    static double[] getHeights(double a, double b, double c) {

        double[] heights = new double[3];

        if (!isExisting(a, b, c)) {
            return heights;
        }

        double s = getAreaByHeron(a, b, c);

        heights[0] = 2 * s / a;
        heights[1] = 2 * s / b;
        heights[2] = 2 * s / c;

        Arrays.sort(heights);

        return heights;
    }

    static double[] getMedians(double a, double b, double c) {

        double[] medians = new double[3];

        if (!isExisting(a, b, c)) {
            return medians;
        }

        medians[0] = getMedian(a, b, c);
        medians[1] = getMedian(b, c, a);
        medians[2] = getMedian(c, a, b);

        Arrays.sort(medians);

        return medians;
    }

    static double[] getBisectors(double a, double b, double c) {

        double[] bisectors = new double[3];

        if (!isExisting(a, b, c)) {
            return bisectors;
        }
        bisectors[0] = getBisector(a, b, c);
        bisectors[1] = getBisector(b, c, a);
        bisectors[2] = getBisector(c, a, b);

        Arrays.sort(bisectors);

        return bisectors;
    }

    static double[] getAngles(double a, double b, double c) {

        double[] angles = new double[3];

        if (!isExisting(a, b, c)) {
            return angles;
        }

        angles[0] = getAngle(a, b, c);
        angles[1] = getAngle(b, c, a);
        angles[2] = getAngle(c, a, b);

        Arrays.sort(angles);

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (!isExisting(a, b, c)) {
            return 0;
        }
        return 2 * getAreaByHeron(a, b, c) / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {
        if (!isExisting(a, b, c)) {
            return 0;
        }

        double p = 1.0 / 2 * (a + b + c);

        return a * b * c / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cos = (b * b + c * c - a * a) / (2 * b * c);
        double sin = Math.sqrt(1 - cos * cos);

        return b * c * sin / 2;
    }

    static double getMedian(double a, double b, double c) {
        return (1.0 / 2 * Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)));
    }

    static double getBisector(double a, double b, double c) {
        return Math.sqrt(a * b * getHalfPerimeter(a, b, c) * 2 * (a + b - c)) / (a + b);
    }

    static double getAngle(double a, double b, double c) {
        return Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / 2 / a / b));
    }

    static boolean isExisting(double a, double b, double c) {
        return (a + b >= c) && (a + c >= b) && (c + b >= a);
    }

    static double getHalfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }
}