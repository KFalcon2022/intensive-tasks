package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {

        System.out.println(getPascalTriangle(25));
    }

    static String getPascalTriangle(int n) {

        if (n < 1) {
            return "Число должно быть больше 0.";
        }

        if (n == 1) {
            return "1";
        }

        String outputTriangleByOneString = "";
        String[] arrayOfStringNumbers = new String[n];
        int[][] arrayOfNumbers = new int[n][];

        arrayOfStringNumbers[0] = "1";

        for (int i = 1; i < n; i++) {

            arrayOfNumbers[i] = new int[i + 1];
            arrayOfNumbers[i][0] = 1;
            arrayOfNumbers[i][arrayOfNumbers[i].length - 1] = 1;
            arrayOfStringNumbers[i] = "1";

            if (i > 1) {

                for (int j = 1; j < i; j++) {
                    arrayOfNumbers[i][j] = arrayOfNumbers[i - 1][j - 1] + arrayOfNumbers[i - 1][j];
                    arrayOfStringNumbers[i] += " " + arrayOfNumbers[i][j];
                }
            }

            arrayOfStringNumbers[i] += " 1";
        }

        for (int i = 0; i < n - 1; i++) {

            int addedSpace = (arrayOfStringNumbers[n - 1].length() - arrayOfStringNumbers[i].length()) / 2;

            for (int j = 1; j <= addedSpace; j++) {
                arrayOfStringNumbers[i] = " " + arrayOfStringNumbers[i] + " ";
            }

            outputTriangleByOneString += arrayOfStringNumbers[i] + "\n";
        }

        return outputTriangleByOneString + arrayOfStringNumbers[n - 1];
    }
}