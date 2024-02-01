package com.walking.intensive.chapter5.task23;

public class Main {
    public static void main(String[] args) {
        double[][] matrix2 = {{2, -3}, {4, 5}};   // det A = 22

        double[][] matrix3 = {{2, -5, 3}, {1, 4, 0}, {-3, 7, 5}};   // det A = 122

        double[][] matrix4 = {{-5, 0, 0, 0}, {3, 4, 0, 0}, {6, 2, -3, 3}, {-1, 2, -4, 8}}; // det A = 240

        double[][] matrix5 = {{0, 12, -12, 12, 6}, {-3, -9, 9, 9, -6}, {0, 0, -2, 4, -2}, {-3, -17, 13, 3, -8},
                {0, 0, 4, -8, 0}}; // det A = -1728

        double[][] matrix = {{1, 2, 3}, {4, 5}, {4, 5, 6}}; // throws Exception
        try {
            System.out.println(getMatrixDeterminant(matrix2));
            System.out.println(getMatrixDeterminant(matrix3));
            System.out.println(getMatrixDeterminant(matrix4));
            System.out.println(getMatrixDeterminant(matrix5));
            System.out.println(getMatrixDeterminant(matrix));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static double getMatrixDeterminant(double[][] matrix) throws IllegalArgumentException {
        if (!isMatrixSquare(matrix)) {
            throw new IllegalArgumentException("Вычисление определителя возможно только для квадратных матриц.");
        }

        if ((matrix.length == 1)) {
            return matrix[0][0];
        }

        final double LINE_INDEX = 1;

        double matrixDeterminant = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i] == 0) {
                continue;
            }
            double columnIndex = 1 + i;
            matrixDeterminant = matrixDeterminant + matrix[0][i] * Math.pow(-1, LINE_INDEX + columnIndex) *
                    getMatrixDeterminant(getMinorMatrix(matrix, 1, 1 + i));
        }

        return matrixDeterminant;
    }

    public static double[][] getMinorMatrix(double[][] matrix, int elementLineIndex, int elementColumnIndex) {
        int minorMatrixLength = matrix.length - 1;
        double[][] minorMatrix = new double[minorMatrixLength][minorMatrixLength];

        int matrixLine = 0;
        int matrixColumn = 0;

        for (int i = 0; i < minorMatrix.length; i++) {
            for (int j = 0; j < minorMatrix.length; j++) {
                if (matrixLine == elementLineIndex - 1) {
                    matrixLine++;
                }

                if (matrixColumn == elementColumnIndex - 1) {
                    if (matrixColumn < minorMatrixLength) {
                        matrixColumn++;
                    } else {
                        matrixLine++;
                        matrixColumn = 0;
                    }
                }

                minorMatrix[i][j] = matrix[matrixLine][matrixColumn];
                matrixColumn++;

                if (matrixColumn == matrix.length) {
                    matrixLine++;
                    matrixColumn = 0;
                }
            }
        }

        return minorMatrix;
    }

    public static boolean isMatrixSquare(double[][] matrix) {
        for (double[] strings : matrix) {
            if (strings.length != matrix.length) {
                return false;
            }
        }

        return true;
    }
}