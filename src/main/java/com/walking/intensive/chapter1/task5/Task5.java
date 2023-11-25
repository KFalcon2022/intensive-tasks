package com.walking.intensive.chapter1.task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Длина стороны a = ");
        double a = in.nextDouble();
        System.out.print("Длина стороны b = ");
        double b = in.nextDouble();
        System.out.print("Длина стороны c = ");
        double c = in.nextDouble();

        if (isDegenerateTriangle(a, b, c)) {
            System.out.println("Треугольник вырожденный. Введите другие значения длин сторон.");
        }

        System.out.println("Площадь по формуле Герона: " + getAreaByHeron(a, b, c));
        System.out.println("Площадь через синус угла: " + getAreaAdvanced(a, b, c));
        System.out.println("Биссектрисы: " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("Медианы: " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("Высоты: " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("Углы: " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("Радиус вписанной окружности: " + getInscribedCircleRadius(a, b, c));
        System.out.println("Радиус описанной окружности: " + getCircumradius(a, b, c));
        in.close();
    }

    static boolean isDegenerateTriangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
            return true;
        }
        return false;
    }

    static double getAreaByHeron(double a, double b, double c) {
        double halfPerimeter = getHalfPerimeter(a, b, c);
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        return area;
    }

    static double getHalfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double areaByHeron = getAreaByHeron(a, b, c);
        double[] heights = new double[3];
        heights[0] = areaByHeron * 2 / a;
        heights[1] = areaByHeron * 2 / b;
        heights[2] = areaByHeron * 2 / c;
        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] medians = new double[3];
        medians[0] = Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2)) / 2;
        medians[1] = Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - Math.pow(b, 2)) / 2;
        medians[2] = Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2)) / 2;
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double halfPerimeter = getHalfPerimeter(a, b, c);
        double[] bisectors = new double[3];
        bisectors[0] = 2 * Math.sqrt(c * b * halfPerimeter * (halfPerimeter - a)) / (b + c);
        bisectors[1] = 2 * Math.sqrt(a * c * halfPerimeter * (halfPerimeter - b)) / (a + c);
        bisectors[2] = 2 * Math.sqrt(a * b * halfPerimeter * (halfPerimeter - c)) / (b + a);

        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] angles = new double[3];
        angles[0] = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b)) * 180 / Math.PI;
        angles[1] = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)) * 180 / Math.PI;
        angles[2] = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)) * 180 / Math.PI;
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double halfPerimeter = getHalfPerimeter(a, b, c);
        return Math.sqrt((halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c) / halfPerimeter);
    }

    static double getCircumradius(double a, double b, double c) {
        double areaByHeron = getAreaByHeron(a, b, c);
        return a * b * c / (4 * areaByHeron);
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //S = 0,5 * b * c * sin(α) , где b, c — стороны, α — угол между ними.
        double cosA = ((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
        double sinA = Math.sqrt(1 - Math.pow(cosA, 2));

        return 0.5 * b * c * sinA;
    }
}