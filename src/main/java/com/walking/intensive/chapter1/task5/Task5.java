package com.walking.intensive.chapter1.task5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        Scanner scanner = new Scanner(System.in);
        boolean isRepeat = true;
        while (isRepeat) {
            System.out.print("Введите длину стороны а: ");
            double a = scanner.nextDouble();
            System.out.print("Введите длину стороны b: ");
            double b = scanner.nextDouble();
            System.out.print("Введите длину стороны c: ");
            double c = scanner.nextDouble();
            if (!checkTriangle(a, b, c)) {
                System.out.println("Треугольник вырожденный либо не существует!");
                continue;
            }
            boolean isSaveLength = true;
            while (isSaveLength) {
                System.out.print("""
                        Выберите функцию:
                        0 - Выйти из программа
                        1 - Площадь треугольника формулой Герона
                        2 - Длина всех высот треугольника
                        3 - Длина всех медиан треугольника
                        4 - Длина всех биссектрис треугольника
                        5 - Значения всех углов треугольника в градусах
                        6 - Длина радиуса вписанной в треугольник окружности
                        7 - Длина радиуса описанной вокруг треугольника окружности
                        8 - Ввести другие длины сторон треугольника
                        """);
                int function = scanner.nextInt();
                switch (function) {
                    case 0 -> isRepeat = false;
                    case 1 -> System.out.println(" Результат: " + getAreaByHeron(a, b, c));
                    case 2 -> System.out.println(" Результат: " + Arrays.toString(getHeights(a, b, c)));
                    case 3 -> System.out.println(" Результат: " + Arrays.toString(getMedians(a, b, c)));
                    case 4 -> System.out.println(" Результат: " + Arrays.toString(getBisectors(a, b, c)));
                    case 5 -> System.out.println(" Результат: " + Arrays.toString(getAngles(a, b, c)));
                    case 6 -> System.out.println(" Результат: " + getInscribedCircleRadius(a, b, c));
                    case 7 -> System.out.println(" Результат: " + getCircumradius(a, b, c));
                    case 8 -> isSaveLength = false;
                    default -> System.out.println("Данная функция не реализована");
                }
            }
        }
    }

    static boolean checkTriangle(double a, double b, double c) {

        return (a + b > c && a + c > b && c + b > a && a > 0 && b > 0 && c > 0);
    }

    static double getAreaByHeron(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double halfPerimeter = (a + b + c) / 2;
        double[] heights = new double[3];
        double doubleArea = 2 * Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        heights[0] = doubleArea / a;
        heights[1] = doubleArea / b;
        heights[2] = doubleArea / c;
        Arrays.sort(heights);
        return heights;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] medians = new double[3];
        medians[0] = (Math.sqrt((2 * (b * b + c * c)) - (a * a))) / 2;
        medians[1] = (Math.sqrt((2 * (a * a + c * c)) - (b * b))) / 2;
        medians[2] = (Math.sqrt((2 * (a * a + b * b)) - (c * c))) / 2;
        Arrays.sort(medians);
        return medians;
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] bisectors = new double[3];
        double halfPerimeter = (a + b + c) / 2;
        bisectors[0] = (2 * Math.sqrt(a * b * halfPerimeter * (halfPerimeter - c)) / (a + b));
        bisectors[1] = (2 * Math.sqrt(a * c * halfPerimeter * (halfPerimeter - b)) / (a + c));
        bisectors[2] = (2 * Math.sqrt(c * b * halfPerimeter * (halfPerimeter - a)) / (c + b));
        Arrays.sort(bisectors);
        return bisectors;
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] angles = new double[3];
        angles[0] = Math.toDegrees(Math.acos(((b * b) + (c * c) - (a * a)) / (2 * b * c)));
        angles[1] = Math.toDegrees(Math.acos(((a * a) + (c * c) - (b * b)) / (2 * a * c)));
        angles[2] = Math.toDegrees(Math.acos(((b * b) + (a * a) - (c * c)) / (2 * b * a)));
        Arrays.sort(angles);
        return angles;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        return (2 * getAreaByHeron(a, b, c)) / (a + b + c);
    }

    static double getCircumradius(double a, double b, double c) {
        return (a * b * c) / (4 * getAreaByHeron(a, b, c));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        //        Место для вашего кода

        return 0; // Заглушка. При реализации - удалить
    }
}