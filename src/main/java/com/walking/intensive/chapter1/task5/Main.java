package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 3;
        double b = 8;
        double c = 10;

        if (!isTriangleExist(a, b, c)) {
            System.out.println("Треугольник вырожденный или не существует ");
            return;
        }

        //Площадь Герона
        System.out.println("Формула площади Герона: " + getHeronArea(a, b, c));

        //Высоты треугольника
        double[] heights = getHeights(a, b, c);

        System.out.println("Высоты треугольника: " + Arrays.toString(heights));

        //Медианы треугольника
        double[] medians = getMedians(a, b, c);

        System.out.println("Медианы треугольника: " + Arrays.toString(medians));

        //Биссектрисы треугольника
        double[] bisectors = getBisectors(a, b, c);

        System.out.println("Биссектрисы треугольника:" + Arrays.toString(bisectors));

        //Углы треугольника
        double[] angles = getAngles(a, b, c);

        System.out.println("Углы треугольника: " + Arrays.toString(angles));

        //Радиус вписанной окружности
        System.out.println("Радиус вписанной окружности: " + getInscribedCircleRadius(a, b, c));

        //Радиус описанной окружности
        System.out.println("Радиус описанной окружности: " + getCircumradius(a, b, c));

        //Формула площади через синус
        System.out.println("Формула площади через cинус: " + getAreaAdvanced(a, b, c));
    }

    static double getHeronArea(double a, double b, double c) {

        if (!isTriangleExist(a, b, c)) {
            return 0;
        }
        double semiperimeter = (a + b + c) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        //        Место для вашего кода
        if (!isTriangleExist(a, b, c)) {
            return null;
        }
        double height1 = getHeronArea(a, b, c) * 2 / a;
        double height2 = getHeronArea(a, b, c) * 2 / b;
        double height3 = getHeronArea(a, b, c) * 2 / c;

        double[] heights = {height1, height2, height3};
        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        if (!isTriangleExist(a, b, c)) {
            return null;
        }

        double median1 = Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2)) / 2;
        double median2 = Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - Math.pow(b, 2)) / 2;
        double median3 = Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2)) / 2;

        double[] medians = {median1, median2, median3};
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {

        if (!isTriangleExist(a, b, c)) {
            return null;
        }

        double bisector1 = Math.sqrt((a * b * (a + b + c) * (a + b - c))) / (a + b);
        double bisector2 = Math.sqrt((a * c * (a + c + b) * (a + c - b))) / (a + c);
        double bisector3 = Math.sqrt((b * c * (b + c + a) * (b + c - a))) / (b + c);
        double[] bisectors = {bisector1, bisector2, bisector3};
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {

        if (!isTriangleExist(a, b, c)) {
            return null;
        }

        double cosineA = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double angleInRadiansA = Math.acos(cosineA);
        double angleInDegreesA = Math.toDegrees(angleInRadiansA);

        double cosineB = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
        double angleInRadiansB = Math.acos(cosineB);
        double angleInDegreesB = Math.toDegrees(angleInRadiansB);

        double cosineC = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        double angleInRadiansC = Math.acos(cosineC);
        double angleInDegreesC = Math.toDegrees(angleInRadiansC);

        double[] angles = {angleInDegreesA, angleInDegreesB, angleInDegreesC};
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        if (!isTriangleExist(a, b, c)) {
            return 0;
        }

        double semiperimeter = (a + b + c) / 2;

        return Math.sqrt((semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c) / semiperimeter);
    }

    static double getCircumradius(double a, double b, double c) {

        if (!isTriangleExist(a, b, c)) {
            return 0;
        }

        double semiperimeter = (a + b + c) / 2;

        return (a * b * c) / (4 * Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        if (!isTriangleExist(a, b, c)) {
            return 0;
        }

        double cosineA = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);

        double sinusA = Math.sqrt(1 - Math.pow(cosineA, 2));

        return b * c * sinusA / 2;
    }

    /**
     * Стороны треугольника больше 0.
     * Треугольник не вырожден и существует, если сумма длин любых двух
     * сторон треугольника больше длины третьей стороны,
     * а разность длин любых двух сторон  меньше длины третьей стороны
     */
    static boolean isTriangleExist(double a, double b, double c) {

        return ((a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a) && (Math.abs(a - b) < c && Math.abs(a - c) < b && Math.abs(b - c) < a));
    }
}

