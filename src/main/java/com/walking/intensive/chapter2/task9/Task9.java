package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(15));
    }

    static String getPascalTriangle(int n) {
        StringBuilder sb = new StringBuilder();
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
        String stringResult = "";
        String strMaxLength = "";
        String strCurrent = "";
        for (int i = 0; i <= n; i++) {
            strMaxLength = sb.append(arrayMy[n][i]).append(" ").toString();
        }
        sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            while (j <= i) {
                strCurrent += arrayMy[i][j] + " ";
                j++;
            }
            int lengthCurrentStr = (strMaxLength.length() - strCurrent.length()) / 2;
            for (int k = 0; k <= lengthCurrentStr + 1; k++) {
                strCurrent = " ".concat(strCurrent);
            }
            stringResult = sb.append(strCurrent).append("\n").toString();
            strCurrent = "";
            j = 0;
        }
        return stringResult;
    }
}