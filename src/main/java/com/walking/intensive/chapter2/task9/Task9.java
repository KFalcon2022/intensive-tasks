package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(10));
    }


    static String getPascalTriangle(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result.append(getPascalNum(i, j)).append(" ");
            }
            result.append("\n");
        }
        return centerAlign(result.toString().trim());
    }

    private static String centerAlign(String s) {
        StringBuilder result = new StringBuilder();
        String[] lines = s.split("\n");
        int maxLength = lines[lines.length - 1].length();
        for (String line : lines) {
            int padding = (maxLength - line.length()) / 2;
            result.append(" ".repeat(padding)).append(line).append("\n");
        }
        return result.toString();
    }

    private static int getPascalNum(int row, int col) {
        if (col == 0 || col == row) {
            return 1;
        }
        return getPascalNum(row - 1, col - 1) + getPascalNum(row - 1, col);
    }
}