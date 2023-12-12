package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(14));
    }

    public static int[][] getTriangleArray(int n) {
        int[][] triangleArray = new int[n + 1][(2 * n) + 1];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                triangleArray[i][n - i] = triangleArray[i][n + i] = 1;
                continue;
            }

            for (int j = n - i; j <= n + i; j++) {
                triangleArray[i][j] = triangleArray[i - 1][j - 1] + triangleArray[i - 1][j + 1];
            }
        }
        return triangleArray;
    }


    static String getPascalTriangle(int n) {
        String temp;
        StringBuilder pascalTriangle = new StringBuilder();
        int[][] trianglePascalArray = getTriangleArray(n);

        for (int i = 0; i < n; i++) {
            pascalTriangle.append("\n");

            for (int j = 0; j < n * 2; j++) {
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