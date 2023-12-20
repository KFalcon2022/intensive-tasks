package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        printPascalTriangle(getPascalTriangle(56));
    }

    static String[][] getPascalTriangle(int n) {
        int rowsLength = n * 2;
        String[][] pascalTriangleNumbers = new String[n][rowsLength];

        for (int i = 0; i < n; i++) {
            pascalTriangleNumbers[i][rowsLength - 1] = "0";  // Последний элемент массива, который содержит информацию о длине всех элементов в массиве

            for (int k = 0; k < rowsLength - 1; k++) {
                pascalTriangleNumbers[i][k] = "0";

                if (i == 0) {
                    if (k == n - 1) {
                        pascalTriangleNumbers[i][k] = "1";

                    }
                } else {
                    pascalTriangleNumbers[i][k] = "0";
                    if (k > 0 && k < rowsLength - 2) {
                        pascalTriangleNumbers[i][k] = String.valueOf(Integer.parseInt(pascalTriangleNumbers[i - 1][k - 1]) + Integer.parseInt(pascalTriangleNumbers[i - 1][k + 1]));
                    }
                }
                pascalTriangleNumbers[i][rowsLength - 1] = String.valueOf(Integer.parseInt(pascalTriangleNumbers[i][rowsLength - 1]) + pascalTriangleNumbers[i][k].length());
            }

            if (i == n - 1) {
                pascalTriangleNumbers[i][0] = "1";
                pascalTriangleNumbers[i][rowsLength - 2] = "1";
            }

        }

        return pascalTriangleNumbers;
    }

    static void printPascalTriangle(String[][] pascalTriangle) {
        int pascalTriangleLength = pascalTriangle.length;

        if (pascalTriangleLength > 0 && pascalTriangle[pascalTriangleLength - 1].length > 0) {
            int maximumLength = Integer.parseInt(pascalTriangle[pascalTriangleLength - 1][pascalTriangleLength * 2 - 1]);

            for (String[] strings : pascalTriangle) {

                for (int j = 0; j < (maximumLength - Integer.parseInt(strings[pascalTriangleLength * 2 - 1])) / 2; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < strings.length - 1; k++) {
                    if (strings[k].equals("0")) {
                        System.out.print(" ");
                    } else {
                        System.out.print(strings[k]);
                    }
                }

                System.out.println();
            }
        } else System.out.println("Треугольник пустой");
    }
}


