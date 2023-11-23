package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
//Как известно, в невырожденном треугольнике сумма длин двух его сторон должна быть больше длины третьей стороны
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        System.out.println(Arrays.toString(getHeights(4, 12, 8)));
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (a * b > c && a * c > b && c * b > a) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return 0;
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        if (a * b > c && a * c > b && c * b > a) {

            double p = (a + b + c) / 2;
            double ha = (2 * Math.sqrt(p * (p - a) * (p - b) * (p - c))) / a;
            double hb = (2 * Math.sqrt(p * (p - a) * (p - b) * (p - c))) / b;
            double hc = (2 * Math.sqrt(p * (p - a) * (p - b) * (p - c))) / c;
            double[] heights = {ha, hb, hc};
            Arrays.sort(heights);

            return heights;
        }
        return null;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        if (a * b > c && a * c > b && c * b > a) {

            double ma = Math.sqrt((2 * (b * b + c * c) - a * a) / 2);
            double mb = Math.sqrt((2 * (c * c + a * a) - b * b) / 2);
            double mc = Math.sqrt((2 * (b * b + a * a) - c * c) / 2);
            double[] medians = {ma, mb, mc};
            Arrays.sort(medians);

            return medians;
        }
        return null;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        if (a * b > c && a * c > b && c * b > a) {
            double La = Math.sqrt(a * b * (a + b + c) * (c + b - a)) / a + c;
            double Lb = Math.sqrt(a * b * (a + b + c) * (c + a - b)) / a + c;
            double Lc = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / a + c;
            double[] bisectors = {La, Lb, Lc};
            Arrays.sort(bisectors);
            return bisectors;
        }
        return null;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        if (a * b > c && a * c > b && c * b > a) {
            double cosA = (b * b + c * c - a * a) / (2 * b * c);
            double cosB = (a * a + c * c - b * b) / (2 * a * c);
            double cosC = (a * a + b * b - c * c) / (2 * a * b);

            double angleA = Math.acos(cosA) * 180 / Math.PI;
            double angleB = Math.acos(cosB) * 180 / Math.PI;
            double angleC = Math.acos(cosC) * 180 / Math.PI;
            double[] angles = {angleA, angleB, angleC};
            Arrays.sort(angles);
            return angles;
        }
        return null;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (a * b > c && a * c > b && c * b > a) {
            double p = a + b + c / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            double rm = s / p;
            return rm;
        }
        return 0;
    }

    static double getCircumradius(double a, double b, double c) {
        if (a * b > c && a * c > b && c * b > a) {
            double p = a + b + c / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            double rb = a * b * c / (4 * s);
            return rb;
        }
        return 0;
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }
}