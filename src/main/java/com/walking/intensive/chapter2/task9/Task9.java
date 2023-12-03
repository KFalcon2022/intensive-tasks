package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(25));
    }

    static String getPascalTriangle(int n) {
        String result = String.format("%s", "");
        int maxRowLength = getRow(n).length();

        for (int i = 0; i < n; i++) {
            String row = getRow(i);
            int spacesQuantity = (maxRowLength - row.length()) / 2;
            String spaces = String.format("%" + spacesQuantity + "s", " ");

            result = result.concat(spaces).concat(row).concat("\n");
        }
        return result;
    }

    static String getRow(int rowIndex) {
        long element = 1L; // element(0,0) = 0! / (0! * (0 - 0)!)
        String rowResult = String.format("%d%s", element, " ");

        for (int i = 0; i < rowIndex; i++) {
            element = element * (rowIndex - i) / (i + 1);
            String elementResult = String.format("%d%s", element, " ");

            rowResult = rowResult.concat(elementResult);
        }

        return rowResult;
    }
}