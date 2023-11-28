package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 4;
        double b = 5;
        double c = 6;

        System.out.println("Если стороны треугольника равны: " + a + ", " + b + " и " + c + ", то:");
        System.out.println("Площадь треугольника равна " + getAreaByHeron(a, b, c));
        System.out.println("Длины высот треугольника: " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("Длины медиан треугольника: " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("Длины биссектрис треугольника: " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("Углы треугольника: " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("Длина радиуса вписанной в треугольник окружности: " + getInscribedCircleRadius(a, b, c));
        System.out.println("Длина радиуса описанной вокруг треугольника окружности: " + getCircumradius(a, b, c));
        System.out.println("Площадь треугольника через синус и косинус: " + getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (a <= 0 && b <= 0 && c <= 0)
            return 0;
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double heightA = (getAreaByHeron(a, b, c) * 2) / a;
        double heightB = (getAreaByHeron(a, b, c) * 2) / b;
        double heightC = (getAreaByHeron(a, b, c) * 2) / c;
        double[] arr = {heightA, heightB, heightC};
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double medianA = (Math.sqrt((2 * Math.pow(b, 2)) + (2 * Math.pow(c, 2)) - Math.pow(a, 2))) / 2;
        double medianB = (Math.sqrt((2 * Math.pow(a, 2)) + (2 * Math.pow(c, 2)) - Math.pow(b, 2))) / 2;
        double medianC = (Math.sqrt((2 * Math.pow(a, 2)) + (2 * Math.pow(b, 2)) - Math.pow(c, 2))) / 2;
        double[] arr = {medianA, medianB, medianC};
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double bisectorA = (Math.sqrt(b * c * (a + b + c) * (b + c - a))) / (b + c);
        double bisectorB = (Math.sqrt(a * c * (a + b + c) * (a + c - b))) / (a + c);
        double bisectorC = (Math.sqrt(a * b * (a + b + c) * (a + b - c))) / (a + b);
        double[] arr = {bisectorA, bisectorB, bisectorC};
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double angleA = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));
        double[] arr = {angleA, angleB, angleC};
        Arrays.sort(arr);
        return arr;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        return (2 * getAreaByHeron(a, b, c)) / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2;
        return (a * b * c) / (4 * Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosC = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double sinC = Math.sqrt(1 - Math.pow((cosC), 2));
        return (a * b * sinC) / 2;
    }
}