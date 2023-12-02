package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

    }

    static double getAreaByHeron(double a, double b, double c) {
        if (isTriangleExist(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;
    }

    static double[] getHeights(double a, double b, double c) {
        if (isTriangleExist(a, b, c)) {
            return new double[0];
        }
        double s = getAreaByHeron(a, b, c);
        double heightsA = 2 * s / a;
        double heightsB = 2 * s / b;
        double heightsC = 2 * s / c;
        double[] heights = {heightsA, heightsB, heightsC};
        Arrays.sort(heights);

        return heights;
    }

    static double[] getMedians(double a, double b, double c) {
        if (isTriangleExist(a, b, c)) {
            return new double[0];
        }
        double mediansA = (Math.sqrt(2 * b * b + 2 * c * c - a * a)) / 2;
        double mediansB = (Math.sqrt(2 * c * c + 2 * a * a - b * b)) / 2;
        double mediansС = (Math.sqrt(2 * b * b + 2 * a * a - c * c)) / 2;
        double[] meridians = {mediansA, mediansB, mediansС};
        Arrays.sort(meridians);

        return meridians;
    }

    static double[] getBisectors(double a, double b, double c) {
        if (isTriangleExist(a, b, c)) {
            return new double[0];
        }
        double bisectorsA = 1 / (b + c) * Math.sqrt(b * c * (a + b + c) * (c + b - a));
        double bisectorsB = 1 / (a + c) * Math.sqrt(a * c * (a + b + c) * (a + c - b));
        double bisectorsC = 1 / (b + a) * Math.sqrt(b * a * (a + b + c) * (a + b - c));
        double[] bisectors = {bisectorsA, bisectorsB, bisectorsC};
        Arrays.sort(bisectors);

        return bisectors;
    }

    static double[] getAngles(double a, double b, double c) {
        if (isTriangleExist(a, b, c)) {
            return new double[0];
        }
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double cosB = (a * a + c * c - b * b) / (2 * a * c);
        double cosC = (b * b + a * a - c * c) / (2 * b * a);
        double anglesA = (180 / Math.PI) * Math.acos(cosA);
        double anglesB = (180 / Math.PI) * Math.acos(cosB);
        double anglesC = (180 / Math.PI) * Math.acos(cosC);
        double[] angles = {anglesA, anglesB, anglesC};
        Arrays.sort(angles);

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (isTriangleExist(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2;
        double r = Math.sqrt(((p - a) * (p - b) * (p - c)) / p);

        return r;
    }

    static double getCircumradius(double a, double b, double c) {
        if (isTriangleExist(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2;
        double r = (a * b * c) / (4 * (Math.sqrt(p * (p - a) * (p - b) * (p - c))));

        return r;
    }

    static double getAreaAdvanced(double a, double b, double c) {
        if (isTriangleExist(a, b, c)) {
            return 0;
        }
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double sinA = (Math.sqrt(1 - cosA * cosA));

        return (c * b * sinA / 2);
    }

    static boolean isTriangleExist(double a, double b, double c) {
        return (a + b < c || b + c < a || c + a < b);
    }
}