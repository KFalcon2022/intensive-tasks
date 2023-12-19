package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Heron: " + getAreaByHeron(12, 13, 5));
        System.out.println("Heron: " + getAreaByHeron(1, 2, 4));
        System.out.println("Heron: " + getAreaByHeron(2, 2, 4));
    }

    static double getAreaByHeron(double a, double b, double c) {

        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            return 0;
        }

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double[] getHeights(double a, double b, double c) {

        double[] returnedArray = new double[3];

        double doubleTriangleArea = 2 * getAreaByHeron(a, b, c);
        returnedArray[0] = doubleTriangleArea / a;
        returnedArray[1] = doubleTriangleArea / b;
        returnedArray[2] = doubleTriangleArea / c;
        Arrays.sort(returnedArray);

        return returnedArray;
    }

    static double[] getMedians(double a, double b, double c) {
        double aa = a * a;
        double bb = b * b;
        double cc = c * c;

        double[] returnedArray = new double[]{0, 0, 0};

        returnedArray[0] = Math.sqrt(2 * bb + 2 * cc - aa) / 2;
        returnedArray[1] = Math.sqrt(2 * aa + 2 * cc - bb) / 2;
        returnedArray[2] = Math.sqrt(2 * aa + 2 * bb - cc) / 2;
        Arrays.sort(returnedArray);

        return returnedArray;
    }

    static double[] getBisectors(double a, double b, double c) {
        double ab = a + b;
        double ac = a + c;
        double bc = b + c;

        double[] returnedArray = new double[]{0, 0, 0};

        returnedArray[0] = Math.sqrt(a * b * (ab + c) * (ab - c)) / ab; //c
        returnedArray[1] = Math.sqrt(a * c * (ac + b) * (ac - b)) / ac; //b
        returnedArray[2] = Math.sqrt(b * c * (bc + a) * (bc - a)) / bc; //a
        Arrays.sort(returnedArray);

        return returnedArray;
    }

    static double[] getAngles(double a, double b, double c) {
        double[] returnedArray = new double[]{0, 0, 0};

        returnedArray[0] = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c))); //alpha /a
        returnedArray[1] = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c))); //betta /b
        returnedArray[2] = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b))); //gamma /c
        Arrays.sort(returnedArray);

        return returnedArray;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        return (2 * getAreaByHeron(a, b, c) / (a + b + c));
    }

    static double getCircumradius(double a, double b, double c) {

        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {

        double alpha = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c))); //alpha /a
        double sinAlpha = Math.sqrt(1 - Math.cos(alpha) * Math.cos(alpha));

        return (a * b * sinAlpha) / 2;
    }
}