package com.walking.intensive.chapter1.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        Для собственных проверок можете делать любые изменения в этом методе

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите длины сторон треугольника.\nВведите длину стороны АВ: ");
        double a = Double.parseDouble(reader.readLine());
        System.out.print("Введите длину стороны BC: ");
        double b = Double.parseDouble(reader.readLine());
        System.out.print("Введите длину стороны AC: ");
        double c = Double.parseDouble(reader.readLine());

        System.out.println("Введите номер пункта, который выдаст информацию:\n" +
                "1) О площади треугольника формулой Герона.\n" +
                "2) О длинах всех высот треугольника.\n" +
                "3) О длинах всех медиан треугольника.\n" +
                "4) О длинах всех биссектрис треугольника.\n" +
                "5) О значениях всех углов треугольника в градусах.\n" +
                "6) О длине радиуса вписанной в треугольник окружности.\n" +
                "7) О длине радиуса описанной вокруг треугольника окружности.\n" +
                "8) О площади треугольника, найденной через синус и косинус.");
        switch (Integer.parseInt(reader.readLine())) {
            case 1 -> System.out.println("S треугольника равна " + getAreaHeron(a, b, c));
            case 2 -> System.out.println("Длины высот равны: " + Arrays.toString(getHeights(a, b, c)));
            case 3 -> System.out.println("Длины медиан равны: " + Arrays.toString(getMedians(a, b, c)));
            case 4 -> System.out.println("Длины биссектрис равны: " + Arrays.toString(getBisectors(a, b, c)));
            case 5 -> System.out.println("Значения углов треугольника" + Arrays.toString(getAngles(a, b, c)));
            case 6 -> System.out.println("Длина радиуса впис. окр. равна: " + getInscribedCircleRadius(a, b, c));
            case 7 -> System.out.println("Длина радиуса опис. окр. равна: " + getCircumradius(a, b, c));
            case 8 -> System.out.println("S треугольника равна " + getAreaAdvanced(a, b, c));
        }
        reader.close();
    }

    static boolean validation(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Треугольник не существует");
            return false;
        }
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Треугольник является вырожденным");
            return false;
        }
        return true;
    }

    static double getAreaHeron(double a, double b, double c) {
        //        Место для вашего кода
        if (!validation(a, b, c)) {
            return 0;
        }
        double halfPerimeter = 0.5 * (a + b + c);
        double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));

        return triangleArea;

    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        //        Место для вашего кода
        if (!validation(a, b, c)) {
            return null;
        }
        double[] heights = new double[3];
        double formulaNumerator = 2.0 * getAreaHeron(a, b, c);
        heights[0] = formulaNumerator / a;
        heights[1] = formulaNumerator / b;
        heights[2] = formulaNumerator / c;

        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        //        Место для вашего кода
        if (!validation(a, b, c)) {
            return null;
        }
        double[] medians = new double[3];
        medians[0] = 0.5 * Math.sqrt(2.0 * (b * b + c * c) - a * a);
        medians[1] = 0.5 * Math.sqrt(2.0 * (a * a + c * c) - b * b);
        medians[2] = 0.5 * Math.sqrt(2.0 * (a * a + b * b) - c * c);

        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        //        Место для вашего кода
        if (!validation(a, b, c)) {
            return null;
        }
        double[] bisectors = new double[3];
        bisectors[0] = Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c);
        bisectors[1] = Math.sqrt(a * c * (b + a + c) * (a + c - b)) / (a + c);
        bisectors[2] = Math.sqrt(b * a * (c + b + a) * (b + a - c)) / (b + a);

        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        //        Место для вашего кода
        if (!validation(a, b, c)) {
            return null;
        }
        double[] angles = new double[3];
        angles[0] = Math.acos((b * b + c * c - a * a) / (2.0 * b * c));
        angles[1] = Math.acos((b * b + a * a - c * c) / (2.0 * a * b));
        angles[2] = Math.acos((a * a + c * c - b * b) / (2.0 * a * c));
        System.out.println(Arrays.toString(angles));

        Arrays.sort(angles);

        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        //        Место для вашего кода
        //используем для нахождения площади по ф-ле Герона метод getAreaByHeron
        if (!validation(a, b, c)) {
            return 0;
        }
        double inscribedCircleRadius = 2.0 * getAreaHeron(a, b, c) / (a + b + c);

        return inscribedCircleRadius;
    }

    static double getCircumradius(double a, double b, double c) {
        //        Место для вашего кода
        if (!validation(a, b, c)) {
            return 0;
        }
        double circumradius = a * b * c * 0.25 / getAreaHeron(a, b, c);

        return circumradius;
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода
        //a^2 = b^2 + c^2 - 2bc*cos α  -- теорема косинусов
        //sin^2 a + cos^2 a = 1     -- осн-е триг-е тожд-во

        if (!validation(a, b, c)) {
            return 0;
        }
        double cosA = (b * b + c * c - a * a) * 10.0 / (2.0 * b * c * 10.0);
        double sinA = Math.sqrt(1.0 - cosA * 10.0 * cosA * 10.0 / 100.0);
        double triangleArea = (a * b * sinA) * 0.5;

        return triangleArea;
    }
}