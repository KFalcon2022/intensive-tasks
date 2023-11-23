package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        System.out.println(getCircumradius(12, 13, 5));
//        System.out.println(getCircumradius(3, 4, 5));
//        System.out.println(Arrays.toString(getAngles(12, 13, 5)));
//        System.out.println(Arrays.toString(getAngles(3, 4, 5)));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double poluPerimetr = (a + b + c) / 2;
        if ((a + b < c || b + c < a || c + a < b) || (poluPerimetr == a || poluPerimetr == b || poluPerimetr == c)) {
            return 0;
        }

        return Math.sqrt(poluPerimetr * (poluPerimetr - a) * (poluPerimetr - b) * (poluPerimetr - c));
    }

    static double[] getHeights(double a, double b, double c) {
        double poluPerimetr = (a + b + c) / 2;
        if ((a + b < c || b + c < a || c + a < b) || (poluPerimetr == a || poluPerimetr == b || poluPerimetr == c)) {
            return null;
        }

        double heightsA = (2 * getAreaByHeron(a, b, c)) / a;
        double heightsB = (2 * getAreaByHeron(a, b, c)) / b;
        double heightsC = (2 * getAreaByHeron(a, b, c)) / c;

        double[] result = new double[3];
        result[0] = Math.min(Math.min(heightsA, heightsB), heightsC);
        result[2] = Math.max(Math.max(heightsA, heightsB), heightsC);
        result[1] = (heightsA + heightsB + heightsC) - result[0] - result[2];
        return result;
    }

    static double[] getMedians(double a, double b, double c) {
        double poluPerimetr = (a + b + c) / 2;
        if ((a + b < c || b + c < a || c + a < b) || (poluPerimetr == a || poluPerimetr == b || poluPerimetr == c)) {
            return null;
        }

        double medianaInA = 0.5 * Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2));
        double medianaInB = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - Math.pow(b, 2));
        double medianaInC = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2));

        double[] result = new double[3];
        result[0] = Math.min(Math.min(medianaInA, medianaInB), medianaInC);
        result[2] = Math.max(Math.max(medianaInA, medianaInB), medianaInC);
        result[1] = (medianaInA + medianaInB + medianaInC) - result[0] - result[2];
        return result;

    }

    static double[] getBisectors(double a, double b, double c) {
        double poluPerimetr = (a + b + c) / 2;
        if ((a + b < c || b + c < a || c + a < b) || (poluPerimetr == a || poluPerimetr == b || poluPerimetr == c)) {
            return null;
        }

        double bisectorsInA = Math.sqrt(b * c * (b + c + a) * (b + c - a)) / (b + c);
        double bisectorsInB = Math.sqrt(a * c * (a + c + b) * (a + c - b)) / (a + c);
        double bisectorsInC = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);

        double[] result = new double[3];
        result[0] = Math.min(Math.min(bisectorsInA, bisectorsInB), bisectorsInC);
        result[2] = Math.max(Math.max(bisectorsInA, bisectorsInB), bisectorsInC);
        result[1] = (bisectorsInA + bisectorsInB + bisectorsInC) - result[0] - result[2];
        return result;

    }

    static double[] getAngles(double a, double b, double c) {
        double poluPerimetr = (a + b + c) / 2;
        if ((a + b < c || b + c < a || c + a < b) || (poluPerimetr == a || poluPerimetr == b || poluPerimetr == c)) {
            return null;
        }

        double AnglA = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)));
        double AnglB = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
        double AnglC = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b)));

        double[] result = new double[3];
        result[0] = Math.min(Math.min(AnglA, AnglB), AnglC);
        result[2] = Math.max(Math.max(AnglA, AnglB), AnglC);
        result[1] = (AnglA + AnglB + AnglC) - result[0] - result[2];
        return result;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double poluPerimetr = (a + b + c) / 2;
        if ((a + b < c || b + c < a || c + a < b) || (poluPerimetr == a || poluPerimetr == b || poluPerimetr == c)) {
            return 0;
        }

        return Math.sqrt(((poluPerimetr - a) * (poluPerimetr - b) * (poluPerimetr - c)) / poluPerimetr);
    }

    static double getCircumradius(double a, double b, double c) {
        double poluPerimetr = (a + b + c) / 2;
        if ((a + b < c || b + c < a || c + a < b) || (poluPerimetr == a || poluPerimetr == b || poluPerimetr == c)) {
            return 0;
        }

        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }
}