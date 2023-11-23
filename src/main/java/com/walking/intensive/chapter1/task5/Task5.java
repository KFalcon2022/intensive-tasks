package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 14;
        double b = 15;
        double c = 13;

        if (checkTriangleExist(a, b, c)) {
            System.out.println("Проверьте введенные значения сторон. Треугольник не существует или вырожденный");
            return;
        }

        System.out.println("Площадь треугольника по теореме Герона = " + getAreaByHeron(a, b, c));
        System.out.println("Все 3 высоты треугольника = " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("Все 3 медианы треугольника = " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("Все 3 биссектрисы треугольника = " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("Углы треугольника = " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("Радиус вписанной в треугольник окружности = " + getInscribedCircleRadius(a, b, c));
        System.out.println("Радиус описанной около треугольника окружности = " + getCircumradius(a, b, c));
        System.out.println("Площадь треугольника через синус = " + getAreaAdvanced(a, b, c));

    }

    static boolean checkTriangleExist(double a, double b, double c) {
        return (a <= 0 || b <= 0 || c <= 0) || (a + b < c || a + c < b || b + c < a);
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (checkTriangleExist(a, b, c)) {
            return 0;
        }

        double p = (a + b + c) / 2;

        return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        if (checkTriangleExist(a, b, c)) {
            return null;
        }

        double area = getAreaByHeron(a, b, c);
        double height1 = 2 * area / a;
        double height2 = 2 * area / b;
        double height3 = 2 * area / c;
        double[] allHeights = {height1, height2, height3};
        Arrays.sort(allHeights);

        return allHeights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        if (checkTriangleExist(a, b, c)) {
            return null;
        }

        double median1 = Math.pow((2 * (b * b + c * c) - a * a), 0.5) / 2;
        double median2 = Math.pow((2 * (a * a + c * c) - b * b), 0.5) / 2;
        double median3 = Math.pow((2 * (a * a + b * b) - c * c), 0.5) / 2;
        double[] allMedians = {median1, median2, median3};
        Arrays.sort(allMedians);

        return allMedians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        if (checkTriangleExist(a, b, c)) {
            return null;
        }

        double p = (a + b + c) / 2;
        double bisector1 = 2 * Math.pow((a * b * p * (p - c)), 0.5) / (a + b);
        double bisector2 = 2 * Math.pow((a * c * p * (p - b)), 0.5) / (a + c);
        double bisector3 = 2 * Math.pow((b * c * p * (p - a)), 0.5) / (b + c);
        double[] allBisectors = {bisector1, bisector2, bisector3};
        Arrays.sort(allBisectors);

        return allBisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        if (checkTriangleExist(a, b, c)) {
            return null;
        }

        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double angleA = Math.toDegrees(Math.acos(cosA));
        double cosB = (a * a + c * c - b * b) / (2 * a * c);
        double angleB = Math.toDegrees(Math.acos(cosB));
        double angleC = 180 - angleA - angleB;
        double[] allAngles = {angleA, angleB, angleC};
        Arrays.sort(allAngles);

        return allAngles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (checkTriangleExist(a, b, c)) {
            return 0;
        }

        double p = (a + b + c) / 2;

        return getAreaByHeron(a, b, c) / p;
    }

    static double getCircumradius(double a, double b, double c) {
        if (checkTriangleExist(a, b, c)) {
            return 0;
        }

        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        if (checkTriangleExist(a, b, c)) {
            return 0;
        }

        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double sinA = Math.pow((1 - cosA * cosA), 0.5);

        return (b * c * sinA) / 2;
    }
}