package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 3;
        double b = 4;
        double c = 5;

        System.out.println("Площадь треугольника: " + getAreaByHeron(a, b, c));
        System.out.println("Высоты треугольника: " + getHeights(a, b, c)[0] + ", " + getHeights(a, b, c)[1] + ", " + getHeights(a, b, c)[2]);
        System.out.println("Медианы треугольника: " + getMedians(a, b, c)[0] + ", " + getMedians(a, b, c)[1] + ", " + getMedians(a, b, c)[2]);
        System.out.println("Биссектрисы треугольника: " + getBisectors(a, b, c)[0] + ", " + getBisectors(a, b, c)[1] + ", " + getBisectors(a, b, c)[2]);
        System.out.println("Углы треугольника: " + getAngles(a, b, c)[0] + " градусов, " + getAngles(a, b, c)[1] + " градусов, " + getAngles(a, b, c)[2] + " градусов, ");
    }

    static double getAreaByHeron(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        //        Место для вашего кода
        double aHeight = 2 * getAreaByHeron(a, b, c) / a;
        double bHeight = 2 * getAreaByHeron(a, b, c) / b;
        double cHeight = 2 * getAreaByHeron(a, b, c) / c;
        double[] heights = {aHeight, bHeight, cHeight};

        Arrays.sort(heights);

        return heights;

    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        //        Место для вашего кода
        double cMedian = Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2;
        double bMedian = Math.sqrt(2 * a * a + 2 * c * c - b * b) / 2;
        double aMedian = Math.sqrt(2 * b * b + 2 * c * c - a * a) / 2;
        double[] medians = {aMedian, bMedian, cMedian};

        Arrays.sort(medians);

        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода
        double cBisector = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        double bBisector = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        double aBisector = Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c);
        double[] bisectors = {aBisector, bBisector, cBisector};

        Arrays.sort(bisectors);

        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        //        Место для вашего кода
        double alpha = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
        double beta = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        double gamma = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
        double[] angles = {alpha, beta, gamma};

        Arrays.sort(angles);

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }

    static double getCircumradius(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }


}