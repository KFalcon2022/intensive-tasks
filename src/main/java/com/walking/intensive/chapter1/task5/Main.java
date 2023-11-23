package com.walking.intensive.chapter1.task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {

    public static void main(String[] args) {
        Scanner inputFirst = new Scanner(System.in);
        System.out.println("a = ");
        double a = inputFirst.nextDouble();
        Scanner inputSecond = new Scanner(System.in);
        System.out.println("b = ");
        double b = inputSecond.nextDouble();
        Scanner inputThird = new Scanner(System.in);
        System.out.println("c = ");
        double c = inputThird.nextDouble();

        if (checkTriangle(a, b, c)) {
            getOutput(a, b, c);
        } else {
            System.out.println("Такой треугольник не существует!");
        }

    }

    static boolean checkTriangle(double a, double b, double c) {

        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }

        return false;
    }

    static void getOutput(double a, double b, double c) {
        System.out.println("Площадь треугольника выведенная " +
                "формулой Герона - " + getAreaByHeron(a, b, c));
        System.out.println("Длины всех высот треугольника - "
                + Arrays.toString(getHeights(a, b, c)).replaceAll("\\[","")
                .replaceAll("]",""));
        System.out.println("Длины всех медиан треугольника - "
                + Arrays.toString(getMedians(a, b, c)).replaceAll("\\[","")
                .replaceAll("]",""));
        System.out.println("Длины всех биссектрис треугольника - "
                + Arrays.toString(getBisectors(a, b, c)).replaceAll("\\[","")
                .replaceAll("]",""));
        System.out.println("Значения всех углов треугольника в градусах - "
                + Arrays.toString(getAngles(a, b, c)).replaceAll("\\[","")
                .replaceAll("]",""));
        System.out.println("Длина радиуса вписанной в треугольник " +
                "окружности - " + getInscribedCircleRadius(a, b, c));
        System.out.println("Длина радиуса описанной вокруг " +
                "треугольника окружности - "
                + getCircumradius(a, b, c));
        System.out.println("Площадь треугольника через " +
                "теорему косинусов - " + getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return (double) Math.round(
                Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100) / 100;
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double[] heights = new double[3];
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        heights[0] = (double) Math.round((2 * s / a) * 100) / 100;
        heights[1] = (double) Math.round((2 * s / b) * 100) / 100;
        heights[2] = (double) Math.round((2 * s / c) * 100) / 100;
        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] medians = new double[3];
        medians[0] = (double) Math.round(
                Math.sqrt((2 * (a * a + b * b) - c * c)) / 2 * 100) / 100;
        medians[1] = (double) Math.round(
                Math.sqrt((2 * (a * a + c * c) - b * b)) / 2 * 100) / 100;
        medians[2] = (double) Math.round(
                Math.sqrt((2 * (c * c + b * b) - a * a)) / 2 * 100) / 100;
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] bisectors = new double[3];
        bisectors[0] = (double) Math.round(Math.sqrt(
                a * b * (a + b + c) * (a + b - c)) / (a + b) * 100) / 100;
        bisectors[1] = (double) Math.round(Math.sqrt(
                b * c * (a + b + c) * (c + b - a)) / (b + c) * 100) / 100;
        bisectors[2] = (double) Math.round(Math.sqrt(
                a * c * (a + b + c) * (a + c - b)) / (a + c) * 100) / 100;
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] angles = new double[3];
        angles[0] = (double) Math.round(Math.toDegrees(
                Math.acos((b * b + c * c - a * a) / (2 * b * c))) * 100) / 100;
        angles[1] = (double) Math.round(Math.toDegrees(
                Math.acos((a * a + c * c - b * b) / (2 * a * c))) * 100) / 100;
        angles[2] = (double) Math.round(Math.toDegrees(
                Math.acos((a * a + b * b - c * c) / (2 * a * b))) * 100) / 100;
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return (double) Math.round(2 * s / (a + b + c) * 100) / 100;
    }

    static double getCircumradius(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return (double) Math.round(
                a * b * c / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c))) * 100) / 100;
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosAlpha = (a * a + c * c - b * b) / (2 * a * c);
        double sinAlpha = Math.sqrt(1 - cosAlpha * cosAlpha);
        return (double) Math.round((a * c * sinAlpha / 2) * 100) / 100;
    }
}
