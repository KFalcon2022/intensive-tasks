package com.walking.intensive.chapter1.task5;

import java.util.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        double a = 6;
        double b = 6;
        double c = 6;
        if (getSidesIsValid(a, b, c)) {
            System.out.printf("Площадь по герону %.3f%n", getAreaByHeron(a, b, c));
            double[] heights = getHeights(a, b, c);
            System.out.printf("Высоты %.3f %.3f %.3f%n", heights[0], heights[1], heights[2]);
            double[] medians = getMedians(a, b, c);
            System.out.printf("Медианы %.3f %.3f %.3f%n", medians[0], medians[1], medians[2]);
            double[] bisectors = getBisectors(a, b, c);
            System.out.printf("Биссектрисы %.3f %.3f %.3f%n", bisectors[0], bisectors[1], bisectors[2]);
            double[] angles = getAngles(a, b, c);
            System.out.printf("Углы в градусах %.3f %.3f %.3f%n", angles[0], angles[1], angles[2]);
            System.out.printf("Радиус вписанной окружности %.3f%n", getInscribedCircleRadius(a, b, c));
            System.out.printf("Радиус описанной окружности %.3f%n", getCircumradius(a, b, c));
            System.out.printf("Площадь через теорему косинусов %.3f", getAreaAdvanced(a, b, c));
        } else {
            System.out.println("Вырожденный или несуществующий треугольник");
        }

    }

    static private Boolean getSidesIsValid(double a, double b, double c) {
        return a > 0. && b > 0. && c > 0. && (a + b) > c && (a + c) > b && (b + c) > a;
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (!getSidesIsValid(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2.;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        if (!getSidesIsValid(a, b, c)) {
            return new double[0];
        }
        double[] heights = new double[3];
        double area = getAreaByHeron(a, b, c);
        heights[0] = 2. * area / a;
        heights[1] = 2. * area / b;
        heights[2] = 2. * area / c;
        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        if (!getSidesIsValid(a, b, c)) {
            return new double[0];
        }
        double[] medians = new double[3];
        medians[0] = 0.5 * Math.sqrt(2. * b * b + 2. * c * c - a * a);
        medians[1] = 0.5 * Math.sqrt(2. * b * b + 2. * a * a - c * c);
        medians[2] = 0.5 * Math.sqrt(2. * a * a + 2. * c * c - b * b);
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        if (!getSidesIsValid(a, b, c)) {
            return new double[0];
        }
        double[] bisectors = new double[3];
        double p = 0.5 * (a + b + c);
        bisectors[0] = (2. * Math.sqrt(b * c * p * (p - a))) / (b + c);
        bisectors[1] = (2. * Math.sqrt(a * c * p * (p - b))) / (a + c);
        bisectors[2] = (2. * Math.sqrt(b * a * p * (p - c))) / (b + a);
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        if (!getSidesIsValid(a, b, c)) {
            return new double[0];
        }
        double[] angles = new double[3];
        angles[0] = Math.acos((a * a + b * b - c * c) / (2. * a * b)) / Math.PI * 180.;
        angles[1] = Math.acos((a * a + c * c - b * b) / (2. * a * c)) / Math.PI * 180.;
        angles[2] = 180. - angles[0] - angles[1];
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (!getSidesIsValid(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2.;
        return Math.sqrt((p - a) * (p - b) * (p - c) / p);
    }

    static double getCircumradius(double a, double b, double c) {
        if (!getSidesIsValid(a, b, c)) {
            return 0;
        }
        double s = getAreaByHeron(a, b, c);
        return a * b * c / (4 * s);
    }

    static double getAreaAdvanced(double a, double b, double c) {
        if (!getSidesIsValid(a, b, c)) {
            return 0;
        }
        double cosAlpha = (b * b + c * c - a * a) / (2. * b * c);
        double sinAlpha = Math.sqrt(1 - cosAlpha * cosAlpha);
        return 0.5 * b * c * sinAlpha;
    }
}