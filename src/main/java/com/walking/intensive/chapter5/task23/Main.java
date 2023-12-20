package com.walking.intensive.chapter5.task23;

public class Main {
    public static void main(String[] args) {

        int[][] array = {{4, 3, 2, 1},
                        {3, 4, 3, 2},
                        {2, 3, 4, 3},
                        {1, 2, 3, 4}};

        System.out.println(getDeterminant(array)); //20
    }

    public static double getDeterminant(int[][] array) {

        if (!isSquareMatrix(array)) {
            return 0;
        }

        double determinant = 0;

        if (array.length == 1) {
            return array[0][0];
        }

        for (int i = 0; i < array.length; i++) {
            determinant += array[0][i] * Math.pow(-1, 2 + i) * getDeterminant(getMinor(array, i));
        }

        return determinant;
    }

    public static boolean isSquareMatrix(int[][] array) {

        for (int[] innerArray : array
        ) {
            if (innerArray.length != array.length) {
                return false;
            }
        }
        return true;
    }

    public static int[][] getMinor(int[][] array, int columnNumber) {

        if (array.length == 1) {
            return array;
        }

        int[][] minor = new int[array.length - 1][array.length - 1];

        for (int i = 0; i < array.length - 1; i++) {      //разложение всегда по первой строке, для пересборки массива она не нужна
            for (int j = 0; j < array.length; j++) {  // но столбцы нужны все, поэтому обходим полностью, но пропускаем тот, который равен columnNumber
                if (j == columnNumber) {
                    continue;
                }
                if (j < columnNumber) {
                    minor[i][j] = array[i + 1][j];
                } else {
                    minor[i][j - 1] = array[i + 1][j];
                }
            }
        }

        return minor;
    }
}