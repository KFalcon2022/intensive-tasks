package com.walking.intensive.chapter1.task5;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-triangle.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
        printInfo(11, 21, 24);
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

    static double getHalfOfPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    static double getAreaByHeron(double a, double b, double c) {
        double p = getHalfOfPerimeter(a, b, c);

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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

    static double getMedianByThreeSides(double a, double b, double c) {
        return Math.sqrt(2 * a * a + 2 * b * b - c * c) / 2;
    }

    /**
     * Располагайте медианы по возрастанию.
     */
    static double[] getMedians(double a, double b, double c) {
        double[] result = new double[3];

        result[0] = getMedianByThreeSides(a, b, c);
        result[1] = getMedianByThreeSides(c, b, a);
        result[2] = getMedianByThreeSides(a, c, b);

        return result;
    }

    static double getOneBisectorByHalfPerimeterAndThreeSides(double a, double b, double c) {
        return (2 * Math.sqrt(a * b * getHalfOfPerimeter(a, b, c) * (getHalfOfPerimeter(a, b, c) - c))) / (a + b);
    }

    /**
     * Располагайте биссектрисы по возрастанию.
     */
    static double[] getBisectors(double a, double b, double c) {
        double[] result = new double[3];

        result[0] = getOneBisectorByHalfPerimeterAndThreeSides(a, b, c);
        result[1] = getOneBisectorByHalfPerimeterAndThreeSides(c, b, a);
        result[2] = getOneBisectorByHalfPerimeterAndThreeSides(a, c, b);

        return result;
    }

    static double getOneAngleByThreeSides(double a, double b, double c) {
        return Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
    }

    /**
     * Располагайте углы по возрастанию.
     */
    static double[] getAngles(double a, double b, double c) {
        double[] result = new double[3];

        result[0] = getOneAngleByThreeSides(a, b, c);
        result[1] = getOneAngleByThreeSides(c, b, a);
        result[2] = getOneAngleByThreeSides(a, c, b);

        return result;
    }

    static double getInscribedCircleRadius(double a, double b, double c) {
        double p = getHalfOfPerimeter(a, b, c);

        return Math.sqrt(((p - a) * (p - b) * (p - c)) / p);
    }

    static double getCircumradius(double a, double b, double c) {
        double p = getHalfOfPerimeter(a, b, c);

        return a * b * c / (4 * Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    static double getAreaAdvanced(double a, double b, double c) {
        double cosinus = (a * a + b * b - c * c) / (2 * a * b);
        double sinus = Math.sqrt(1 - cosinus * cosinus);
        return (a * b * sinus) / 2;
    }
}