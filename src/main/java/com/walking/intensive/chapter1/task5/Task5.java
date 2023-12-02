package com.walking.intensive.chapter1.task5;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

        System.out.println(getAreaByHeron(7, 5, 4));
        System.out.println(Arrays.toString(getHeights(7, 5, 4)));
        System.out.println(Arrays.toString((getMedians(7, 5, 4))));
        System.out.println(Arrays.toString(getBisectors(7, 5, 4)));
        System.out.println(Arrays.toString((getAngles(7, 5, 4))));
        System.out.println(getInscribedCircleRadius(7, 5, 4));

    }

    static double getAreaByHeron(double a, double b, double c) {

        double semiPerimeter = (a + b + c) / 2;

        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Треугольник вырождённый или не существует");
            return -1;
        }

        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {

        double[] heightsOfTriangle = new double[3];

        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Треугольник вырождённый или не существует");
            return null;
        }

        heightsOfTriangle[0] = (2 * getAreaByHeron(a, b, c) / a);
        heightsOfTriangle[1] = (2 * getAreaByHeron(a, b, c) / b);
        heightsOfTriangle[2] = (2 * getAreaByHeron(a, b, c) / c);

        Arrays.sort(heightsOfTriangle);

        return heightsOfTriangle;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        double[] mediansOfTriangle = new double[3];

        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Треугольник вырождённый или не существует");
            return null;
        }

        mediansOfTriangle[0] = Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2;
        mediansOfTriangle[1] = Math.sqrt(2 * c * c + 2 * b * b - a * a) / 2;
        mediansOfTriangle[2] = Math.sqrt(2 * a * a + 2 * c * c - b * b) / 2;

        Arrays.sort(mediansOfTriangle);

        return mediansOfTriangle;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {

        double semiPerimeter = (a + b + c) / 2;
        double[] bisectorsOfTriangle = new double[3];

        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Треугольник вырождённый или не существует");
            return null;
        }

        bisectorsOfTriangle[0] = (2 * Math.sqrt(a * b * semiPerimeter * (semiPerimeter - c)) / (a + b));
        bisectorsOfTriangle[1] = (2 * Math.sqrt(c * b * semiPerimeter * (semiPerimeter - a)) / (c + b));
        bisectorsOfTriangle[2] = (2 * Math.sqrt(a * c * semiPerimeter * (semiPerimeter - b)) / (a + c));

        Arrays.sort(bisectorsOfTriangle);

        return bisectorsOfTriangle;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {

        double[] anglesOfTriangle = new double[3];

        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Треугольник вырождённый или не существует");
            return null;
        }

        anglesOfTriangle[0] = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        anglesOfTriangle[1] = Math.toDegrees(Math.acos((c * c + b * b - a * a) / (2 * c * b)));
        anglesOfTriangle[2] = 180 - anglesOfTriangle[0] - anglesOfTriangle[1];

        Arrays.sort(anglesOfTriangle);

        return anglesOfTriangle;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        double semiPerimeter = (a + b + c) / 2;

        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Треугольник вырождённый или не существует");
            return -1;
        }

        return getAreaByHeron(a, b, c) / semiPerimeter;
    }

    static double getCircumradius(double a, double b, double c) {

        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Треугольник вырождённый или не существует");
            return -1;
        }

        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {

        return 0;
    }
}