package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

        System.out.println(getInscribedCircleRadius(12, 13, 5));

    }

    static double getAreaByHeron(double a, double b, double c) {

        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double height1, height2, height3;

        height1 = 2 * getAreaByHeron(a, b, c) / a;
        height2 = 2 * getAreaByHeron(a, b, c) / b;
        height3 = 2 * getAreaByHeron(a, b, c) / c;

        double[] arr = new double[]{height1, height2, height3};
        Arrays.sort(arr);

        return arr;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double median1, median2, median3;

        median1 = Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)) * 0.5;
        median2 = Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2)) * 0.5;
        median3 = Math.sqrt(2 * (Math.pow(c, 2) + Math.pow(a, 2)) - Math.pow(b, 2)) * 0.5;

        double[] arr = new double[]{median1, median2, median3};
        Arrays.sort(arr);

        return arr;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double bisector1, bisector2, bisector3;

        bisector1 = Math.sqrt(a * b * (Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2) - Math.pow(c, 2))) / (a + b);
        bisector2 = Math.sqrt(b * c * (Math.pow(b, 2) + 2 * b * c + Math.pow(c, 2) - Math.pow(a, 2))) / (b + c);
        bisector3 = Math.sqrt(c * a * (Math.pow(c, 2) + 2 * c * a + Math.pow(a, 2) - Math.pow(b, 2))) / (c + a);

        double[] arr = new double[]{bisector1, bisector2, bisector3};
        Arrays.sort(arr);

        return arr;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {

        double angleA, angleB, angleC;

        angleA = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
        angleB = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));
        angleC = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) / (2 * c * a)));

        double[] arr = new double[]{angleA, angleB, angleC};
        Arrays.sort(arr);

        return arr;

    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        double halfPerimeter, square;

        halfPerimeter = (a + b + c) / 2;

        square = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));

        return square / halfPerimeter;
    }

    static double getCircumradius(double a, double b, double c) {

        double halfPerimeter;

        halfPerimeter = (a + b + c) / 2;

        return (a * b * c) / (4 * Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }
}