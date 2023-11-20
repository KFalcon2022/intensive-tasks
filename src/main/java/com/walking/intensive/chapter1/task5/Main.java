package com.walking.intensive.chapter1.task5;

import java.sql.Array;
import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 11;
        double b = 21;
        double c = 24;

        System.out.println("1. Площадь треугольника по формуле Герона " + getAreaByHeron(a, b, c));
        System.out.println("2. Высоты треугольника по возрастанию " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("3. Медианы треугольника по возрастанию " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("4. Биссектрисы треугольника по возрастанию " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("5. Углы треугольника по возрастанию " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("6. Длина радиуса вписанной в треугольник окружности " + getInscribedCircleRadius(a, b, c));
        System.out.println("7. Длина радиуса описаной вокруг треугольника окружности " + getCircumradius(a, b, c));
        System.out.println("8. Нахождения cos угла С между сторонами a и b, затем преобразование его в sin с последующим расчетом площади через него " + getAreaAdvanced(a, b, c));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double result = 0;

        if (a <= 0 || b <= 0 || c <= 0) {
            return result;
        }

        if ((a + b > c && a + c > b && b + c > a) || (Math.abs(a) - Math.abs(b) < c && Math.abs(a) - Math.abs(c) < b && Math.abs(b) - Math.abs(c) < a)) {
            double halfPerimeter = (a + b + c) / 2;
            result = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
            result = Math.round(result * 1000.0) / 1000.0;
        }

        return result;
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double[] heightsArray = new double[3];
        heightsArray[0] = Math.round((2 * getAreaByHeron(a, b, c)) / a * 1000.0) / 1000.0;
        heightsArray[1] = Math.round((2 * getAreaByHeron(a, b, c)) / b * 1000.0) / 1000.0;
        heightsArray[2] = Math.round((2 * getAreaByHeron(a, b, c)) / c * 1000.0) / 1000.0;
        Arrays.sort(heightsArray);
        return heightsArray;
    }


    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] mediansArray = new double[3];
        mediansArray[0] = Math.round((Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2))) / 2 * 1000.0) / 1000.0;
        mediansArray[1] = Math.round((Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(b, 2))) / 2 * 1000.0) / 1000.0;
        mediansArray[2] = Math.round((Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2))) / 2 * 1000.0) / 1000.0;
        Arrays.sort(mediansArray);
        return mediansArray;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] bisectorsArray = new double[3];
        bisectorsArray[0] = Math.round(2 * (Math.sqrt(b * c * getAreaByHeron(a, b, c) * (getAreaByHeron(a, b, c) - a))) / (b + c) * 1000.0) / 1000.0;
        bisectorsArray[1] = Math.round(2 * (Math.sqrt(a * c * getAreaByHeron(a, b, c) * (getAreaByHeron(a, b, c) - b))) / (a + c) * 1000.0) / 1000.0;
        bisectorsArray[2] = Math.round(2 * (Math.sqrt(a * b * getAreaByHeron(a, b, c) * (getAreaByHeron(a, b, c) - c))) / (a + b) * 1000.0) / 1000.0;
        Arrays.sort(bisectorsArray);
        return bisectorsArray;
    }


    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] anglesArray = new double[3];
        anglesArray[0] = Math.round(Math.toDegrees(Math.acos(((Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2)) / (2 * b * c))) * 1000.0) / 1000.0;
        anglesArray[1] = Math.round(Math.toDegrees(Math.acos(((Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(b, 2)) / (2 * a * c))) * 1000.0) / 1000.0;
        anglesArray[2] = Math.round(Math.toDegrees(Math.acos(((Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)) / (2 * a * b))) * 1000.0) / 1000.0;
        Arrays.sort(anglesArray);
        return anglesArray;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double circleRadius = Math.round(((2 * getAreaByHeron(a, b, c)) / (a + b + c)) * 1000.0) / 1000.0;
        return circleRadius;
    }

    static double getCircumradius(double a, double b, double c) {
        double сircumRadius = Math.round(((a * b * c) / (4 * getAreaByHeron(a, b, c))) * 1000.0) / 1000.0;
        return сircumRadius;
    }


    static double getAreaAdvanced(double a, double b, double c) {
        double cosAngle = Math.round(((Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)) / (2 * b * c) * 1000.0) / 1000.0;
        double sinAngle = Math.sqrt(1 - Math.pow(cosAngle, 2));
        double result = Math.round(((a * b) / 2) * sinAngle * 1000.0) / 1000.0;
        return result;
    }
}