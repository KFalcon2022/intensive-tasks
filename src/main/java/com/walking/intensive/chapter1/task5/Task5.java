package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

        double a = 3;
        double b = 3;
        double c = 3;

        if ((a == 0 || b == 0 || c == 0) || (a >= b + c || b >= a + c || c >= a + b)) {
            System.out.println("Такого треугольника не существует.");
            return;
        }
        System.out.println("Площадь треугольника: " + getAreaByHeron(a, b, c));
        System.out.println("Высоты треугольника: " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("Медианы треугольника: " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("Биссектрисы треугольника: " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("Углы треугольнка: " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("Радиус вписанной окружности в треугольник: " + getInscribedCircleRadius(a, b, c));
        System.out.println("Радиус описанной окружности треугольника: " + getCircumradius(a, b, c));
        System.out.println("Площадь треугольника: " + getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2; // semiPerimetr
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double[] getHeights(double a, double b, double c) {
        double s = getAreaByHeron(a, b, c);
        double[] heights = new double[]{2 * s / a, 2 * s / b, 2 * s / c};
        Arrays.sort(heights);
        return heights;
    }

    static double[] getMedians(double a, double b, double c) {
        double[] medians = new double[3];
        medians[0] = Math.sqrt(2 * (b * b + c * c) - a * a) / 2;
        medians[1] = Math.sqrt(2 * (a * a + c * c) - b * b) / 2;
        medians[2] = Math.sqrt(2 * (a * a + b * b) - c * c) / 2;
        Arrays.sort(medians);
        return medians;
    }

    static double[] getBisectors(double a, double b, double c) {
        double[] bisectors = new double[3];
        bisectors[0] = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        bisectors[1] = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        bisectors[2] = Math.sqrt(c * b * (a + b + c) * (c + b - a)) / (b + c);
        Arrays.sort(bisectors);
        return bisectors;
    }

    static double[] getAngles(double a, double b, double c) {
        double[] anglers = new double[3];
        double s = getAreaByHeron(a, b, c);
        anglers[0] = Math.toDegrees(Math.asin(2 * s / (a * b)));
        anglers[1] = Math.toDegrees(Math.asin(2 * s / (c * b)));
        anglers[2] = Math.toDegrees(Math.asin(2 * s / (a * c)));
        Arrays.sort(anglers);
        return anglers;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double s = getAreaByHeron(a, b, c);
        return (2 * s / (a + b + c));
    }

    static double getCircumradius(double a, double b, double c) {
        double s = getAreaByHeron(a, b, c);
        return (a * b * c / (4 * s));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        return c * b / 2 * Math.sqrt(1 - Math.pow((b * b + c * c - a * a) / (2 * b * c), 2));
    }
}