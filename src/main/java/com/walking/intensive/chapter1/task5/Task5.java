package com.walking.intensive.chapter1.task5;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

        System.out.println(getAngles(12, 13, 5));
        System.out.println(getAreaByHeron(12, 13, 5));
        System.out.println(getAreaAdvanced(12, 13, 5));
    }

    static double getAreaByHeron(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double p = (a + b + c) / 2;
        double temp = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(temp);
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double square = getAreaByHeron(a, b, c);
        double heightA = (square * 2) / a;
        double heightB = (square * 2) / b;
        double heightC = (square * 2) / c;

        double[] heights = {heightA, heightB, heightC};

        return sortForTriangleSides(heights);
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double[] squareSides = {a * a, b * b, c * c};
        double[] medians = new double[squareSides.length];

        for (int i = 0; i < squareSides.length; i++) {

            double temp = squareSides[0];
            squareSides[0] = squareSides[2];
            squareSides[2] = squareSides[1];
            squareSides[1] = temp;

            double tempResult = 2 * (squareSides[1] + squareSides[2]) - squareSides[0];
            double result = Math.sqrt(tempResult) / 2;

            medians[i] = result;
        }
        return sortForTriangleSides(medians);
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {

        checkTriangleSides(a, b, c);
        double[] bisectors = new double[3];

        for (int i = 0; i < 3; i++) {

            double result = b * c * (a + b + c) * (b + c - a);
            result = Math.sqrt(result);
            result = result / (b + c);

            bisectors[i] = result;

            double temp = a;
            a = b;
            b = c;
            c = temp;
        }
        return sortForTriangleSides(bisectors);
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double aSquare = a * a;
        double bSquare = b * b;
        double cSquare = c * c;

        double cosA = (aSquare + cSquare - bSquare) / (2 * a * c);
        double cosB = (aSquare + bSquare - cSquare) / (2 * a * b);
        double cosY = (cSquare + bSquare - aSquare) / (2 * c * b);

        double angleA = Math.acos(cosA) * 180 / Math.PI; //Также можно воспользоваться методом Math.toDegrees()
        double angleB = Math.acos(cosB) * 180 / Math.PI;
        double angleC = Math.acos(cosY) * 180 / Math.PI;

        double[] results = {angleA, angleB, angleC};
        return sortForTriangleSides(results);
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double p = (a + b + c) / 2;

        double r = (p - a) * (p - b) * (p - c);
        r = Math.sqrt(r / p);
        return r;
    }

    static double getCircumRadius(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double p = (a + b + c) / 2;

        double temp = p * ((p - a) * (p - b) * (p - c));
        temp = Math.sqrt(temp) * 4;
        temp = (a * b * c) / temp;
        return temp;
    }

    static double getAreaAdvanced(double a, double b, double c) {

        checkTriangleSides(a, b, c);

        double aSquare = a * a;
        double bSquare = b * b;
        double cSquare = c * c;

        double cosB = (aSquare + bSquare - cSquare) / (2 * a * b);
        ;


        double temp = cosB * cosB;
        double sinA = Math.sqrt(1 - temp);

        return 0.5 * a * b * sinA;
    }

    static void checkTriangleSides(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException(("Стороны треугольника не могут быть меньше или равны 0"));
        }

        double p = (a + b + c) / 2;

        if (a + c == p || a + b == p || b + c == p) {
            throw new IllegalArgumentException("Треугольник не может быть вырожденным");
        }
    }

    static double[] sortForTriangleSides(double[] arr) {

        if (arr.length > 3) {
            throw new IndexOutOfBoundsException("Метод сортирует массив до 3 элементов");
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}