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

        System.out.println("Площадь по формуле Герона:  " + getAreaByHeron(a, b, c));
        System.out.println("Длины высот треугольника: " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("Длины медиан треугольника: " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("Длины биссектрис треугольника: " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("Значения углов треугольника в градусах: " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("Радиус вписанной в треугольник окружности: " + getInscribedCircleRadius(a, b, c));
        System.out.println("Радиус описанной вокруг треугольника окружности: " + getCircumradius(a, b, c));
        System.out.println("Площадь, найденная по синусу: " + getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        triangleCheck(a, b, c);

        double halfPerimeter = (a + b + c) / 2;

        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double doubleArea = getAreaByHeron(a, b, c) * 2;

        double[] heights = new double[3];
        heights[0] = doubleArea / a;
        heights[1] = doubleArea / b;
        heights[2] = doubleArea / c;

        Arrays.sort(heights);

        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        triangleCheck(a, b, c);

        double[] medians = new double[3];
        medians[0] = Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)) / 2;
        medians[1] = Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2)) / 2;
        medians[2] = Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(b, 2)) / 2;

        Arrays.sort(medians);

        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        triangleCheck(a, b, c);

        double perimeter = a + b + c;
        double[] bisectors = new double[3];
        bisectors[0] = Math.sqrt(b * c * perimeter * (perimeter - a * 2)) / (perimeter - a);
        bisectors[1] = Math.sqrt(a * c * perimeter * (perimeter - b * 2)) / (perimeter - b);
        bisectors[2] = Math.sqrt(a * b * perimeter * (perimeter - c * 2)) / (perimeter - c);

        Arrays.sort(bisectors);

        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        triangleCheck(a, b, c);

        double cosine1 = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double cosine2 = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        double cosine3 = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);

        double[] angles = new double[3];
        angles[0] = Math.toDegrees(Math.acos(cosine1));
        angles[1] = Math.toDegrees(Math.acos(cosine2));
        angles[2] = Math.toDegrees(Math.acos(cosine3));

        Arrays.sort(angles);

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        return (getAreaByHeron(a, b, c) * 2) / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {

        return (a * b * c) / (getAreaByHeron(a, b, c) * 4);
    }

    static double getAreaAdvanced(double a, double b, double c) {
        triangleCheck(a, b, c);

        double cosine = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double sine = Math.sqrt(1 - Math.pow(cosine, 2));

        return (a * b * sine) / 2;
    }
    static void triangleCheck(double a, double b, double c) {
        boolean isExisting = a + b > c && b + c > a && a + c > b;

        if (!isExisting || a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Треугольник не существует или является вырожденным, " +
                    "возвращаемые значения могут быть некорректны");
        }
    }
}