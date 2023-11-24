package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

    }

    static double getAreaByHeron(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return 0;
        }

        double halfPerimeter = (a + b + c) / 2;

        return Math.sqrt((halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c)));
    }

    static double[] getHeights(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return null;
        }

        double height1 = getAreaByHeron(a, b, c) * 2 / a;
        double height2 = getAreaByHeron(a, b, c) * 2 / b;
        double height3 = getAreaByHeron(a, b, c) * 2 / c;

        double[] heights = {height1, height2, height3};
        Arrays.sort(heights);

        return heights;
    }

    static double[] getMedians(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return null;
        }

        double median1 = Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2)) / 2;
        double median2 = Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - Math.pow(b, 2)) / 2;
        double median3 = Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2)) / 2;

        double[] medians = {median1, median2, median3};
        Arrays.sort(medians);

        return medians;
    }

    static double[] getBisectors(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return null;
        }

        double bisector1 = Math.sqrt((a * b * (a + b + c) * (a + b - c))) / (a + b);
        double bisector2 = Math.sqrt((a * c * (a + c + b) * (a + c - b))) / (a + c);
        double bisector3 = Math.sqrt((b * c * (b + c + a) * (b + c - a))) / (b + c);

        double[] bisectors = {bisector1, bisector2, bisector3};
        Arrays.sort(bisectors);

        return bisectors;
    }


    static double[] getAngles(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return null;
        }

        double cosineA = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double angleRadiansA = Math.acos(cosineA);
        double angleDegreesA = Math.toDegrees(angleRadiansA);

        double cosineB = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
        double angleRadiansB = Math.acos(cosineB);
        double angleDegreesB = Math.toDegrees(angleRadiansB);

        double cosineC = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        double angleRadiansC = Math.acos(cosineC);
        double angleDegreesC = Math.toDegrees(angleRadiansC);

        double[] angles = {angleDegreesA, angleDegreesB, angleDegreesC};
        Arrays.sort(angles);

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return 0;
        }

        double halfPerimeter = (a + b + c) / 2;

        return getAreaByHeron(a, b, c) / halfPerimeter;
    }

    static double getCircumradius(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return 0;
        }

        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            return 0;
        }

        double cosineA = (b * b + c * c - a * a) / (2.0 * b * c);
        double sineA = Math.sqrt(1 - cosineA * cosineA);

        return 0.5 * b * c * sineA;
    }

    static boolean isValidTriangle(double a, double b, double c) {

        return ((a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a) &&
                (Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a));
    }
}