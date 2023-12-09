package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

    }
    static boolean checkTriangleExistance (double a, double b, double c) {
        return ((a + b) <= c) || ((b + c) <= a) || ((a + c) <= b);
    }

    static double getAreaByHeron(double a, double b, double c) {
        //        Место для вашего кода
        if (checkTriangleExistance(a, b, c)) {
            return -1;
        }
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter -c));
        }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        //        Место для вашего кода
        if (checkTriangleExistance(a, b, c)) {
            return null;
        }
        double[] heightsArr = new double[3];
        heightsArr[0] = 2 * getAreaByHeron(a, b, c) / a;
        heightsArr[1] = 2 * getAreaByHeron(a, b, c) / b;
        heightsArr[2] = 2 * getAreaByHeron(a, b, c) / c;
        Arrays.sort(heightsArr);
        return heightsArr;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        //        Место для вашего кода

        if (checkTriangleExistance(a, b, c)) {
            return null;
        }
        double[] mediansArr = new double[3];
        mediansArr[0] = Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2)) / 2;
        mediansArr[1] = Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(b, 2)) / 2;
        mediansArr[2] = Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)) / 2;
        Arrays.sort(mediansArr);
        return mediansArr;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода
        if (checkTriangleExistance(a, b, c)) {
            return null;
        }
        double[] bisectorsArr = new double[3];
        bisectorsArr[0] = Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c);
        bisectorsArr[1] = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        bisectorsArr[2] = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        Arrays.sort(bisectorsArr);
        return bisectorsArr;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        //        Место для вашего кода

        if (checkTriangleExistance(a, b, c)) {
            return null;
        }
        double[] anglesArr = new double[3];
        anglesArr[0] = Math.asin(a / (2 * getCircumradius(a, b, c)));
        anglesArr[1] = Math.asin(b / (2 * getCircumradius(a, b, c)));
        anglesArr[2] = Math.asin(c / (2 * getCircumradius(a, b, c)));
        Arrays.sort(anglesArr);
        return anglesArr;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        //        Место для вашего кода
        if (checkTriangleExistance(a, b, c)) {
            return 0;
        }
        return getAreaByHeron(a, b, c)/((a + b + c) / 2);
    }

    static double getCircumradius(double a, double b, double c) {
        //        Место для вашего кода
        if (checkTriangleExistance(a, b, c)) {
            return 0;
        }
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }
}