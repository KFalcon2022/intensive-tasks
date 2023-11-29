package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 3;
        double b = 2;
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
     * Количество решений: 0
     */
    static String checkPossibilitySolution(double a){

        if (a != 0){
            return null;
        }

        return "Количество решений: 0.";
    }

    static String findDiscriminant(double a, double b, double c){

        double d = b * b - 4 * a * c;

        if (d > 0){
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);

            if (x1 < x2) {
                return "Количество решений: 2. Корни: " + x1 + ", " + x2 + ".";
            } else {
                return "Количество решений: 2. Корни: " + x2 + ", " + x1 + ".";

            }
        }

        if (d == 0){
            double x = -b / (2 * a);
            return "Количество решений: 1. Корень: " + x + ".";
        }


        return "Количество решений: 0.";

    }

    static String solveNotFullEquation(double a, double b, double c){

        if (b == 0 && c == 0){
            return "Количество решений: 1. Корень: 0.";
        }

        if (b == 0){
            if ( -(c/a) > 0){
                return "Количество решений: 0.";
            }
            double x = Math.sqrt(-(c/a));
            return "Количество решений: 2. Корни: " + x + ", -" + x + ".";
        }
        if ( c == 0){
            double x = -(b/a);
            return "Количество решений: 2. Корни: " + x + ", 0.";
        }
        return null;
    }

    static String solveQuadraticEquation(double a, double b, double c) {

        String checkPossibility = checkPossibilitySolution(a);

        if (checkPossibility != null){
            return checkPossibility;
        }

        String notFullEquation = solveNotFullEquation(a, b, c);

        if (notFullEquation != null){
            return notFullEquation;
        }

        return findDiscriminant(a, b, c);

    }


    //        Место для вашего кода

}
