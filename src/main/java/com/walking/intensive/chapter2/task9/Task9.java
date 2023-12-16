package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        printPascalTriangle(getPascalTriangle(22));
    }

    static String[][] getPascalTriangle(int n) {
        int rowsLength = n * 2 - 1;
        String[][] pascalTriangleNumbers = new String[n][rowsLength];

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < rowsLength; k++) {
                pascalTriangleNumbers[i][k] = "0";

                if (i == 0) {
                    if (k == n - 1) {
                        pascalTriangleNumbers[i][k] = "1";
                    }
                } else {
                    pascalTriangleNumbers[i][k] = "0";
                    if (k > 0 && k < rowsLength - 1) {
                        pascalTriangleNumbers[i][k] = String.valueOf(Integer.parseInt(pascalTriangleNumbers[i - 1][k - 1]) + Integer.parseInt(pascalTriangleNumbers[i - 1][k + 1]));
                    }
                }

                if (i == n - 1) {
                    pascalTriangleNumbers[i][0] = "1";
                    pascalTriangleNumbers[i][rowsLength - 1] = "1";
                }
            }
        }

        return pascalTriangleNumbers;
    }

    static void printPascalTriangle(String[][] pascalTriangle) {

        for (int i = 0; i < pascalTriangle.length; i++) {

            for (int k = 0; k < pascalTriangle[i].length; k++) {
                if (pascalTriangle[i][k].equals("0")) {
                    System.out.print(" ");
                } else {
                    System.out.print(pascalTriangle[i][k]);
                }
            }

            System.out.println();
        }
    }
}
