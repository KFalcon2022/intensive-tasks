package com.walking.intensive.chapter5.task23;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/matrix-determinant.html">Определитель матрицы</a>
 */
public class Main {
    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(new int[0][0]);
        System.out.println(Arrays.deepToString(matrix1.getData()));
        System.out.println(matrix1.getDeterminant() + "\n");

        Matrix matrix2 = new Matrix(new int[][]{{2, -5, 3, 4},
                                               {1, 9, 0, 8},
                                               {-3, 7, 5},
                                               {5, -6, -3, 3}});
        System.out.println(Arrays.deepToString(matrix2.getData()));
        System.out.println(matrix2.getDeterminant() + "\n");

        Matrix matrix3 = new Matrix(new int[][]{{2, -5, 3, 4},
                                               {1, 9, 0, 8},
                                               {-3, 7, 5, 6},
                                               {5, -6, -3, 3}});
        System.out.println(Arrays.deepToString(matrix3.getData()));
        System.out.println(matrix3.getDeterminant() + "\n");

    }
}

//      НЕ стирать )
//
//        int n = 2;
//        Matrix matrix = new Matrix(n, n);

/*
        Matrix subMatrix = new Matrix(1, 2, matrix);
        System.out.println(Arrays.deepToString(subMatrix.getData()));*/