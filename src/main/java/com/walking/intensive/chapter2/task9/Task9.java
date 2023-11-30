package com.walking.intensive.chapter2.task9;

public class Task9 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(getPascalTriangle(n));
    }

    static String getPascalTriangle(int n) {
        StringBuilder builder = new StringBuilder();
        int maxRowLength = calculateRowWidth(n - 1);
        for (int i = 0; i < n; i++) {
            StringBuilder rowBuilder = new StringBuilder();
            int pascalNumber = 1;
            for (int j = 0; j <= i; j++) {
                if (j > 0) rowBuilder.append(" ");
                rowBuilder.append(pascalNumber);
                pascalNumber = pascalNumber * (i - j) / (j + 1);
            }
            String centeredRow = getCenteredRow(maxRowLength, rowBuilder.toString());
            builder.append(centeredRow).append("\n");
        }
        return builder.toString();
    }

    static String getCenteredRow(int maxRowLength, String row) {
        int paddingSize = (maxRowLength - row.length()) / 2;
        String padding = " ".repeat(paddingSize);
        return padding + row + padding + (maxRowLength % 2 != row.length() % 2 ? " " : "");
    }

    static int calculateRowWidth(int row) {
        int elementValue = 1;
        int width = 1;
        for (int i = 1; i <= row; i++) {
            elementValue = elementValue * (row - i + 1) / i;
            String numberAsString = Integer.toString(elementValue);
            int numberLength = numberAsString.length();
            width += numberLength;
            if (i < row) {
                width += 1;
            }
        }
        return width;
    }
}