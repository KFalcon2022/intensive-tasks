package com.walking.intensive.chapter1.task5;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 13, b = 14, c = 15;

        System.out.printf("Дано. Треугольник со сторонами: "
                                  + "a = %.2f, b = %.2f, c = %.2f%n", a, b, c);
        if (isTriangleExists(a, b, c)) {
            System.out.println("Треугольник существует.");
            System.out.printf(
                    "Площадь треугольника по формуле Герона: %.2f%n", getAreaByHeron(a, b, c));
            System.out.printf(
                    "Высоты треугольника: %s%n", Arrays.toString(getHeights(a, b, c)));
            System.out.printf(
                    "Медианы треугольника: %s%n", Arrays.toString(getMedians(a, b, c)));
            System.out.printf(
                    "Биссектрисы треугольника: %s%n", Arrays.toString(getBisectors(a, b, c)));
            System.out.printf(
                    "Углы треугольника: %s%n", Arrays.toString(getAngles(a, b, c)));
            System.out.printf(
                    "Радиус вписанной окружности: %.2f%n", getInscribedCircleRadius(a, b, c));
            System.out.printf(
                    "Радиус описанной окружности: %.2f%n", getCircumradius(a, b, c));
            System.out.printf(
                    "Площадь треугольника продвинутый метод: %s%n", getAreaAdvanced(a, b, c));
        }
        else {
            System.out.println("Треугольник не существует.");
        }
    }

    static double getAreaByHeron(double a, double b, double c) {

        double semiPerimeter = getSemiPerimeter(a, b, c);

        return Math.sqrt(semiPerimeter
                                 * (semiPerimeter - a)
                                 * (semiPerimeter - b)
                                 * (semiPerimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {

        TreeSet<Double> heights = new TreeSet<>();
        heights.add(2 * getAreaByHeron(a, b, c) / a);
        heights.add(2 * getAreaByHeron(a, b, c) / b);
        heights.add(2 * getAreaByHeron(a, b, c) / c);

        return heights.stream().mapToDouble(Double::doubleValue).toArray();
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        TreeSet<Double> medians = new TreeSet<>();
        medians.add(Math.sqrt(2 * (a * a + c * c) - b * b) / 2);
        medians.add(Math.sqrt(2 * (a * a + b * b) - c * c) / 2);
        medians.add(Math.sqrt(2 * (b * b + c * c) - a * a) / 2);

        return medians.stream().mapToDouble(Double::doubleValue).toArray();
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {

        TreeSet<Double> bisectors = new TreeSet<>();
        bisectors.add(Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b));
        bisectors.add(Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c));
        bisectors.add(Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c));

        return bisectors.stream().mapToDouble(Double::doubleValue).toArray();
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {

        TreeSet<Double> angles = new TreeSet<>();
        angles.add(radiansToDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b))));
        angles.add(radiansToDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c))));
        angles.add(radiansToDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c))));

        return angles.stream().mapToDouble(Double::doubleValue).toArray();
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        return getAreaByHeron(a, b, c) / getSemiPerimeter(a, b, c);
    }

    static double getCircumradius(double a, double b, double c) {

        return a * b * c / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {

        double cosAlpha = (b * b + c * c - a * a) / (2 * b * c);
        double sinAlpha = Math.sqrt(1 - cosAlpha * cosAlpha);

        return b * c * sinAlpha / 2;
    }

    static boolean isTriangleExists(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        if (a + b > c && b + c > a && a + c > b) {
            return true;
        }

        return false;
    }

    static double getSemiPerimeter(double a, double b, double c) {

        return (a + b + c) / 2;
    }

    static double radiansToDegrees(double radians) {

        return (radians * 180) / Math.PI;
    }
}