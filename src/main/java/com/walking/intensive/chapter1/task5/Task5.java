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
        //System.out.println(getAreaByHeron(a, b, c));
        //System.out.println(Arrays.toString(getHeights(a, b, c)));
        System.out.println(Arrays.toString(getMedians(a, b, c)));
    }

    static double getAreaByHeron(double a, double b, double c) {

        double semiperimeter = (a + b + c) / 2; // полупериметр

        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {

        double semiperimeter = (a + b + c) / 2; // полупериметр
        double sqrt = Math.sqrt(semiperimeter * (semiperimeter - a)
                * (semiperimeter - b) * (semiperimeter - c));

        double heightToSideA = (2 / a) * sqrt;
        double heightToSideB = (2 / b) * sqrt;
        double heightToSideC = (2 / c) * sqrt;

        double[] heightsArray = {heightToSideA, heightToSideB, heightToSideC};
        Arrays.sort(heightsArray);

        return heightsArray;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        double medianA = (Math.sqrt((2 * Math.pow(b, 2)) + (2 * Math.pow(c, 2)) - (Math.pow(a, 2)))) / 2;
        double medianB = (Math.sqrt((2 * Math.pow(a, 2)) + (2 * Math.pow(c, 2)) - (Math.pow(b, 2)))) / 2;
        double medianC = (Math.sqrt((2 * Math.pow(b, 2)) + (2 * Math.pow(a, 2)) - (Math.pow(c, 2)))) / 2;

        double[] medianArray = {medianA, medianB, medianC};
        Arrays.sort(medianArray);

        return medianArray;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода

        return null; // Заглушка. При реализации - удалить
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