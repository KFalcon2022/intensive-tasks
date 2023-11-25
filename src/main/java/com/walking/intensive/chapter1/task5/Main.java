package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе

        double a = 12, b = 13, c = 5;
        double[] answer;

        System.out.println("Площадь Герон");
        System.out.println(getAreaByHeron(a, b, c));

        System.out.println("Высоты по возрастанию");
        answer = getHeights(a, b, c);
        for (int i = 0; i < 3; i++) {
            System.out.println(answer[i]);
        }

        System.out.println("Медианы по возрастанию");
        answer = getMedians(a, b, c);
        for (int i = 0; i < 3; i++) {
            System.out.println(answer[i]);
        }

        System.out.println("Биссектрисы по возрастанию");
        answer = getBisectors(a, b, c);
        for (int i = 0; i < 3; i++) {
            System.out.println(answer[i]);
        }

        System.out.println("Углы по возрастанию");
        answer = getAngles(a, b, c);
        for (int i = 0; i < 3; i++) {
            System.out.println(answer[i]);
        }

        System.out.println("Радиус вписанной окружности");
        System.out.println(getInscribedCircleRadius(a, b, c));

        System.out.println("Радиус описанной окружности");
        System.out.println(getCircumradius(a, b, c));
    }

    /**
     * 1
     * Формула Герона
     */
    static double getAreaByHeron(double a, double b, double c) {

        if (!isTriangleReal(a, b, c)) {
            return 0;
        }

        double p, s;
        p = (a + b + c) / 2; //полупериметр
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return s;
    }

    /**
     * проверка: существует ли треугольник
     */
    static boolean isTriangleReal(double a, double b, double c) {

        if (a <= 0 | b <= 0 | c <= 0) {
            return false;
        }

        if ((b + c) < a | (a + c) < b | (a + b) < c) {
            return false;
        }

        return true;

    }


    /**
     * 2
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {

        double s = getAreaByHeron(a, b, c);

        if (s == 0) {
            return null;
        }

        double[] answer = new double[3];

        answer[0] = getOneHeight(s, a);
        answer[1] = getOneHeight(s, b);
        answer[2] = getOneHeight(s, c);

        Arrays.sort(answer);
        return answer;
    }

    static double getOneHeight(double s, double side) {
        if (side == 0) {
            return 0;
        }
        return 2 * s / side;
    }

    /**
     * 3
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {

        if (!isTriangleReal(a, b, c)) {
            return null;
        }

        double[] answer = new double[3];

        answer[0] = getOneMedian(a, b, c);
        answer[1] = getOneMedian(b, a, c);
        answer[2] = getOneMedian(c, a, b);

        Arrays.sort(answer);
        return answer;
    }

    static double getOneMedian(double mainSide, double b, double c) {
        return Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(mainSide, 2)) / 2;
    }

    /**
     * 4
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода

        if (!isTriangleReal(a, b, c)) {
            return null;
        }

        double[] answer = new double[3];

        answer[0] = getOneBisector(a, b, c);
        answer[1] = getOneBisector(b, a, c);
        answer[2] = getOneBisector(c, a, b);

        Arrays.sort(answer);
        return answer;
    }

    static double getOneBisector(double mainSideA, double sideB, double sideC) {
        double sideSum = sideB + sideC;
        return Math.sqrt(sideB * sideC * (sideSum + mainSideA) * (sideSum - mainSideA)) / sideSum;
    }

    /**
     * 5
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {

        if (!isTriangleReal(a, b, c)) {
            return null;
        }

        double[] answer = new double[3];

        answer[0] = getOneangle(a, b, c); //угол между сторонами b c
        answer[1] = getOneangle(c, b, a); //угол между сторонами a b
        answer[2] = getOneangle(b, a, c); //угол между сторонами а c
        Arrays.sort(answer);

        return answer;
    }

    static double getOneangle(double mainSideA, double sideB, double sideC) {
        double cosAngle = (Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(mainSideA, 2)) / (2 * sideB * sideC);
        return Math.toDegrees(Math.acos(cosAngle));
    }

    /**
     * 6
     * возвращает длину радиуса вписанной в треугольник окружности.
     */
    static double getInscribedCircleRadius(double a, double b, double c) {

        if ((a + b + c) == 0) {
            return 0;
        }

        double s, r; //площадь, радиус
        s = getAreaByHeron(a, b, c);

        r = 2 * s / (a + b + c);

        return r;
    }

    /**
     * 7
     * возвращает длину радиуса описанной вокруг треугольника окружности.
     */
    static double getCircumradius(double a, double b, double c) {

        double s = 0, r = 0; //площадь, радиус
        s = getAreaByHeron(a, b, c);

        if (s != 0) {
            r = a * b * c / (4 * s);
        }
        return r;
    }

    /**
     * 8
     * Площадь треугольника
     */
    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }
}