package com.walking.intensive.chapter1.task5;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        double area = getAreaByHeron(3, 4, 5);
        System.out.println("Формула Герона: " + area);

        double[] heights = getHeights(3, 4, 5);
        System.out.println("Высота: " + Arrays.toString(heights));

        double[] medians = getMedians(3, 4, 5);
        System.out.println("Медианы: " + Arrays.toString(medians));

        double[] bisectors = getBisectors(3, 4, 5);
        System.out.println("Биссектрисы: " + Arrays.toString(bisectors));

        double[] angles = getAngles(6, 8, 10);
        System.out.println("Углы: " + Arrays.toString(angles));

        double inscribedCircleRadius = getInscribedCircleRadius(3, 4, 5);
        System.out.println("Радиус вписанного круга: " + inscribedCircleRadius);

        double circumradius = getCircumradius(3, 4, 5);
        System.out.println("Длина окружности: " + circumradius);

        double areaAdvanced = getAreaAdvanced(1, 1, 1);
        System.out.println("площадь: " + areaAdvanced);
    }

    static double getAreaByHeron(double a, double b, double c) throws IllegalAccessException {
        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) + (p - c));
        } else {
            throw new IllegalAccessException("нет");
        }
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) throws IllegalAccessException {
        if (a + b > c && a + c > b && b + c > a) {
            double area = getAreaByHeron(a, b, c);
            double[] heights = {2 * area / a, 2 * area / b, 2 * area / c};
            Arrays.sort(heights);
            return heights;
        } else {
            throw new IllegalArgumentException("нет");
        }
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] medians = {
                0.5 * Math.sqrt(2 * b * b + 2 * c * c - a * a),
                0.5 * Math.sqrt(2 * a * a + 2 * c * c - b * b),
                0.5 * Math.sqrt(2 * a * a + 2 * b * b - c * c)
        };
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double[] bisectors = {
                2 * Math.sqrt(b * c * p * (p - a)) / (b + c),
                2 * Math.sqrt(a * c * p * (p - b)) / (a + c),
                2 * Math.sqrt(a * b * p * (p - c)) / (a + b)
        };
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] angles = new double[3];
        angles[0] = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        angles[1] = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        angles[2] = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        for (int i = 0; i < angles.length; i++) {
            angles[i] = Math.toDegrees(angles[i]);
        }
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) throws IllegalAccessException {
        return getAreaByHeron(a,b,c) / ((a + b + c) / 2);
    }

    static double getCircumradius(double a, double b, double c) throws IllegalAccessException {
        return (a * b * c) / (4 * getAreaByHeron(a,b,c));
    }

    static double getAreaAdvanced(double a, double b, double c) throws IllegalAccessException {
        double cosC = (a * a + b * b - c * c) / (2 * a * b);
        double sinC = Math.sqrt(1 - cosC * cosC);
        return 0.5 * a * b * sinC;
    }
}