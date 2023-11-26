package com.walking.intensive.chapter1.task4;

/**
 * �������: <a href="https://geometry-math.ru/homework/Java-parameter.html">������</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        ��� ����������� �������� ������ ������ ����� ��������� � ���� ������
        double a = 5;
        double b = 1;
        double c = 4;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    /**
     * ��� ������������ ������, ����� ��������� ������ ����������� �� �����������.
     * <p>
     * ������� �������������� ������:
     * <p>
     * ���������� �������: 2. �����: -4;4
     * <p>
     * ���������� �������: 1. ������: 0
     * <p>
     * ���������� �������: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {

        int solutionsNum = 0;
        String roots = "";

        if (a == 0 && b == 0 && c == 0) {
            return "������� ����������";
        }

        if (a == 0 && b == 0) {
            return "���������� �������: 0.";
        }

        if (b == 0 && c == 0) {
            return "���������� �������: 1. ������: 0";
        }

        if (a == 0) {
            solutionsNum = 1;
            roots =  String.format(" ������: %.1f", (-c) / b);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            System.out.println("discriminant = " + discriminant);

            if (discriminant > 0) {
                double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
                solutionsNum = 2;
                roots = String.format(" �����: %.1f; %.1f", x1, x2);
            }
        }

        return "���������� �������: " + solutionsNum + "." + roots;
    }
}