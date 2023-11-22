package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {

        double a = 12;
        double b = 13;
        double c = 5;

        System.out.println("1. Площадь треугольника по формуле Герона " + areaByHeron(a, b, c));
        System.out.println("2. Высоты треугольника по возрастанию " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("3. Медианы треугольника по возрастанию " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("4. Биссектрисы треугольника по возрастанию " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("5. Углы треугольника по возрастанию " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("6. Длина радиуса вписанной в треугольник окружности " + getInscribedCircleRadius(a, b, c));
        System.out.println("7. Длина радиуса описаной вокруг треугольника окружности " + getCircumradius(a, b, c));
        System.out.println("8. Нахождения cos углов A, B, С  с последующим преобразование их в sin и расчетом площади через эти углы" + Arrays.toString(getAreaAdvanced(a, b, c)));
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
        double halfPerimeter = (a + b + c) / 2;

        bisectorsArray[0] = 2 * Math.sqrt(b * c * (halfPerimeter - a) / (b + c));
        bisectorsArray[1] = 2 * Math.sqrt(a * c * (halfPerimeter - b) / (a + c));
        bisectorsArray[2] = 2 * Math.sqrt(a * b * (halfPerimeter - c) / (a + b));

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
        double inscribedRadius = 0;

        if (a + b > c && a + c > b && b + c > a) {
            inscribedRadius = (2 * areaHeron) / (a + b + c);
        }
        return inscribedRadius;
    }

    static double getCircumradius(double a, double b, double c) {

        double areaHeron = areaByHeron(a, b, c);
        double circumRadius = 0;

        if (a + b > c && a + c > b && b + c > a) {
            circumRadius = (a * b * c) / (4 * areaHeron);
        }
        return circumRadius;
    }


    static double[] getAreaAdvanced(double a, double b, double c) {

        double cosAngleA = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
        double sinAngleA = Math.sqrt(1 - Math.pow(cosAngleA, 2));

        double cosAngleB = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
        double sinAngleB = Math.sqrt(1 - Math.pow(cosAngleB, 2));

        double cosAngleC = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double sinAngleC = Math.sqrt(1 - Math.pow(cosAngleC, 2));

        double[] areaAdvancedArray = new double[3];
        areaAdvancedArray[0] = ((b * c) / 2) * sinAngleA;
        areaAdvancedArray[1] = ((a * c) / 2) * sinAngleB;
        areaAdvancedArray[2] = ((a * b) / 2) * sinAngleC;

        return areaAdvancedArray;
    }
}