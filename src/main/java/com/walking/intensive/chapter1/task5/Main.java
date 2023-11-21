package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {

        double a = 11;
        double b = 21;
        double c = 24;

        System.out.println("1. Площадь треугольника по формуле Герона " + areaByHeron(a, b, c));
        System.out.println("2. Высоты треугольника по возрастанию " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("3. Медианы треугольника по возрастанию " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("4. Биссектрисы треугольника по возрастанию " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("5. Углы треугольника по возрастанию " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("6. Длина радиуса вписанной в треугольник окружности " + getInscribedCircleRadius(a, b, c));
        System.out.println("7. Длина радиуса описаной вокруг треугольника окружности " + getCircumradius(a, b, c));
        System.out.println("8. Нахождения cos угла С между сторонами a и b, затем преобразование его в sin с последующим расчетом площади через него " + getAreaAdvanced(a, b, c));
    }

    static double areaByHeron(double a, double b, double c) {
        double result = 0;

        if (a <= 0 || b <= 0 || c <= 0) {
            return result;
        }

        if ((a + b > c && a + c > b && b + c > a) || (Math.abs(a) - Math.abs(b) < c && Math.abs(a) - Math.abs(c) < b && Math.abs(b) - Math.abs(c) < a)) {
            double halfPerimeter = (a + b + c) / 2;
            result = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        }

        return result;
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double areaHeron = areaByHeron(a, b, c);
        double[] heightsArray = new double[3];
        heightsArray[0] = (2 * areaHeron) / a;
        heightsArray[1] = (2 * areaHeron) / b;
        heightsArray[2] = (2 * areaHeron) / c;
        Arrays.sort(heightsArray);
        return heightsArray;
    }


    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] mediansArray = new double[3];
        mediansArray[0] = (Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2))) / 2;
        mediansArray[1] = (Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(b, 2))) / 2;
        mediansArray[2] = (Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2))) / 2;
        Arrays.sort(mediansArray);
        return mediansArray;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] bisectorsArray = new double[3];
        double areaHeron = areaByHeron(a, b, c);
        bisectorsArray[0] = 2 * (Math.sqrt(b * c * areaHeron * (areaHeron - a))) / (b + c);
        bisectorsArray[1] = 2 * (Math.sqrt(a * c * areaHeron * (areaHeron - b))) / (a + c);
        bisectorsArray[2] = 2 * (Math.sqrt(a * b * areaHeron * (areaHeron - c))) / (a + b);
        Arrays.sort(bisectorsArray);
        return bisectorsArray;
    }


    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] anglesArray = new double[3];
        anglesArray[0] = Math.toDegrees(Math.acos(((Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2)) / (2 * b * c)));
        anglesArray[1] = Math.toDegrees(Math.acos(((Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(b, 2)) / (2 * a * c)));
        anglesArray[2] = Math.toDegrees(Math.acos(((Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)) / (2 * a * b)));
        Arrays.sort(anglesArray);
        return anglesArray;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double areaHeron = areaByHeron(a, b, c);
        double circleRadius = (2 * areaHeron) / (a + b + c);
        return circleRadius;
    }

    static double getCircumradius(double a, double b, double c) {
        double areaHeron = areaByHeron(a, b, c);
        double circumRadius = ((a * b * c) / (4 * areaHeron));
        return circumRadius;
    }


    static double getAreaAdvanced(double a, double b, double c) {
        double cosAngle = ((Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)) / (2 * b * c);
        double sinAngle = Math.sqrt(1 - Math.pow(cosAngle, 2));
        double result = ((a * b) / 2) * sinAngle;
        return result;
    }
}