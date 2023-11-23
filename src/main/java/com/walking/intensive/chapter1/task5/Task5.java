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

        //System.out.println(getAreaByHeron(a, b, c));
        //System.out.println(Arrays.toString(getHeights(a, b, c)));
        //System.out.println(Arrays.toString(getMedians(a, b, c)));
        //System.out.println(Arrays.toString(getBisectors(a, b, c)));
        System.out.println(Arrays.toString(getAngles(a, b, c)));
        //System.out.println(getInscribedCircleRadius(a, b, c));
        //System.out.println(getCircumradius(a, b, c));
    }

    static boolean checkTriangle(double a, double b, double c) {
        return ((a + b) > c && (a + c) > b && (c + b) > a);
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (!checkTriangle(a, b, c)) {
            return 0.0;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double[] getHeights(double a, double b, double c) {             // h  = 2S / a
        double[] heigth = new double[3];
        if (!checkTriangle(a, b, c)) {
            return null;
        }
        heigth[0] = (2 * getAreaByHeron(a, b, c)) / a;
        heigth[1] = (2 * getAreaByHeron(a, b, c)) / b;
        heigth[2] = (2 * getAreaByHeron(a, b, c)) / c;
        Arrays.sort(heigth);
        return heigth;
    }

    static double[] getMedians(double a, double b, double c) {
        if (!checkTriangle(a, b, c)) {
            return null;
        }
        double[] median = new double[3];
        median[0] = 0.5 * Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(b, 2) - Math.pow(a, 2));       // 1/2 * Math.sqrt(2c^2 + 2b^2 - a^2)
        median[1] = 0.5 * Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(a, 2) - Math.pow(b, 2));
        median[2] = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2));
        Arrays.sort(median);
        return median;
    }

    static double[] getBisectors(double a, double b, double c) {
        if (!checkTriangle(a, b, c)) {
            return null;
        }
        double[] bisector = new double[3];
        bisector[0] = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        bisector[1] = Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c);
        bisector[2] = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        Arrays.sort(bisector);
        return bisector;
    }

    static double[] getAngles(double a, double b, double c) {
        if (!checkTriangle(a, b, c)) {
            return null;
        }
        double s = getAreaByHeron(a, b, c);
        double[] angle = new double[3];
        angle[0] = Math.toDegrees(Math.asin(2 * s / (a * b)));
        angle[1] = Math.toDegrees(Math.asin(2 * s / (b * c)));
        angle[2] = Math.toDegrees(Math.asin(2 * s / (a * c)));
        Arrays.sort(angle);
        return angle;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {          //r = s/p
        if (!checkTriangle(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2;
        return getAreaByHeron(a, b, c) / p;
    }

    static double getCircumradius(double a, double b, double c) {                   //r = abc / 4s
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }


}