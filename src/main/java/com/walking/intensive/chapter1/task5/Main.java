package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

    }

    static double getAreaByHeron(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p*(p - a) * (p-b) * (p - c));
        return s;
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p*(p - a) * (p-b) * (p - c));
        double[] heights = new double[3];
        heights[0] = (2 * s) / a;
        heights[1] = (2 * s) / b;
        heights[2] = (2 * s) / c;
        return Arrays.stream(heights).sorted().toArray();
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p*(p - a) * (p-b) * (p - c));
        double[] medians = new double[3];
        medians[0] = Math.sqrt(2 * a * a + 2 * b * b - c * c ) / 2;
        medians[1] = Math.sqrt(2 * c * c + 2 * a * a - b * b ) / 2;
        medians[2] = Math.sqrt(2 * c * c + 2 * b * b - a * a ) / 2;
        return Arrays.stream(medians).sorted().toArray();
//        return null; // Заглушка. При реализации - удалить
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p*(p - a) * (p-b) * (p - c));
        double[] bisectors = new double[3];
        bisectors[0] = (Math.sqrt(a*b*(a+b+c)*(a+b-c))) / a+b;
        bisectors[1] = (Math.sqrt(a*c*(a+b+c)*(a-b+c))) / a+c;
        bisectors[2] = (Math.sqrt(b*c*(a+b+c)*(b+c-a))) / b+c;
        return Arrays.stream(bisectors).sorted().toArray();
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        //        Место для вашего кода
        double[] angles = new double[3];
        angles[0] = Math.acos((a*a + b*b - c*c) / 2 * a * b);
        angles[1] = Math.acos((c*c + a*a - b*b) / 2 * c * a);
        angles[2] = Math.acos((b*b + c*c - a*a) / 2 * b * c);
        return Arrays.stream(angles).sorted().toArray();
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        //        Место для вашего кода

        return (a*b*c)/2;
    }

    static double getCircumradius(double a, double b, double c) {
        //        Место для вашего кода
        double p = (a + b + c) / 2;
        return (a*b*c)/(4 * Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }

    static boolean isDegenerate(double a, double b, double c){
        if ((a > (b + c)) && (b > (a + c)) && (c > (a + b))) {
            System.out.println("Треугольник не должен быть вырожденным и должен существовать.");
            return false;
        } else {
            return true;
        }
    };

}