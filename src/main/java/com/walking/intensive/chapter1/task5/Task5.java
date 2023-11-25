package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        System.out.println("getAreaByHeron: " + getAreaByHeron(a, b, c));

        double[] H = getHeights(a, b, c);
        System.out.println("getHeights: " + H[0] + ' ' + H[1] + ' ' + H[2]);

        double[] M = getMedians(a, b, c);
        System.out.println("getMedians: " + M[0] + ' ' + M[1] + ' ' + M[2]);

        double[] B = getBisectors(a, b, c);
        System.out.println("getBisectors: " + B[0] + ' ' + B[1] + ' ' + B[2]);

        double[] A = getAngles(a, b, c);
        System.out.println("getAngles: " + A[0] + ' ' + A[1] + ' ' + A[2]);

        System.out.println("getInscribedCircleRadius: " + getInscribedCircleRadius(a, b, c));

        System.out.println("getCircumradius: " + getCircumradius(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = getSemiPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double[] H = new double[3];
        H[0] = 2 * getAreaByHeron(a, b, c) / a;
        H[1] = 2 * getAreaByHeron(a, b, c) / b;
        H[2] = 2 * getAreaByHeron(a, b, c) / c;

        Arrays.sort(H);
        return H;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] M = new double[3];
        M[0] = 0.5 * Math.sqrt(2.0 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2));
        M[1] = 0.5 * Math.sqrt(2.0 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - Math.pow(b, 2));
        M[2] = 0.5 * Math.sqrt(2.0 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2));

        Arrays.sort(M);
        return M;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] B = new double[3];
        B[0] = Math.sqrt(b * c * (b + c + a) * (b + c - a)) / (b + c);
        B[1] = Math.sqrt(a * c * (a + c + b) * (a + c - b)) / (a + c);
        B[2] = Math.sqrt(a * b * (a + b + c) * (a + b - c)) / (a + b);

        Arrays.sort(B);
        return B;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] A = new double[3];
        A[0] = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2.0 * a * c)));
        A[1] = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2.0 * a * b)));
        A[2] = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2.0 * c * b)));

        Arrays.sort(A);
        return A;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double p = getSemiPerimeter(a, b, c);
        return getAreaByHeron(a, b, c) / p;
    }

    static double getCircumradius(double a, double b, double c) {
        double p = getSemiPerimeter(a, b, c);
        return (a * b * c) / (4.0 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }

    static double getSemiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2.0;
    }
}