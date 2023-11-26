package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 12;
        double b = 13;
        double c = 5;

    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = getSemiPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = 2 * getAreaByHeron(a, b, c) / a;
        array[1] = 2 * getAreaByHeron(a, b, c) / b;
        array[2] = 2 * getAreaByHeron(a, b, c) / c;

        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = 0.5 * Math.sqrt((2 * Math.pow(c, 2)) + 2 * Math.pow(b, 2) - Math.pow(a, 2));
        array[1] = 0.5 * Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(a, 2) - Math.pow(b, 2));
        array[2] = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2));

        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        array[1] = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        array[2] = Math.sqrt(c * b * (a + b + c) * (c + b - a)) / (c + b);

        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(b, 2) - Math.pow(a, 2)) / (2 * c * b)));
        array[1] = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2)) / (2 * c * a)));
        array[2] = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)));

        Arrays.sort(array);
        return array;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double p = getSemiPerimeter(a, b, c);
        return Math.sqrt(((p - a) * (p - b) * (p - c)) / p); // Заглушка. При реализации - удалить
    }

    static double getCircumradius(double a, double b, double c) {
        double p = getSemiPerimeter(a, b, c);
        return a * b * c / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        return 0;
    }

    static double getSemiPerimeter(double a, double b, double c) {
        return 0.5 * (a + b + c);
    }
}