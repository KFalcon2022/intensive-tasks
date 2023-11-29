package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

        double a = 12;
        double b = 13;
        double c = 5;

        System.out.println(getAreaByHeron(a, b, c));
        System.out.println(Arrays.toString(getHeights(a, b, c)));
        System.out.println(Arrays.toString(getMedians(a, b, c)));
        System.out.println(Arrays.toString(getBisectors(a, b, c)));
        System.out.println(getInscribedCircleRadius(a, b, c));
        System.out.println(getCircumradius(a, b, c));
        System.out.println(Arrays.toString(getAngles(a, b, c)));
        System.out.println(getAreaAdvanced(a, b, c));
    }

    static double getSemiperimeter(double a, double b, double c) {
        return (a + b + c) / 2.0;
    }

    static double getAreaByHeron(double a, double b, double c) {
        return Math.sqrt(getSemiperimeter(a, b, c) * (getSemiperimeter(a, b, c) - a) * (getSemiperimeter(a, b, c) - b) * (getSemiperimeter(a, b, c) - c));
    }

    static double[] getHeights(double a, double b, double c) {
        double heightA = 2.0 * getAreaByHeron(a, b, c) / a;
        double heightB = 2.0 * getAreaByHeron(a, b, c) / b;
        double heightC = 2.0 * getAreaByHeron(a, b, c) / c;
        double[] heights = {heightA, heightB, heightC};
        Arrays.sort(heights);
        return heights;
    }

    static double[] getMedians(double a, double b, double c) {
        double medianA = Math.sqrt(2.0 * Math.pow(b, 2) + 2.0 * Math.pow(c, 2) - Math.pow(a, 2)) / 2.0;
        double medianB = Math.sqrt(2.0 * Math.pow(a, 2) + 2.0 * Math.pow(c, 2) - Math.pow(b, 2)) / 2.0;
        double medianC = Math.sqrt(2.0 * Math.pow(a, 2) + 2.0 * Math.pow(b, 2) - Math.pow(c, 2)) / 2.0;
        double[] medians = {medianA, medianB, medianC};
        Arrays.sort(medians);
        return medians;
    }

    static double[] getBisectors(double a, double b, double c) {
        double bisectorABC = 2.0 * Math.sqrt(a * b * getSemiperimeter(a, b, c) * (getSemiperimeter(a, b, c) - c)) / (a + b);
        double bisectorBAC = 2.0 * Math.sqrt(a * c * getSemiperimeter(a, b, c) * (getSemiperimeter(a, b, c) - b)) / (a + c);
        double bisectorACB = 2.0 * Math.sqrt(b * c * getSemiperimeter(a, b, c) * (getSemiperimeter(a, b, c) - a)) / (b + c);
        double[] bisectors = {bisectorABC, bisectorBAC, bisectorACB};
        Arrays.sort(bisectors);
        return bisectors;
    }

    static double[] getAngles(double a, double b, double c) {
        double cosBeta = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (a * b * 2.0));
        double cosGamma = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (c * b * 2.0));
        double cosAlpha = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (a * c * 2.0));
        double[] angles = {Math.toDegrees(cosBeta), Math.toDegrees(cosGamma), Math.toDegrees(cosAlpha)};
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        return getAreaByHeron(a, b, c) / getSemiperimeter(a, b, c);
    }

    static double getCircumradius(double a, double b, double c) {
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosAlpha = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (a * c * 2.0);
        double sinAlpha = Math.sqrt(1.0 - Math.pow(cosAlpha, 2));
        return 0.5 * a * c * sinAlpha;
    }
}