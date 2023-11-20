package com.walking.intensive.chapter1.task5;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    private static double invEps;
    private static double areaByHeron;

    public static void main(String[] args) {
        double eps = 0.001;     //эпсилон окрестности
        invEps = 1 / eps;
        double a = 3;
        double b = 4;
        double c = 5;

        areaByHeron = getAreaByHeron(a, b, c);
        System.out.println("Площадь треугольника формулой Герона = " + areaByHeron);

        double[] height = getHeights(a, b, c, (Double[] element) -> {
            return (2 * areaByHeron) / element[0];
        });
        print("Высоты", height);

        double[] median = getParams(a, b, c, (Double[] var) -> {
            return 0.5 * Math.sqrt(2 * Math.pow(var[1], 2) + 2 * Math.pow(var[2], 2) - Math.pow(var[0], 2));
        });
        print("Медианы", median);

        //длина биссектрисы через три стороны
        double[] bisector = getParams(a, b, c, (Double[] var) -> {
            return Math.sqrt(var[0] * var[1] * (var[0] + var[1] + var[2]) * (var[0] + var[1] - var[2])) / (var[0] + var[1]);
        });
        print("Биссектрисы", bisector);

        double[] angle = getParams(a, b, c, (Double[] var) -> {
                    return Math.toDegrees(Math.acos((Math.pow(var[0], 2) + Math.pow(var[1], 2) - Math.pow(var[2], 2)) / 2 / var[0] / var[1]));
                }
        );
        print("Углы", angle);

        double innerCircleRadius = getInscribedCircleRadius(a, b, c);
        System.out.println("Вписанный радиус = " + innerCircleRadius);

        double outerCircleRadius = getCircumradius(a, b, c);
        System.out.println("Описанный вокруг треугольника радиус = " + outerCircleRadius);

        double areaBySin = getAreaAdvanced(a, b, c);
        System.out.println("Площадь треугольника через синус угла = " + /*(float)*/ areaBySin);
    }

    static void print(String keyword, double[] array) {
        System.out.println(keyword + " в порядке возрастания:");
        Arrays.stream(array).forEach((d) -> System.out.println(Math.rint(invEps * d) / invEps));
    }

    static double getAreaByHeron(double a, double b, double c) {
        double hp = 0.5 * (a + b + c);
        return Math.sqrt(hp * (hp - a) * (hp - b) * (hp - c));
    }

    /**
     * Располагает высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c, Computable<Double> comp) {
        return Arrays.stream(new double[]{
                comp.compute(a),
                comp.compute(b),
                comp.compute(c)
        }).sorted().toArray();
    }

    /**
     * Располагает медианы, биссектрисы или углы по возрастанию.
     */
    static double[] getParams(double a, double b, double c, Computable<Double> comp) {
        return Arrays.stream(new double[]{
                comp.compute(a, b, c),
                comp.compute(c, a, b),
                comp.compute(b, c, a)
        }).sorted().toArray();
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        return 2 * areaByHeron / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {
        return a * b * c / 4 / areaByHeron;
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cos = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / 2 / b / c;
        double sin = Math.sqrt(1 - Math.pow(cos, 2));
        return 0.5 * b * c * sin;
    }
}

@FunctionalInterface
interface Computable<T> {
    public double compute(T... x);
}