package com.walking.intensive.chapter5.task23;

public class Matrix {

    private int[][] data;
    private int rows, columns;

    public Matrix(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }

    public Matrix(int extractedRow, int extractedColumn, Matrix baseMatrix) {
        this.rows = baseMatrix.rows - 1;
        this.columns = baseMatrix.columns -1;
        this.data = new int[rows][columns];

        int rowCoef = 0;

        for (int i = 0; i < rows; i++) {
            int columnCoef = 0;

            if (i == extractedRow) {
                rowCoef++;
            }

            for (int j = 0; j < columns; j++) {
                if (j == extractedColumn) {
                    columnCoef++;
                }
                data[i][j] = baseMatrix.data[i + rowCoef][j + columnCoef];
            }
        }
    }

    public long getDeterminant() {
        if (!this.isSquare()) {
            System.out.println("Матрица не является квадратной");
            return Long.MIN_VALUE;
        }

        if (rows == 1) {
            return data[0][0];
        }

        long determinant = 0;

        for (int i = 0; i < data[0].length; i++) {
            Matrix subMatrix = new Matrix(0, i, this);

            if (subMatrix.getData().length > 1) {
                determinant += Math.pow(-1, i) * data[0][i] * subMatrix.getDeterminant();
            } else {
                determinant += Math.pow(-1, i) * data[0][i] * subMatrix.data[0][0];
            }
        }

        return determinant;
    }

    public int[][] getData() {
        return data;
    }

    public boolean isSquare() {
        return (rows == columns);
    }
}
