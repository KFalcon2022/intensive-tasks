package com.walking.intensive.chapter1.task5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        for (double values : getHeights(2, 3, 4)) {
            System.out.print(values + ",");
        }
    }
    static double getAreaByHeron(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return 0;
        }
        double p = (double) ((a + b + c) / 2);

        return (double) (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
    static double[] getHeights(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return new double[]{0.0};
        }
        double heightsA = 2 * getAreaByHeron(a, b, c) / a;
        double heightsB = 2 * getAreaByHeron(a, b, c) / b;
        double heightsC = 2 * getAreaByHeron(a, b, c) / c;

        double[] heights = {heightsA, heightsB, heightsC};

        Arrays.sort(heights);

        return heights;
    }
    static double[] getMedians(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return new double[]{0.0};
        }
        double mediansA = (Math.sqrt(2 * b * b + 2 * c * c - a * a) / 2);
        double mediansB = (Math.sqrt(2 * a * a + 2 * c * c - b * b) / 2);
        double mediansC = (Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2);

        double[] medians = {mediansA, mediansB, mediansC};

        Arrays.sort(medians);

        return medians;
    }
    static double[] getBisectors(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return new double[]{0.0};
        }
        double p = (double) ((a + b + c) / 2);

        double bisectorsA = ((2 * Math.sqrt(b * c * p * (p - a))) / (b + c));
        double bisectorsB = ((2 * Math.sqrt(a * c * p * (p - b))) / (a + c));
        double bisectorsC = ((2 * Math.sqrt(a * b * p * (p - c))) / (a + b));

        double[] bisectors = {bisectorsA, bisectorsB, bisectorsC};

        Arrays.sort(bisectors);

        return bisectors;
    }
    static double[] getAngles(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return new double[]{0.0};
        }
        double anglesA = (a * a + c * c - b * b) / (2 * a * c);
        double anglesB = (a * a + b * b - c * c) / (2 * a * b);
        double anglesC = (b * b + c * c - a * a) / (2 * b * c);

        double[] angles = {anglesA, anglesB, anglesC};

        Arrays.sort(angles);

        return angles;
    }
    static double getInscribedCircleRadius(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return 0;
        }
        double p = (double) ((a + b + c) / 2);

        return getAreaByHeron(a, b, c) / p;
    }
    static double getCircumradius(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return 0;
        }
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }
    static double getAreaAdvanced(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            return 0;
        }
        double cosAnglesA = (b * b + c * c - a * a) / (2 * b * c);
        double sinusA = Math.sqrt(1 - cosAnglesA * cosAnglesA);

        return (c * b * sinusA) / 2;
    }
}
// исправленная версия
