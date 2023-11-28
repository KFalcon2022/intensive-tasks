package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

    }

    static double getAreaByHeron(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Заглушка. При реализации - удалить
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        //        Место для вашего кода
        double[] result = {2 * getAreaByHeron(a, b, c) / a, 2 * getAreaByHeron(a, b, c) / b, 2 * getAreaByHeron(a, b, c) / c};
        Arrays.sort(result);
        return result; // Заглушка. При реализации - удалить
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        //        Место для вашего кода
        double[] result = {Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(b, 2) - Math.pow(a, 2)) / 2,
                Math.sqrt(2 * Math.pow(c, 2) + 2 * Math.pow(a, 2) - Math.pow(b, 2)) / 2,
                Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2)) / 2};
        Arrays.sort(result);
        return result;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода
        double[] result = {Math.sqrt(a * c * (a + c + b) * (a + c - b)) / (a + c),
                Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b),
                Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c)};
        Arrays.sort(result);
        return result;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        //        Место для вашего кода
        double[] result = {Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b))),
                Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c))),
                Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)))};
        Arrays.sort(result);
        return result;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;
        return Math.sqrt((p - a) * (p - b) * (p - c) / p); // Заглушка. При реализации - удалить
    }

    static double getCircumradius(double a, double b, double c) {
        //        Место для вашего кода


        return (a * b * c) / (4 * getAreaByHeron(a, b, c)); // Заглушка. При реализации - удалить
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода
        double cos = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double sin = Math.sqrt(1 - Math.pow(cos, 2));

        return (a * b * c) / (2 * c / sin); // Заглушка. При реализации - удалить
    }
}