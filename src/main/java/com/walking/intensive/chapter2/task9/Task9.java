package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(15));
    }

    static String getPascalTriangle(int n) {
        int[][] arrayMy = new int[n + 1][n + 1];
        int j = 0;
        for (int i = 0; i <= n; i++) {
            while (j <= i) {
                if (j == 0 || j == i) {
                    arrayMy[i][j] = 1;
                } else {
                    arrayMy[i][j] = arrayMy[i - 1][j] + arrayMy[i - 1][j - 1];
                }
                j++;
            }
            j = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(arrayMy[n][i]).append(" ");
        }
        int maxLengthCurrentString = sb.length() - 1;
        sb = new StringBuilder();
        StringBuilder resStrBuild = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= i; k++) {
                sb.append(arrayMy[i][k]);
                if (k < i) {
                    sb.append(" ");
                }
            }
            int lengthCurrentStr = (maxLengthCurrentString - sb.length()) / 2;
            resStrBuild.append(" ".repeat(lengthCurrentStr)).append(sb).append("\n");
            sb.setLength(0);
        }
        return resStrBuild.toString();
    }
}