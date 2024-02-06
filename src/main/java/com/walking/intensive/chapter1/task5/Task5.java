package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getHeights(-6, 4, 5)));
//        System.out.println(Arrays.toString(getMedians(12, 13, 5)));
        System.out.println(Arrays.toString(getHeights(12, 13, 5)));
//        System.out.println(Arrays.toString(getMedians(3, 4, 5)));
    }

    static double getAreaByHeron(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double p = (a + b + c) / 2;
        double temp = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(temp);
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double square = getAreaByHeron(a, b, c);
        double heightA = (square * 2) / a;
        double heightB = (square * 2) / b;
        double heightC = (square * 2) / c;

        double[] heights = {heightA, heightB, heightC};

        return sortForTriangleSides(heights);
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double[] squareSides = {a * a, b * b, c * c};
        double[] medians = new double[squareSides.length];

        for (int i = 0; i < squareSides.length; i++) {

            double temp = squareSides[0];
            squareSides[0] = squareSides[2];
            squareSides[2] = squareSides[1];
            squareSides[1] = temp;

            double tempResult = 2 * (squareSides[1] + squareSides[2]) - squareSides[0];
            double result = Math.sqrt(tempResult) / 2;

            medians[i] = result;
        }
        return sortForTriangleSides(medians);
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {

        checkTriangleSides(a, b, c);
        double[] bisectors = new double[3];

        for (int i = 0; i < 3; i++) {

            double result = b * c * (a + b + c) * (b + c - a);
            result = Math.sqrt(result);
            result = result / (b + c);

            bisectors[i] = result;

            double temp = a;
            a = b;
            b = c;
            c = temp;
        }
        return sortForTriangleSides(bisectors);
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


    static void checkTriangleSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException(("Стороны треугольника не могут быть меньше или равны 0"));
        }
    }

    static double[] sortForTriangleSides(double[] arr) {

        if (arr.length > 3) {
            throw new IndexOutOfBoundsException("Метод сортирует массив до 3 элементов");
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}