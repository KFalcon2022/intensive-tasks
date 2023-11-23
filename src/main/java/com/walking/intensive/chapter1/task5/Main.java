package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 2;
        double b = 5;
        double c = 5;
        if (a + b >= c && a + c >= b && b + c >= a && a * b * c != 0){
        System.out.println("Площадь треугольника: " + getAreaByHeron(a, b, c));
        System.out.println("Высоты треугольника: " + Arrays.toString(getHeights(a, b, c)));
        System.out.println("Медианы треугольника: " + Arrays.toString(getMedians(a, b, c)));
        System.out.println("Биссектрисы треугольника: " + Arrays.toString(getBisectors(a, b, c)));
        System.out.println("Углы треугольника: " + Arrays.toString(getAngles(a, b, c)));
        System.out.println("Длина радиуса вписанной в треугольник окружности: " + getInscribedCircleRadius(a, b, c));
        System.out.println("Длина радиуса описанной в треугольник окружности: " + getCircumradius(a, b, c));
        System.out.println("Площадь треугольника через синус: " + getAreaAdvanced(a, b, c));
        } else {
            System.out.println("Такого треугольника нет");
        }
    }


    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    static double[] getHeights(double a, double b, double c) {
        double hA = (2/a) * getAreaByHeron(a, b, c);
        double hB = (2/b) * getAreaByHeron(a, b, c);
        double hC = (2/c) * getAreaByHeron(a, b, c);

        return getMinAvgMaxValue(hA, hB, hC);
    }

    static double[] getMedians(double a, double b, double c) {
        double mA = 0.5 * Math.sqrt(2 * (b * b) + 2 * (c * c)  - a * a);
        double mB = 0.5 * Math.sqrt(2 * (a * a) + 2 * (c * c)  - b * b);
        double mC = 0.5 * Math.sqrt(2 * (a * a) + 2 * (b * b)  - c * c);

        return getMinAvgMaxValue(mA, mB, mC);
    }

    static double[] getBisectors(double a, double b, double c) {
        double lA = Math.sqrt((b * c) * (b + c + a) * (b + c - a)) / (b + c);
        double lB = Math.sqrt((a * c) * (a + c + b) * (a + c - b)) / (a + c);
        double lC = Math.sqrt((a * b) * (a + b + c) * (a + b - c)) / (a + b);

        return getMinAvgMaxValue(lA, lB, lC);
    }

    static double[] getAngles(double a, double b, double c) {
        double cosA = Math.cos((a * a + c * c - b * b) / (2 * a * c));
        double cosB = Math.cos((a * a + b * b - c * c) / (2 * a * b));
        double cosY = Math.cos((b * b + c * c - a * a) / (2 * b * c));

        return getMinAvgMaxValue(Math.toDegrees(cosA), Math.toDegrees(cosB), Math.toDegrees(cosY));
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        return (2 * getAreaByHeron(a, b, c)) / (a + b + c);

    }

    static double getCircumradius(double a, double b, double c) {
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));

    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosA = (b * b + c * c - a * a) / (2 * b * c);
        double sinA = Math.sqrt(1 - cosA * cosA);
        return 0.5 * c * b * sinA;

    }
    static double[] getMinAvgMaxValue(double valueA, double valueB, double valueC){
        double minValue = Math.min(valueA, valueB);
        if (minValue > valueC){
            minValue = valueC;
        }
        double maxValue = Math.max(valueA, valueB);
        if (maxValue < valueC){
            maxValue = valueC;
        }
        double avgValue = (valueA + valueB + valueC) - (minValue + maxValue);
        return new double[]{minValue, avgValue, maxValue};
    }
}