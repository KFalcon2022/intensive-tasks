package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static double[] returnedArray = new double[3];
    public static void main(String[] args) {
    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double triangleS = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return triangleS;
    }

    static double[] getHeights(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double triangleS = 2 * Math.sqrt(p * (p - a) * (p - b) * (p - c));
        returnedArray[0] = triangleS / a;
        returnedArray[1] = triangleS / b;
        returnedArray[2] = triangleS / c;
        Arrays.sort(returnedArray);

        return returnedArray;
    }

    static double[] getMedians(double a, double b, double c) {
        double aa = a * a;
        double bb = b * b;
        double cc = c * c;

        returnedArray = new double[]{0, 0, 0};

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

        returnedArray = new double[]{0, 0, 0};

        returnedArray[0] = Math.sqrt(a * b * (ab + c) * (ab - c)) / ab; //c
        returnedArray[1] = Math.sqrt(a * c * (ac + b) * (ac - b)) / ac; //b
        returnedArray[2] = Math.sqrt(b * c * (bc + a) * (bc - a)) / bc; //a
        Arrays.sort(returnedArray);

        return returnedArray;
    }

    static double[] getAngles(double a, double b, double c) {
        returnedArray = new double[]{0, 0, 0};

        returnedArray[0] = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c))); //alpha /a
        returnedArray[1] = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c))); //betta /b
        returnedArray[2] = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b))); //gamma /c
        Arrays.sort(returnedArray);

        return returnedArray;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double innerRadius = Math.sqrt(((p - a) * (p - b) * (p - c)) / p);

        return innerRadius;
    }

    static double getCircumradius(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double outerRadius = (a * b * c) / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));

        return outerRadius;
    }

    static double getAreaAdvanced(double a, double b, double c) {

        double alpha = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c))); //alpha /a
        double sinAlpha = Math.sqrt(1 - Math.cos(alpha) * Math.cos(alpha));
        double triangleS = (a * b * sinAlpha) / 2;

        return triangleS;
    }

    @Override
    public String toString() {
        return Arrays.toString(returnedArray);
    }
}