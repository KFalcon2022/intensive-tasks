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
        System.out.println(getAreaByHeron(a, b, c));
        System.out.println(Arrays.toString(getHeights(a, b, c)));
        System.out.println(Arrays.toString(getMedians(a, b, c)));
        System.out.println(Arrays.toString(getBisectors(a, b, c)));
        System.out.println(Arrays.toString(getAngles(a, b, c)));
        System.out.println(getInscribedCircleRadius(a, b, c));
        System.out.println(getCircumradius(a, b, c));
        System.out.println(getAreaAdvanced(a, b, c));
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

        double[] heightsArray = {(2 / a) * sqrt, (2 / b) * sqrt, (2 / c) * sqrt};
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
        double[] bisectorArray ={ (Math.sqrt(c * b * (a + b + c) * (c + b - a))) / (c + b),
                (Math.sqrt(a * c * (a + b + c) * (a + c - b))) / (a + c),
                (Math.sqrt(a * b * (a + b + c) * (a + b - c))) / (a + b) };

        Arrays.sort(bisectorArray);
        return bisectorArray;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {

        double[] degreeArray = { Math.toDegrees(Math.acos(((a * a) + (b * b) - (c * c)) / (2 * a * b))),
                Math.toDegrees(Math.acos(((a * a) + (c * c) - (b * b)) / (2 * a * c))),
                Math.toDegrees(Math.acos(((c * c) + (b * b) - (a * a)) / (2 * b * c))) };

        Arrays.sort(degreeArray);
        return degreeArray;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        return (getAreaByHeron(a, b, c)) / ((a + b + c) / 2);
    }

    static double getCircumradius(double a, double b, double c) {

        return a * b * c / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        // a^2 = b^2 + c^2 - 2*b*c*cos a - теорема косинусов
        // sin^2 a + cos^2 b = 1 - основное тождество
        // S = 1/2 * a * c * sin a - площадь треуголника
        double preliminaryCosA = ((a * a) - (b * b) - (c * c)) / (2 * b *c);
        double preliminarySinA = Math.sqrt(1 - (Math.pow(preliminaryCosA, 2)));

        return 0.5 * b * c * preliminarySinA;
    }
}