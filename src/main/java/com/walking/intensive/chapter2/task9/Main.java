package com.walking.intensive.chapter2.task9;

import java.awt.event.WindowFocusListener;

public class Main {
    public static void main(String[] args) {

        System.out.println(getPascalTriangle(15));

    }

    static String getPascalTriangle(int n) {

        int[] triangleLine = new int[n]; //одна текущая строка из треугольника.
        String[] triangleString = new String[n];
        String space = " ";

        triangleLine[0] = 1;
        triangleString[0] = getTriangleString(triangleLine, 0, space);

        /*идея: Нулевой элемент массива - это край треугольника.
        Центр треугольника - это "диагональ" воображаемого двумерного массива.
        Каждый шаг цикла i - это обход новой строки треугольника. Но избыточно хранить все строки в двумерном массиве,
        достаточно "смотреть" на текущую строку.
        */

        for (int i = 1; i < n; i++) { //первую строку уже инициализировали, поэтому с 1 начинаем

            //i - это и номер строки, и указатель на центральное число в линии

            //заполнение центрального числа в линии
            if (triangleLine[i - 1] == 0) {
                //заполняем только тогда, когда центром прошлой линии был 0, иначе остается 0
                triangleLine[i] = 2 * triangleLine[i - 2];//такое случится только после 2ой строки, за индекс не выйдет.
            }

            //перезаполнение прочих чисел
            for (int j = i - 1; j > 1; j--) {
                /*до 0го числа нет смысла доходить, там всегда 1 (края треугольника).первый - это всегда 0*/
                if (triangleLine[j] != 0) { // нули не трогаем, они тоже всегда остаются на местах
                    triangleLine[j] += triangleLine[j - 2];
                }
            }
            triangleString[i] = getTriangleString(triangleLine, i, space);
        }

        //поправим, чтобы треугольник не косило

        int maxHalfLenght = triangleString[n - 1].length() / 2;
        for (int i = 0; i < (n - 1); i++) {
            int curHalfLenght = triangleString[i].length() / 2;

            for (int j = 0; j < (maxHalfLenght - curHalfLenght); j++) {
                triangleString[i] = " " + triangleString[i];
            }
        }

        String answer = "";

        for (int i = 0; i < n; i++) {
            answer = String.join("\n",answer,triangleString[i]);
        }

        return answer;
    }

    static String getTriangleString(int[] triangleLine, int n, String space) {

        String triangleString = "", triangleStringPart = "";
        boolean isCenter = true;

        for (int i = n; i >= 0; i--) {

            triangleStringPart = (triangleLine[i] == 0) ? space : Integer.toString(triangleLine[i]);

            if (isCenter) {
                triangleString = triangleStringPart;
                isCenter = false;
            } else {
                triangleString = triangleStringPart.concat(triangleString).concat(triangleStringPart);
            }
        }

        return triangleString;
    }

}