package main.java.com.walking.intensive.chapter1.task5;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {

        double a = 12;
        double b = 13;
        double c = 5;
    }

    public static double getAreaByHeron(double a, double b, double c) {

        if (!isTriangleValid(a, b, c)) {
            return 0;
        }
        return Math.sqrt(getSemiPerimeter(a, b, c) * (getSemiPerimeter(a, b, c) - a) * (getSemiPerimeter(a, b, c) - b) * (getSemiPerimeter(a, b, c) - c));
    }

    public static double[] getHeights(double a, double b, double c) {

        if (!isTriangleValid(a, b, c)) {
            return new double[0];
        }
        double heightOne = 2 * getAreaByHeron(a, b, c) / a;
        double heightTwo = 2 * getAreaByHeron(a, b, c) / b;
        double heightThree = 2 * getAreaByHeron(a, b, c) / c;

        double[] heights = {heightOne, heightTwo, heightThree};
        Arrays.sort(heights);

        return heights;
    }

    public static double[] getMedians(double a, double b, double c) {

        if (!isTriangleValid(a, b, c)) {
            return new double[0];
        }
        double medianOne = 0.5 * Math.sqrt(2 * (a * a) + 2 * (b * b) - (c * c));
        double medianTwo = 0.5 * Math.sqrt(2 * (b * b) + 2 * (c * c) - (a * a));
        double medianThree = 0.5 * Math.sqrt(2 * (c * c) + 2 * (a * a) - (b * b));

        double[] medians = {medianOne, medianTwo, medianThree};
        Arrays.sort(medians);

        return medians;
    }

    public static double[] getBisectors(double a, double b, double c) {

        if (!isTriangleValid(a, b, c)) {
            return new double[0];
        }

        double bisectorOne = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        double bisectorTwo = Math.sqrt(b * c * (b + c + a) * (b + c - a)) / (b + c);
        double bisectorThree = Math.sqrt(c * a * (c + a + b) * (c + a - b)) / (c + a);

        double[] bisectors = {bisectorOne, bisectorTwo, bisectorThree};
        Arrays.sort(bisectors);

        return bisectors;
    }

    public static double[] getAngles(double a, double b, double c) {

        if (!isTriangleValid(a, b, c)) {
            return new double[0];
        }

        double angle1 = Math.acos((a * a + b * b - c * c) / (2 * a * b)) / Math.PI * 180;
        double angle2 = Math.acos((a * a + c * c - b * b) / (2 * a * c)) / Math.PI * 180;
        double angle3 = 180 - angle1 - angle2;

        double[] angles = {angle1, angle2, angle3};
        Arrays.sort(angles);

        return angles;
    }

    public static double getInscribedCircleRadius(double a, double b, double c) {

        if (!isTriangleValid(a, b, c)) {
            return 0;
        }
        return Math.sqrt((getSemiPerimeter(a, b, c) - a) * (getSemiPerimeter(a, b, c) - b) * (getSemiPerimeter(a, b, c) - c) / getSemiPerimeter(a, b, c));
    }

    public static double getCircumradius(double a, double b, double c) {

        if (!isTriangleValid(a, b, c)) {
            return 0;
        }
        return (a * b * c) / (4 * Math.sqrt(getSemiPerimeter(a, b, c) * (getSemiPerimeter(a, b, c) - a) * (getSemiPerimeter(a, b, c) - b) * (getSemiPerimeter(a, b, c) - c)));

    }

    public static double getAreaAdvanced(double a, double b, double c) {

        if (!isTriangleValid(a, b, c)) {
            return 0;
        }

        double cos1 = (b * b + c * c - a * a) / (2 * b * c);
        double sin1 = Math.sqrt(1 - cos1 * cos1);

        return 0.5 * b * c * sin1;
    }

    public static boolean isTriangleValid(double a, double b, double c) {

        return a > 0 && b > 0 && c > 0 && (a + b) > c && (b + c) > a && (a + c) > b;
    }

    public static double getSemiPerimeter(double a, double b, double c) {

        return (a + b + c) / 2;
    }
}
