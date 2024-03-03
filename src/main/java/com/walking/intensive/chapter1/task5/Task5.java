package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        double a = 3;
        double b = 8;
        double c = 10;

        if (isTriangleNotExist(a, b, c)) {
            System.out.println("Треугольник вырожденный или не существует ");
            return;
        }

        //Площадь Герона
        System.out.println("Формула площади Герона: " + getAreaByHeron(a, b, c));

        //Высоты треугольника
        double[] heights = getHeights(a, b, c);

        System.out.println("Высоты треугольника: " + Arrays.toString(heights));

        //Медианы треугольника
        double[] medians = getMedians(a, b, c);

        System.out.println("Медианы треугольника: " + Arrays.toString(medians));

        //Биссектрисы треугольника
        double[] bisectors = getBisectors(a, b, c);

        System.out.println("Биссектрисы треугольника:" + Arrays.toString(bisectors));

        //Углы треугольника
        double[] angles = getAngles(a, b, c);

        System.out.println("Углы треугольника: " + Arrays.toString(angles));

        //Радиус вписанной окружности
        System.out.println("Радиус вписанной окружности: " + getInscribedCircleRadius(a, b, c));

        //Радиус описанной окружности
        System.out.println("Радиус описанной окружности: " + getCircumradius(a, b, c));

        //Формула площади через синус
        System.out.println("Формула площади через синус: " + getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            System.out.println("Треугольник вырожденный или не существует ");
            return 0;
        }

        final double p2 = (a + b + c) / 2;

        return sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return null;
        }
        final double heron2 = getAreaByHeron(a, b, c) * 2,
                h1 = heron2 / a,
                h2 = heron2 / b,
                h3 = heron2 / c;
        double[] heights = {h1, h2, h3};
        Arrays.sort(heights);

        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return null;
        }
        final double powA = pow(a, 2),
                powB = pow(b, 2),
                powC = pow(c, 2),
                median1 = sqrt(2 * powA + 2 * powB - powC) / 2,
                median2 = sqrt(2 * powA + 2 * powC - powB) / 2,
                median3 = sqrt(2 * powB + 2 * powC - powA) / 2;

        double[] medians = {median1, median2, median3};
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return null;
        }

        double bisector1 = sqrt((a * b * (a + b + c) * (a + b - c))) / (a + b);
        double bisector2 = sqrt((a * c * (a + c + b) * (a + c - b))) / (a + c);
        double bisector3 = sqrt((b * c * (b + c + a) * (b + c - a))) / (b + c);
        double[] bisectors = {bisector1, bisector2, bisector3};
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return null;
        }

        double cosineA = (pow(a, 2) + pow(b, 2) - pow(c, 2)) / (2 * a * b);
        double angleInRadiansA = Math.acos(cosineA);
        double angleInDegreesA = Math.toDegrees(angleInRadiansA);

        double cosineB = (pow(a, 2) + pow(c, 2) - pow(b, 2)) / (2 * a * c);
        double angleInRadiansB = Math.acos(cosineB);
        double angleInDegreesB = Math.toDegrees(angleInRadiansB);

        double cosineC = (pow(b, 2) + pow(c, 2) - pow(a, 2)) / (2 * b * c);
        double angleInRadiansC = Math.acos(cosineC);
        double angleInDegreesC = Math.toDegrees(angleInRadiansC);

        double[] angles = {angleInDegreesA, angleInDegreesB, angleInDegreesC};
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return 0;
        }

        final double p2 = (a + b + c) / 2;

        return sqrt((p2 - a) * (p2 - b) * (p2 - c) / p2);
    }

    static double getCircumradius(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return 0;
        }

        final double p2 = (a + b + c) / 2;

        return (a * b * c) / (4 * Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return 0;
        }

        final double cosineA = (pow(b, 2) + pow(c, 2) - pow(a, 2)) / (2 * b * c),
                sinusA = sqrt(1 - pow(cosineA, 2));

        return b * c * sinusA / 2;
    }

    static boolean isTriangleNotExist(double a, double b, double c) {
        return !((a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a) && (Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a));
    }
}