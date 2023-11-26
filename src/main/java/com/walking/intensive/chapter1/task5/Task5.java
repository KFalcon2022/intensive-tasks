package com.walking.intensive.chapter1.task5;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Task5 {
    public static void main(String[] args) {
        //printInfo(11, 21, 24);
        printInfo(1, 2, 24);
    }

    static String doubleToRoundedString(double val) {
        return String.format("%.3f", val);
    }

    static void sortArray(double[] array) {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            double value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }

    static String arrayToString(double[] arr) {
        sortArray(arr);
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result = result.concat(doubleToRoundedString(arr[i]));
            if (i + 1 < arr.length) {
                result = result + "; ";
            }
        }
        result = result + "]";
        return result;
    }

    static void printInfo(double a, double b, double c) {
        String params = "(" + a + ", " + b + ", " + c + ")\t";
        System.out.println("getAreaByHeron" + params + doubleToRoundedString(getAreaByHeron(a, b, c)));
        System.out.println("getHeights" + params + arrayToString(getHeights(a, b, c)));
        System.out.println("getMedians" + params + arrayToString(getMedians(a, b, c)));
        System.out.println("getBisectors" + params + arrayToString(getBisectors(a, b, c)));
        System.out.println("getAngles" + params + arrayToString(getAngles(a, b, c)));
        System.out.println("getInscribedCircleRadius" + params + doubleToRoundedString(getInscribedCircleRadius(a, b, c)));
        System.out.println("getCircumradius" + params + doubleToRoundedString(getCircumradius(a, b, c)));
        System.out.println("getAreaAdvanced" + params + doubleToRoundedString(getAreaAdvanced(a, b, c)));

    }

    static double getHalfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    static double getAreaByHeron(double a, double b, double c) {
        if (a > 0 && b > 0 & c > 0) {
            double halfPerimeter = getHalfPerimeter(a, b, c);
            double val = halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c);
            if(val < 0) {
                throw new IllegalArgumentException("Неверные входные параметры");
            }
            return Math.sqrt(val);
        } else throw new IllegalArgumentException("Длина стороны треугольника не может быть отрицательным числом");
    }

    /**
     * Располагайте высоты по возрастанию.
     */
    static double[] getHeights(double a, double b, double c) {
        double[] result = new double[3];
        double s = getAreaByHeron(a, b, c);

        result[0] = 2 * s / a;
        result[1] = 2 * s / b;
        result[2] = 2 * s / c;

        return result;
    }

    static double getMedianThreeSides(double a, double b, double c) {
        return Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] result = new double[3];

        result[0] = getMedianThreeSides(a, b, c);
        result[1] = getMedianThreeSides(c, b, a);
        result[2] = getMedianThreeSides(a, c, b);

        return result;
    }

    static double getOneBisector(double a, double b, double c) {
        return (2 * Math.sqrt(a * b * getHalfPerimeter(a, b, c) * (getHalfPerimeter(a, b, c) - c))) / (a + b);
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] result = new double[3];

        result[0] = getOneBisector(a, b, c);
        result[1] = getOneBisector(c, b, a);
        result[2] = getOneBisector(a, c, b);

        return result;
    }

    static double getOneAngle(double a, double b, double c) {
        return Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] result = new double[3];

        result[0] = getOneAngle(a, b, c);
        result[1] = getOneAngle(c, b, a);
        result[2] = getOneAngle(a, c, b);

        return result;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double p = getHalfPerimeter(a, b, c);

        return Math.sqrt(((p - a) * (p - b) * (p - c)) / p);
    }

    static double getCircumradius(double a, double b, double c) {
        double p = getHalfPerimeter(a, b, c);

        return a * b * c / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosinus = (a * a + b * b - c * c) / (2 * a * b);
        double sinus = Math.sqrt(1 - cosinus * cosinus);
        return (a * b * sinus) / 2;
    }
}