package com.walking.intensive.chapter1.task5;


import java.util.Arrays;


/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {


    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double s = getAreaByHeron(a, b, c);
        double[] array = new double[]{s * 2 / a, s * 2 / b, s * 2 / c};
        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        double[] array = new double[3];
        array[0] = 1 / 2 * Math.sqrt(2 * a * a + 2 * b * b - c * c);
        array[1] = 1 / 2 * Math.sqrt(2 * a * a + 2 * c * c - b * b);
        array[2] = 1 / 2 * Math.sqrt(2 * c * c + 2 * b * b - a * a);
        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] array = new double[3];
        array[0] = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);
        array[1] = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        array[2] = Math.sqrt(c * b * (a + b + c) * (c + b - a)) / (c + b);
        Arrays.sort(array);
        return array;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        //        Место для вашего кода

        return null; // Заглушка. При реализации - удалить
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