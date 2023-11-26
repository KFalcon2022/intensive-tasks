package com.walking.intensive.chapter1.task5;
import java.util.Arrays;
///// математический модуль здесь /////
import static java.lang.Math.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */

public class Task5 {
    public static void main(String[] args) {

        // Для собственных проверок можете делать любые изменения в этом методе
        System.out.println("Площадь треугольника: " + getAreaByHeron(7, 5, 10));
        System.out.println("Высоты треугольника: " + Arrays.toString(getHeights(7, 5, 10)));
        System.out.println("Медианы треугольника: " + Arrays.toString(getMedians(7, 5, 10)));
        System.out.println("Биссектрисы треугольника: " + Arrays.toString(getBisectors(7, 5, 10)));
        System.out.println("Углы треугольника: " + Arrays.toString(getAngles(7, 5, 10)));
        System.out.println("Радиус вписанной окружности: " + getInscribedCircleRadius(7, 5, 10));
        System.out.println("Радиус описанной окружности: " + getCircumradius(7, 5, 10));
        System.out.println("Площадь треугольника (теорема косинусов): " + getAreaAdvanced(7, 5, 10));
    }

    // 1. Метод для вычисления площади по формуле Герона
    static double getAreaByHeron(double a, double b, double c) {
        double square = (a + b + c) / 2.0;

        return sqrt(square * (square - a) * (square - b) * (square - c));
    }

    /**
     * Располагайте высоты по возрастанию. OK
     */

    // 2. Метод для вычисления длин всех высот треугольника
    static double[] getHeights(double a, double b, double c) {
        double area = getAreaByHeron(a, b, c);

        double[] heights = {2 * area / a,
                2 * area / b,
                2 * area / c};

        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */

    // 3. Метод для вычисления длин всех медиан треугольника
    static double[] getMedians(double a, double b, double c) {
        double[] medians = {0.5 * sqrt(2 * b * b + 2 * c * c - a * a),
                0.5 * Math.sqrt(2 * a * a + 2 * c * c - b * b),
                0.5 * Math.sqrt(2 * a * a + 2 * b * b - c * c)};

        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */

    // 4. Метод для вычисления длин всех биссектрис треугольника
    static double[] getBisectors(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2.0;

        double[] bisectors = {2 * Math.sqrt(b * c * halfPerimeter * (halfPerimeter - a)) / (b + c),
                2 * Math.sqrt(a * c * halfPerimeter * (halfPerimeter - b)) / (a + c),
                2 * Math.sqrt(a * b * halfPerimeter * (halfPerimeter - c)) / (a + b)};

        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */

    // 5. Метод для вычисления углов треугольника в градусах
    static double[] getAngles(double a, double b, double c) {
        double[] angles = {Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c))),
                Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c))),
                Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)))};

        Arrays.sort(angles);
        return angles;
    }

    // 6. Метод для вычисления радиуса вписанной окружности
    static double getInscribedCircleRadius(double a, double b, double c) {
        double area = getAreaByHeron(a, b, c);
        double halfPerimeter = (a + b + c) / 2.0;

        return area / halfPerimeter;
    }

    // 7. Метод для вычисления радиуса описанной окружности
    static double getCircumradius(double a, double b, double c) {
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    // 8. Метод для вычисления площади через теорему косинусов и синуса угла
    static double getAreaAdvanced(double a, double b, double c) {
        double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        return 0.5 * a * b * Math.sin(angleC);
    }
}