package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(5));
    }

    public static int[][] getTriangleArray(int n) {
        int[][] triangleArray = new int[n][(2 * n) - 1];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                triangleArray[0][n - 1] = 1;
                continue;
            }
            triangleArray[i][(n - 1) - i] = triangleArray[i][(n - 1) + i] = 1;

            for (int j = ((n - 1) - i) + 2; j <= ((n - 1) + i) - 2; j++) {
                triangleArray[i][j] = triangleArray[i - 1][j - 1] + triangleArray[i - 1][j + 1];
            }
        }

        return triangleArray;
    }

    public static int getRowLength(int[][] triangleArray, int rowNumber) {
        StringBuilder row = new StringBuilder();

        for (int i = 0; i <= (triangleArray[rowNumber].length - 1); i++) {
            row.append(triangleArray[rowNumber][i]);
        }
        return row.length();
    }

    public static StringBuilder getSpaceCompensation(int bottomRowLength, int currentRowLength) {
        StringBuilder spaceCompensation = new StringBuilder();

        for (int i = 1; i <= (bottomRowLength - currentRowLength) / 2; i++) {
            spaceCompensation.append(" ");
        }
        return spaceCompensation;
    }

    static String getPascalTriangle(int n) {
        String temp;
        StringBuilder pascalTriangle = new StringBuilder();
        int[][] trianglePascalArray = getTriangleArray(n);

        for (int i = 0; i <= n - 1; i++) {
            pascalTriangle.append("\n");

            pascalTriangle.append(getSpaceCompensation(getRowLength(trianglePascalArray, n - 1),
                    getRowLength(trianglePascalArray, i)));

            for (int j = 0; j < ((n * 2) - 1); j++) {
                temp = String.valueOf(trianglePascalArray[i][j]);

                if (temp.equals("0")) {
                    temp = " ";
                }
                pascalTriangle.append(temp);
            }
        }

        return pascalTriangle.toString();
    }
}