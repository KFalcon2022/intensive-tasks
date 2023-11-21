package com.walking.intensive.chapter1.task5;

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

        double[] angles = getAngles(3, 4, 5);
        System.out.println("Углы: " + Arrays.toString(angles));

        double inscribedCircleRadius = getInscribedCircleRadius(3, 4, 5);
        System.out.println("Радиус вписанного круга: " + inscribedCircleRadius);

        double circumradius = getCircumradius(3, 4, 5);
        System.out.println("Длина окружности: " + circumradius);

        double areaAdvanced = getAreaAdvanced(3, 4, 5);
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
            double[] heights = new double[3];
            heights[0] = (2 * area) / a;
            heights[1] = (2 * area) / b;
            heights[2] = (2 * area) / c;
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
        double[] medians = new double[3];
        medians[0] = (Math.sqrt(2 * b * b + 2 * c * c - a * a)) / 2;
        medians[1] = (Math.sqrt(2 * a * a + 2 * c * c - b * b)) / 2;
        medians[2] = (Math.sqrt(2 * a * a + 2 * b * b - c * c)) / 2;
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double[] bisectors = new double[3];
        bisectors[0] = 2 * Math.sqrt(b * c * p * (p - a)) / (b + c);
        bisectors[1] = 2 * Math.sqrt(a * c * p * (p - b)) / (a + c);
        bisectors[2] = 2 * Math.sqrt(a * b * p * (p - c)) / (a + b);
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] angels = new double[3];
        angels[0] = Math.toDegrees(Math.acos(b * b + c * c - a * a) / (2 * b * c));
        angels[1] = Math.toDegrees(Math.acos(a * a + c * c - b * b) / (2 * a * c));
        angels[2] = Math.toDegrees(Math.acos(a * a + b * b - c * c) / (2 * a * b));
        Arrays.sort(angels);
        return angels;
    }

    static double getInscribedCircleRadius(double a, double b, double c) throws IllegalAccessException {
        double p = (a + b + c) / 2;
        double area = getAreaByHeron(a, b, c);
        return area / p;
    }

    static double getCircumradius(double a, double b, double c) throws IllegalAccessException {
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double angleA = Math.toRadians(getAngles(a, b, c)[0]);
        double angleB = Math.toRadians(getAngles(a, b, c)[1]);
        double angleC = Math.toRadians(getAngles(a, b, c)[2]);
        return 0.5 * a * b * Math.sqrt(angleC);
    }
}