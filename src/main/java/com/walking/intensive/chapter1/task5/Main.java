package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
// пусть треугольник имеет стороны a,b,c а противолежание углы alfa,beta,gama соответственно
public class Main {
    public static void main(String[] args) {
        getThemAll(10, 10, 10);
        getThemAll(3, 4, 5);
        getThemAll(1, 1, 3);

    }

    static void getThemAll(double a, double b, double c) {
        System.out.println("Треугольник со сторонами " + a + " " + b + " " + c);
        System.out.printf("Площадь по херону %.2f%n", getAreaByHeron(a, b, c));
        Arrays.stream(getHeights(a, b, c)).peek(x -> System.out.print("высота равна: ")).forEach(x -> System.out.printf("%.2f\n ", x));
        Arrays.stream(getMedians(a, b, c)).peek(x -> System.out.print("медиана равна: ")).forEach(x -> System.out.printf("%.2f\n ", x));
        Arrays.stream(getBisectors(a, b, c)).peek(x -> System.out.print("бисектриса равна: ")).forEach(x -> System.out.printf("%.2f\n ", x));
        Arrays.stream(getAngles(a, b, c)).peek(x -> System.out.print("угол равен : ")).forEach(x -> System.out.printf(" %.2f\n ", x));
        System.out.printf("Радиус вписанной окружности %.2f%n", getInscribedCircleRadius(a, b, c));
        System.out.printf("Радиус описанной окружностис %.2f%n", getCircumradius(a, b, c));
        System.out.printf("Площадь через 2 стороны и синус угла %.2f%n", getAreaAdvanced(a, b, c));
        System.out.println("_________________________________________________________");


    }

    static boolean isExist(double a, double b, double c) {
        // Проверка на положительность сторон и на невырожденность треугольника
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            return true;
        }
        System.out.println("Треугольник со сторонами " + a + " " + b + " " + c + " не существует");
        return false;
    }


    static double getAreaByHeron(double a, double b, double c) {
        if (isExist(a, b, c)) {
            double halfperimeter = 0.5 * (a + b + c);
            double area = Math.sqrt(halfperimeter * (halfperimeter - a) * (halfperimeter - b) * (halfperimeter - c));
            return area;
        }
        return 0;
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {

        if (isExist(a, b, c)) {
            double[] angles = getNotSortedAngles(a, b, c);
            double h1 = a * Math.sin(angles[2]);
            double h2 = b * Math.sin(angles[0]);
            double h3 = c * Math.sin(angles[1]);
            double[] heights = {h1, h2, h3};
            Arrays.sort(heights);
            return heights;
        }
        return new double[3];


    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        if (isExist(a, b, c)) {
            double[] angles = getNotSortedAngles(a, b, c);
            double mer1 = Math.sqrt(a * a + 0.25 * c * c - a * c * Math.cos(angles[1]));
            double mer2 = Math.sqrt(b * b + 0.25 * a * a - a * b * Math.cos(angles[2]));
            double mer3 = Math.sqrt(c * c + 0.25 * b * b - b * c * Math.cos(angles[0]));
            double[] meridians = {mer1, mer2, mer3};
            Arrays.sort(meridians);
            return meridians;
        }

        return new double[3];
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {

        if (isExist(a, b, c)) {
            double[] angles = getNotSortedAngles(a, b, c);
            double bis1 = (a * Math.sin(angles[1])) / Math.sin(Math.PI - angles[1] - angles[2] / 2);
            double bis2 = b * Math.sin(angles[2]) / Math.sin(Math.PI - angles[2] - angles[0] / 2);
            double bis3 = c * Math.sin(angles[0]) / Math.sin(Math.PI - angles[0] - angles[1] / 2);
            double[] bisectors = {bis1, bis2, bis3};
            Arrays.sort(bisectors);
            return bisectors;
        }
        return new double[3];
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double alfa = Math.acos((-a * a + b * b + c * c) / (2 * b * c));
        double beta = Math.acos((-b * b + a * a + c * c) / (2 * a * c));
        double gama = Math.acos((-c * c + b * b + a * a) / (2 * b * a));

        double[] doubles = {alfa*180/Math.PI, beta*180/Math.PI, gama*180/Math.PI};
        Arrays.sort(doubles);
        return doubles;
    }

    // вспомогательный метод
    static double[] getNotSortedAngles(double a, double b, double c) {
        double alfa = Math.acos((-a * a + b * b + c * c) / (2 * b * c));
        double beta = Math.acos((-b * b + a * a + c * c) / (2 * a * c));
        double gama = Math.acos((-c * c + b * b + a * a) / (2 * b * a));
        return new double[]{alfa, beta, gama};
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        if (isExist(a, b, c)) {
            double halfperimeter = 0.5 * (a + b + c);

            return Math.sqrt((halfperimeter - a) * (halfperimeter - b) * (halfperimeter - c) / halfperimeter);
        }

        return 0;
    }

    static double getCircumradius(double a, double b, double c) {
        if (isExist(a, b, c)) {
            double[] angles = getNotSortedAngles(a, b, c);
            return a / (2 * Math.sin(angles[0]));
        }
        return 0;
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double area;
        if (isExist(a, b, c)) {
            double[] angles = getNotSortedAngles(a, b, c);
            area = 0.5 * a * b * Math.sin(angles[2]);
            return area;
        }
        return 0;
    }
}