package com.walking.intensive.chapter5.task23;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/matrix-determinant.html">Определитель матрицы</a>
 */
public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(new int[][]{{2, -5, 3, 4},
                                               {1, 9, 0, 8},
                                               {-3, 7, 5, 4},
                                               {5, -6, -3, 3}});

        System.out.println(Arrays.deepToString(matrix.getData()));
        System.out.println(matrix.getDeterminant());
    }
}

//      НЕ стирать )
//
//        int n = 2;
//        Matrix matrix = new Matrix(n, n);

/*
        Matrix subMatrix = new Matrix(1, 2, matrix);
        System.out.println(Arrays.deepToString(subMatrix.getData()));*/