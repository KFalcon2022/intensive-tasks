

package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        double a = 8;
        double b = 7;
        double c = 4;
        System.out.println(getAreaByHeron(a, b, c));
        System.out.println(Arrays.toString(getHeights(a, b, c)));
        System.out.println(Arrays.toString(getMedians(a, b, c)));
        System.out.println(Arrays.toString(getAngles(a, b, c)));
        System.out.println(Arrays.toString(getBisectors(a, b, c)));
        System.out.println(getInscribedCircleRadius(a, b, c));
        System.out.println(getCircumradius(a, b, c));
    }


    static double getAreaByHeron(double a, double b, double c) {
        checkTriangle(a, b, c);
        double p = getSemiperimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        checkTriangle(a, b, c);
        double area = getAreaByHeron(a, b, c);
        double[] arr = {(area * 2) / a, (area * 2) / b, (area * 2) / c};
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        checkTriangle(a, b, c);
        double ma = (Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2))) / 2;
        double mb = (Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - Math.pow(b, 2))) / 2;
        double mc = (Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(a, 2) - Math.pow(c, 2))) / 2;
        double[] arr = {ma, mb, mc};
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        checkTriangle(a, b, c);
        double bisA = (Math.sqrt((b * c) * (a + b + c) * (b + c - a))) / (c + b);
        double bisB = (Math.sqrt((a * c) * (a + b + c) * (a + c - b))) / (a + c);
        double bisC = (Math.sqrt((a * b) * (a + b + c) * (a + b - c))) / (a + b);
        double[] arr = {bisA, bisB, bisC};
        Arrays.sort(arr);
        return arr; // Заглушка. При реализации - удалить
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        checkTriangle(a, b, c);
        double[] arr = new double[3];
        arr[0] = (Math.acos((b * b + c * c - a * a) / (2 * b * c))) * 180 / Math.PI;
        arr[1] = (Math.acos((a * a + b * b - c * c) / (2 * a * b))) * 180 / Math.PI;
        arr[2] = (Math.acos((a * a + c * c - b * b) / (2 * a * c))) * 180 / Math.PI;
        Arrays.sort(arr);
        return arr;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        return getAreaByHeron(a, b, c) / getSemiperimeter(a, b, c);
    }

    static double getCircumradius(double a, double b, double c) {
        checkTriangle(a, b, c);
        double p = getSemiperimeter(a, b, c);
        return (a * b * c) / (4 * (Math.sqrt(p * (p - a) * (p - b) * (p - c))));
    }

//    static double getAreaAdvanced(double a, double b, double c) {
//        //        Место для вашего кода
//
//        return 0; // Заглушка. При реализации - удалить
//    }

    static double getSemiperimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    static void checkTriangle(double a, double b, double c) throws IllegalArgumentException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Треугольника не существует или он вырожденный.");
        }
    }

}