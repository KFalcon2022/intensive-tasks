package com.walking.intensive.chapter1.task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите сторону b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите сторону c: ");
        double c = scanner.nextDouble();
        scanner.close();

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Попробуйте еще раз");
        } else {
            System.out.println("Площадь треугольника: " + getAreaByHeron(a, b, c));
            System.out.println("Высоты треугольника: " + Arrays.toString(getHeights(a, b, c)));
            System.out.println("Медианы треугольника: " + Arrays.toString(getMedians(a, b, c)));
            System.out.println("Биссектрисы треугольника: " + Arrays.toString(getBisectors(a, b, c)));
            System.out.println("Углы треугольника: " + Arrays.toString(getAngles(a, b, c)));
            System.out.println("Длина радиуса вписанной в треугольник окружности: " + getInscribedCircleRadius(a, b, c));
            System.out.println("Длина радиуса описанной вокруг треугольника окружности: " + getCircumradius(a, b, c));
            System.out.println("Площадь треугольника: " + getAreaAdvanced(a, b, c));
        }
    }
    static double getAreaByHeron(double a, double b, double c) {
        double p = 0.5 * (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double[] heights = {
                (getAreaByHeron(a, b, c) * 2) / a,
                (getAreaByHeron(a, b, c) * 2) / b,
                (getAreaByHeron(a, b, c) * 2) / c
        };
        Arrays.sort(heights);
        return heights; // Заглушка. При реализации - удалить
    }
    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] medians = {
                0.5 * Math.sqrt((2 * b * b) + (2 * c * c) - (a * a)),
                0.5 * Math.sqrt((2 * a * a) + (2 * c * c) - (b * b)),
                0.5 * Math.sqrt((2 * a * a) + (2 * b * b) - (c * c))
        };
        Arrays.sort(medians);
        return medians;
    }
    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] bisectors = {
                Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c),
                Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c),
                Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b)
        };
        Arrays.sort(bisectors);
        return bisectors;
    }
    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] angles = {
                180 / Math.PI * Math.acos((a * a + c * c - b * b) / (2 * a * c)),
                180 / Math.PI * Math.acos((a * a + b * b - c * c) / (2 * a * b)),
                180 / Math.PI * Math.acos((b * b + c * c - a * a) / (2 * c * b)),
        };
        Arrays.sort(angles);
        return angles;
    }
    static double getInscribedCircleRadius(double a, double b, double c) {
        return (2 * getAreaByHeron(a, b, c)) / (a + b + c);
    }
    static double getCircumradius(double a, double b, double c) {
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }
    static double getAreaAdvanced(double a, double b, double c) {
        double cos = (b * b + c * c - a * a) / (2 * c * b);
        double sin = Math.sqrt(1 - cos * cos);
        return 0.5 * b * c * sin;
    }
}