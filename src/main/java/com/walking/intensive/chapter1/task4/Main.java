package com.walking.intensive.chapter1.task4;
import java.util.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Main {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        Random rand = new Random();
        for (int i=0;i<100;i++) {
            int intA = rand.nextInt(40) - 20;
            int intB = rand.nextInt(40) - 20;
            int intC = rand.nextInt(40) - 20;
//            double a = 0;
//            double b = 0;
//            double c = 0;
            System.out.printf("%dx^2%+dx%+d=0%n",intA,intB,intC);
            System.out.println(solveQuadraticEquation(intA, intB, intC));
        }
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
        //        Место для вашего кода
        double[] resultRoots = getSolveQuadraticEquation(a, b, c);
        String resultString = "Количество решений: " + (((int) resultRoots[0] == -1) ? "бесконечно" : (int) resultRoots[0]) + ".";
        int countOfRoot = (int) resultRoots[0];
        if (countOfRoot == 1) {
            resultString += String.format(" Корень: %.3f", resultRoots[1]);
        } else if (countOfRoot == 2) {
            resultString += String.format(" Корни: %.3f;%.3f", resultRoots[1], resultRoots[2]);
        }
        return resultString;
    }

    static private double[] getSolveQuadraticEquation(double a, double b, double c) {
        double[] arrayOfRoot = new double[3];
        if ((int) a == 0 && (int) b == 0 && (int) c == 0) {
            arrayOfRoot[0] = -1.;
        } else {
            if ((int) a == 0) {
                //Линейное уравнение
                if (b == 0) {
                    //нет корней
                    arrayOfRoot[0] = 0.;
                } else {
                    double root = -c / b;
                    arrayOfRoot[0] = 1.;
                    arrayOfRoot[1] = root;
                }
            } else {
                double discriminant = b * b - 4. * a * c;
                if (discriminant < 0) {
                    arrayOfRoot[0] = 0.;
                } else if (discriminant == 0) {
                    arrayOfRoot[0] = 1.;
                    arrayOfRoot[1] = -b / 2. / a;
                } else {
                    arrayOfRoot[0] = 2.;
                    double root1 = (-b - Math.sqrt(discriminant)) / 2. / a;
                    double root2 = (-b + Math.sqrt(discriminant)) / 2. / a;
                    if (root1 > root2) {
                        arrayOfRoot[1] = root2;
                        arrayOfRoot[2] = root1;
                    } else {
                        arrayOfRoot[1] = root1;
                        arrayOfRoot[2] = root2;
                    }
                }
            }
        }
        return arrayOfRoot;
    }
}