package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 8;
        double b = 3;
        double c = 0;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    /**
     * При формировании строки, корни уравнения должны указываться по возрастанию.
     * <p>
     * Примеры результирующей строки:
     * <p>
     * Количество решений: 2. Корни: -4;4
     * <p>
     * Количество решений: 1. Корень: 0
     * <p>
     * Количество решений: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {
        /*Если D < 0 – то квадратное уравнение не имеет решений;
          Если D = 0 – то уравнение будет иметь только один корень;
          Если D > 0 – то уравнение имеет два решения.
         Бесконечное количество корней будет если только все коэффициенты равны нулю.

          */
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Количество решений: бесконечно";
                } else {
                    return "Количество решенийЖ 0";
                }
            } else {
                double aZero = -c / b;
                return "Количество решений: 1. Корень: " + aZero;
            }
        } else {


            double discriminant = b * b - 4 * a * c;  //определяем корень диск D=b2?4ac   х=-b±Math.sqrt(D) / 2a

            if (discriminant > 0) {
                double firstMS = (-b + Math.sqrt(discriminant)) / (2 * a);
                double secondMS = (-b - Math.sqrt(discriminant)) / (2 * a);
                return "Количество решений: 2. Корни: " + Math.min(firstMS, secondMS) + ";" + Math.max(firstMS, secondMS);
            } else if (discriminant == 0) {
                double disZero = -b / (2 * a);
                return "Количество решений: 1. Корень: " + disZero;
            } else {
                return "Количество решений: 0";
            }
        }
    }
}