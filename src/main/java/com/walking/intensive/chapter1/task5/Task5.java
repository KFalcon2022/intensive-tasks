package com.walking.intensive.chapter1.task5;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        getAreaByHeron(5, 1, 3);
        System.out.println(Math.sqrt(-3));
    }

    static double getAreaByHeron(double a, double b, double c) throws ArithmeticException, IllegalArgumentException{
        double halfPerimeter = (a + b + c) / 2;
        double squaredArea = halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c);
        if (squaredArea < 0) { // Math.sqrt(squaredArea) => NAN
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Треугольник не существует");
            }
        } else if (squaredArea == 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Треугольник вырожденный");
            }
        }
        return Math.sqrt(squaredArea);
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double doubleArea = getAreaByHeron(a, b, c) * 2;

            double height1 = doubleArea / a;
            double height2 = doubleArea / b;
            double height3 = doubleArea / c;

            double heightsSum = height1 + height2 + height3;

            double[] heights = new double[3];
            heights[0] = Math.min(height1, Math.min(height2, height3));
            heights[2] = Math.max(height1, Math.max(height2, height3));
            heights[1] = heightsSum - heights[0] - heights[2];

            return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double median1 = Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 2)) / 2;
        double median2 = Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(a, 2)) / 2;
        double median3 = Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(b, 2)) / 2;

        double mediansSum = median1 + median2 + median3;

        double[] medians = new double[3];
        medians[0] = Math.min(median1, Math.min(median2, median3));
        medians[2] = Math.max(median1, Math.max(median2, median3));
        medians[1] = mediansSum - medians[0] - medians[2];

        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double perimeter = a + b + c;

        double bisector1 = Math.sqrt(b * c * perimeter * (perimeter - a * 2)) / (perimeter - a);
        double bisector2 = Math.sqrt(a * c * perimeter * (perimeter - b * 2)) / (perimeter - b);
        double bisector3 = Math.sqrt(a * b * perimeter * (perimeter - c * 2)) / (perimeter - c);

        double bisectorsSum = bisector1 + bisector2 + bisector3;

        double[] bisectors = new double[3];
        bisectors[0] = Math.min(bisector1, Math.min(bisector2, bisector3));
        bisectors[2] = Math.max(bisector1, Math.max(bisector2, bisector3));
        bisectors[1] = bisectorsSum - bisectors[0] - bisectors[2];

        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double doubleArea = getAreaByHeron(a, b, c) * 2;

        double angle1 = (Math.asin(doubleArea / (a * b)) * 180) / Math.PI;
        double angle2 = (Math.asin(doubleArea / (b * c)) * 180) / Math.PI;
        double angle3 = (Math.asin(doubleArea / (a * c)) * 180) / Math.PI;

        double angelsSum = angle1 + angle2 + angle3;

        double[] angles = new double[3];
        angles[0] = Math.min(angle1, Math.min(angle2, angle3));
        angles[2] = Math.max(angle1, Math.max(angle2, angle3));
        angles[1] = angelsSum - angles[0] - angles[2];

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {

        return (getAreaByHeron(a, b, c) * 2) / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {

        return (a * b * c) / (getAreaByHeron(a, b, c) * 4);
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosine = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double sine = Math.sqrt(1 - Math.pow(cosine, 2));

        return (a * b * sine) / 2;
    }
}