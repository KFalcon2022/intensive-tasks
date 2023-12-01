package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

    }

    static double[] outcome;

    static void isExist(double x, double y, double z) {
        if (x < 0 || y < 0 || z < 0 || x + y < z || x + z < y || z + y < x) {
            System.out.println("Несуществующий треугольник");
            System.exit(0);
        }
    }


    static double getAreaByHeron(double a, double b, double c) {

        isExist(a, b, c);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    static double[] getHeights(double a, double b, double c) {

        isExist(a, b, c);
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double aHeight = 2 * area / a;
        double bHeight = 2 * area / b;
        double cHeight = 2 * area / c;
        outcome = new double[]{aHeight, bHeight, cHeight};
        Arrays.sort(outcome);
        return outcome;
    }

    static double[] getMedians(double a, double b, double c) {

        isExist(a, b, c);
        double aMedian = Math.sqrt(2 * b * b + 2 * c * c - a * a) / 2;
        double bMedian = Math.sqrt(2 * a * a + 2 * c * c - b * b) / 2;
        double cMedian = Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2;
        outcome = new double[]{aMedian, bMedian, cMedian};
        Arrays.sort(outcome);
        return outcome;
    }

    static double[] getBisectors(double a, double b, double c) {

        isExist(a, b, c);
        double aBisector = Math.sqrt(b * c * (b + c + a) * (b + c - a)) / (b + c);
        double bBisector = Math.sqrt(a * c * (a + c + b) * (a + c - b)) / (a + c);
        double cBisector = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        outcome = new double[]{aBisector, bBisector, cBisector};
        Arrays.sort(outcome);
        return outcome;
    }

    static double[] getAngles(double a, double b, double c) {

        isExist(a, b, c);
        double aAngle = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double bAngle = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double cAngle = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        outcome = new double[]{aAngle, bAngle, cAngle};
        Arrays.sort(outcome);
        return outcome;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        isExist(a, b, c);
        double p = (a + b + c) / 2;
        return Math.sqrt((p - a) * (p - b) * (p - c) / p);
    }

    static double getCircumradius(double a, double b, double c) {

        isExist(a, b, c);
        double p = (a + b + c) / 2;
        return a * b * c / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {

        isExist(a, b, c);
        double aAngle = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double aSin = Math.tan(Math.toRadians(aAngle)) * Math.cos(Math.toRadians(aAngle));
        return b * c * aSin / 2;
    }
}