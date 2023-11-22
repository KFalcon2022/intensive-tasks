package com.walking.intensive.chapter1.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длинну a: ");
        double a = sc.nextDouble();

        System.out.println("Введите длинну b: ");
        double b = sc.nextDouble();

        System.out.println("Введите длинну c: ");
        double c = sc.nextDouble();

        if (a + b < c || b + c < a) {
            System.out.println("Треугольник вырожденный.");
            return;
        }

        sc.close();

        System.out.println("Площадь: " + getAreaByHeron(a, b, c));
        System.out.println();

        System.out.println("Высота 1: " + getHeights(a, b, c)[0]);
        System.out.println("Высота 2: " + getHeights(a, b, c)[1]);
        System.out.println("Высота 3: " + getHeights(a, b, c)[2]);
        System.out.println();

        System.out.println("Медиана 1: " + getMedians(a, b, c)[0]);
        System.out.println("Медиана 2: " + getMedians(a, b, c)[1]);
        System.out.println("Медиана 3: " + getMedians(a, b, c)[2]);
        System.out.println();

        System.out.println("Биссектриса 1: " + getBisectors(a, b, c)[0]);
        System.out.println("Биссектриса 2: " + getBisectors(a, b, c)[1]);
        System.out.println("Биссектриса 3: " + getBisectors(a, b, c)[2]);
        System.out.println();

        System.out.println("Угол 1: " + getAngles(a, b, c)[0]);
        System.out.println("Угол 2: " + getAngles(a, b, c)[1]);
        System.out.println("Угол 3: " + getAngles(a, b, c)[2]);
        System.out.println();

        System.out.println("Радиус вписанной окружности: " + getInscribedCircleRadius(a, b, c));
        System.out.println();

        System.out.println("Радиус описанной окружности: " + getCircumradius(a, b, c));
        System.out.println();

        System.out.println("Площадь через синус: " + getAreaAdvanced(a, b, c));
        System.out.println();
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (isWrong(a, b, c)) {
            return 0.0;
        }

        double semiPerimeter = (a + b + c) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        return area;
    }

    static double[] getHeights(double a, double b, double c) {
        if (isWrong(a, b, c)) {
            return null;
        }

        double area = getAreaByHeron(a, b, c);
        double heightA = 2 / a * area;
        double heightB = 2 / b * area;
        double heightC = 2 / c * area;

        double[] heights = {heightA, heightB, heightC};
        Arrays.sort(heights);

        return heights;
    }

    static double[] getMedians(double a, double b, double c) {
        if (isWrong(a, b, c)) {
            return null;
        }

        double medianA = Math.sqrt(2 * b * b + 2 * c * c - a * a) / 2;
        double medianB = Math.sqrt(2 * a * a + 2 * c * c - b * b) / 2;
        double medianC = Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2;

        double[] medians = {medianA, medianB, medianC};
        Arrays.sort(medians);

        return medians;
    }

    static double[] getBisectors(double a, double b, double c) {
        if (isWrong(a, b, c)) {
            return null;
        }

        double semiPerimeter = (a + b + c) / 2;
        double bisectorA = 2 * Math.sqrt(b * c * semiPerimeter * (semiPerimeter - a)) / (b + c);
        double bisectorB = 2 * Math.sqrt(a * c * semiPerimeter * (semiPerimeter - b)) / (a + c);
        double bisectorC = 2 * Math.sqrt(a * b * semiPerimeter * (semiPerimeter - c)) / (a + b);

        double[] bisectors = {bisectorA, bisectorB, bisectorC};
        Arrays.sort(bisectors);

        return bisectors;
    }

    static double[] getAngles(double a, double b, double c) {
        if (isWrong(a, b, c)) {
            return null;
        }

        double angleA = (Math.acos((b * b + c * c - a * a) / (2 * b * c))) * 180 / Math.PI;
        double angleB = (Math.acos((a * a + c * c - b * b) / (2 * a * c))) * 180 / Math.PI;
        double angleC = (Math.acos((a * a + b * b - c * c) / (2 * a * b))) * 180 / Math.PI;

        double[] angles = {angleA, angleB, angleC};
        Arrays.sort(angles);

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (isWrong(a, b, c)) {
            return 0.0;
        }

        double semiPerimeter = (a + b + c) / 2;

        double radius = getAreaByHeron(a, b, c) / semiPerimeter;

        return radius;
    }

    static double getCircumradius(double a, double b, double c) {
        if (isWrong(a, b, c)) {
            return 0.0;
        }

        double semiPerimeter = (a + b + c) / 2;

        double radius = (a * b * c) / (4 * Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c)));

        return radius;
    }

    static double getAreaAdvanced(double a, double b, double c) {
        if (isWrong(a, b, c)) {
            return 0.0;
        }

        double cosinusA = (a * a + c * c - b * b) / (2 * a * c);
        double sinusA = Math.sqrt(1 - cosinusA * cosinusA);

        double area = (a * c * sinusA) / 2;

        return area;
    }

    static boolean isWrong(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ни одна из сторон не может быть равной 0 или быть отрицательной.");
            return true;
        }

        return false;
    }
}
