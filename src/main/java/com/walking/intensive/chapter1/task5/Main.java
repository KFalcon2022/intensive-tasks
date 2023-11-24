package com.walking.intensive.chapter1.task5;

/*
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */

public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 5;
        double b = 8;
        double c = 9;

        if (a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (a + c) <= b || (b + c) <= a) {
            System.out.println("Треугольник не существует.");
        } else {
            System.out.printf("Площадь треугольника: %.1f\n", getAreaByHeron(a, b, c));
            double[] triangleHeights = getHeights(a, b, c);
            System.out.printf("Высоты треугольника: %.1f; %.1f; %.1f\n", triangleHeights[0], triangleHeights[1], triangleHeights[2]);
            double[] triangleMedians = getMedians(a, b, c);
            System.out.printf("Медианы треугольника: %.1f %.1f; %.1f\n", triangleMedians[0], triangleMedians[1], triangleMedians[2]);
            double[] triangleBisectors = getBisectors(a, b, c);
            System.out.printf("Биссектрисы треугольника: %.1f; %.1f; %.1f\n", triangleBisectors[0], triangleBisectors[1], triangleBisectors[2]);
            double[] triAngles = getAngles(a, b, c);
            System.out.printf("Углы треугольника (в градусах): %.0f; %.0f; %.0f\n", triAngles[0], triAngles[1], triAngles[2]);
            System.out.printf("Радиус вписанной окружности: %.1f\n", getInscribedCircleRadius(a, b, c));
        }
    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return triangleSquare;
    }

    // Располагайте высоты по возрастанию.
    static double[] getHeights(double a, double b, double c) {

        double[] triangleHeights = new double[3];
        triangleHeights[0] = (2 * getAreaByHeron(a, b, c)) / a;
        triangleHeights[1] = (2 * getAreaByHeron(a, b, c)) / b;
        triangleHeights[2] = (2 * getAreaByHeron(a, b, c)) / c;

        for (int i = 0; i < triangleHeights.length; i++) {
            for (int j = i + 1; j < triangleHeights.length; j++) {
                if (triangleHeights[i] > triangleHeights[j]) {
                    double x = triangleHeights[i];
                    triangleHeights[i] = triangleHeights[j];
                    triangleHeights[j] = x;
                }
            }
        }
        return triangleHeights;
    }

    //  Располагайте медианы по возрастанию.
    static double[] getMedians(double a, double b, double c) {
        double[] triangleMedians = new double[3];
        triangleMedians[0] = (Math.sqrt(2 * b * b + 2 * c * c - a * a)) / 2;
        triangleMedians[1] = (Math.sqrt(2 * a * a + 2 * c * c - b * b)) / 2;
        triangleMedians[2] = (Math.sqrt(2 * a * a + 2 * b * b - c * c)) / 2;

        for (int i = 0; i < triangleMedians.length; i++) {
            for (int j = i + 1; j < triangleMedians.length; j++) {
                if (triangleMedians[i] > triangleMedians[j]) {
                    double x = triangleMedians[i];
                    triangleMedians[i] = triangleMedians[j];
                    triangleMedians[j] = x;
                }
            }
        }
        return triangleMedians;
    }

    // Располагайте биссектрисы по возрастанию.
    static double[] getBisectors(double a, double b, double c) {
        double[] triangleBisectors = new double[3];
        double p = (a + b + c) / 2;
        triangleBisectors[0] = (Math.sqrt((b * c * p) * (p - a)) * 2) / (b + c);
        triangleBisectors[1] = (Math.sqrt((a * c * p) * (p - b)) * 2) / (a + c);
        triangleBisectors[2] = (Math.sqrt((a * b * p) * (p - c)) * 2) / (a + b);

        for (int i = 0; i < triangleBisectors.length; i++) {
            for (int j = i + 1; j < triangleBisectors.length; j++) {
                if (triangleBisectors[i] > triangleBisectors[j]) {
                    double x = triangleBisectors[i];
                    triangleBisectors[i] = triangleBisectors[j];
                    triangleBisectors[j] = x;
                }
            }
        }
        return triangleBisectors;
    }

    // Располагайте углы по возрастанию.
    static double[] getAngles(double a, double b, double c) {
        double[] triAngles = new double[3];
        double x = 180 / (a + b + c);
        triAngles[0] = Math.ceil(a * x);
        triAngles[1] = Math.ceil(b * x);
        triAngles[2] = 180 - triAngles[0] - triAngles[1];
        return triAngles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double inCircleRadius = Math.sqrt(((p - a) * (p - b) * (p - b)) / p);
        return inCircleRadius;
    }

    static double getCircumradius(double a, double b, double c) {
        

        return 0; // Заглушка. При реализации - удалить
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }

}