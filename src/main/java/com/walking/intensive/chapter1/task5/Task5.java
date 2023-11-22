package com.walking.intensive.chapter1.task5;
import java.util.Arrays;
/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;

        double areaByHeron = getAreaByHeron(a, b, c);
        System.out.println("Area by Heron's formula: " + areaByHeron);

        double[] heights = getHeights(a, b, c);
        System.out.println("Heights: " + Arrays.toString(heights));

        double[] medians = getMedians(a, b, c);
        System.out.println("Medians: " + Arrays.toString(medians));

        double[] bisectors = getBisectors(a, b, c);
        System.out.println("Bisectors: " + Arrays.toString(bisectors));

        double[] angles = getAngles(a, b, c);
        System.out.println("Angles: " + Arrays.toString(angles));

        double rInscribed = getInscribedCircleRadius(a, b, c);
        System.out.println("Inscribed circle radius: " + rInscribed);

        double rCircumscribed = getCircumradius(a, b, c);
        System.out.println("Circumscribed circle radius: " + rCircumscribed);

        double advancedArea = getAreaAdvanced(a, b, c);
        System.out.println("Advanced area calculation: " + advancedArea);
    }

    static double getAreaByHeron(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double area = getAreaByHeron(a, b, c);
        double[] heights = {2 * area / a, 2 * area / b, 2 * area / c};
        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] medians = {
                0.5 * Math.sqrt(2 * b * b + 2 * c * c - a * a),
                0.5 * Math.sqrt(2 * a * a + 2 * c * c - b * b),
                0.5 * Math.sqrt(2 * a * a + 2 * b * b - c * c)
        };
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] bisectors = {
                2 / (a + b) * Math.sqrt(a * b * (a + b + c) * (a + b - c)),
                2 / (a + c) * Math.sqrt(a * c * (a + b + c) * (a + c - b)),
                2 / (b + c) * Math.sqrt(b * c * (a + b + c) * (b + c - a))
        };
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] angles = {
                Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c))),
                Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c))),
                Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)))
        };
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = getAreaByHeron(a, b, c);
        return area / s;
    }

    static double getCircumradius(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = getAreaByHeron(a, b, c);
        return (a * b * c) / (4 * area);
    }

    static double getAreaAdvanced(double a, double b, double c) {
        // Calculate the angle opposite side a using the Law of Cosines
        double angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        // Calculate the area using the sine of angleA
        double area = 0.5 * b * c * Math.sin(angleA);
        return area;
    }
}