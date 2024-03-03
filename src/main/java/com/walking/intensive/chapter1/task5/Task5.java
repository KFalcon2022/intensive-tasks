package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

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

        double[] heights = getHeights(a, b, c);

        System.out.println("Высоты треугольника: " + Arrays.toString(heights));

        double[] medians = getMedians(a, b, c);

        System.out.println("Медианы треугольника: " + Arrays.toString(medians));

        double[] bisectors = getBisectors(a, b, c);

        System.out.println("Биссектрисы треугольника:" + Arrays.toString(bisectors));

        double[] angles = getAngles(a, b, c);

        System.out.println("Углы треугольника: " + Arrays.toString(angles));

        System.out.println("Радиус вписанной окружности: " + getInscribedCircleRadius(a, b, c));

        System.out.println("Радиус описанной окружности: " + getCircumradius(a, b, c));

        System.out.println("Формула площади через синус: " + getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            System.out.println("Треугольник вырожденный или не существует ");
            return 0;
        }

        final double halfPerimeter = (a + b + c) / 2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
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
        final double powA = Math.pow(a, 2),
                powB = Math.pow(b, 2),
                powC = Math.pow(c, 2),
                median1 = Math.sqrt(2 * powA + 2 * powB - powC) / 2,
                median2 = Math.sqrt(2 * powA + 2 * powC - powB) / 2,
                median3 = Math.sqrt(2 * powB + 2 * powC - powA) / 2;

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

        double bisector1 = Math.sqrt((a * b * (a + b + c) * (a + b - c))) / (a + b);
        double bisector2 = Math.sqrt((a * c * (a + c + b) * (a + c - b))) / (a + c);
        double bisector3 = Math.sqrt((b * c * (b + c + a) * (b + c - a))) / (b + c);
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

        double cosineA = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double angleInRadiansA = Math.acos(cosineA);
        double angleInDegreesA = Math.toDegrees(angleInRadiansA);

        double cosineB = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
        double angleInRadiansB = Math.acos(cosineB);
        double angleInDegreesB = Math.toDegrees(angleInRadiansB);

        double cosineC = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
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

        final double halfPerimeter = (a + b + c) / 2;

        return Math.sqrt((halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c) / halfPerimeter);
    }

    static double getCircumradius(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return 0;
        }

        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        if (isTriangleNotExist(a, b, c)) {
            return 0;
        }

        final double cosineA = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c),
                sinusA = Math.sqrt(1 - Math.pow(cosineA, 2));

        return b * c * sinusA / 2;
    }

    static boolean isTriangleNotExist(double a, double b, double c) {
        return !((a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a) && (Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a));
    }
}