package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        //System.out.println(getPascalTriangle(10));
    }

    static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    static int getNextNumberOfTriangle (int row, int column) {
        return getFactorial(row) / (getFactorial (row - column) * getFactorial(column));
        //https://cf.ppt-online.org/files1/slide/t/TryEkBvHFfmAN2cX5UlqMeazhWgYJQx7n4Pp18IKC/slide-17.jpg
        //https://cf2.ppt-online.org/files2/slide/j/JSMbARr8WZNUaxmTz6E1HfOosFcqt94ik3vBwnC5j/slide-2.jpg
    }

    static String getSpaces (int n) {
        String spaces = "";
        for (int i = 0; i < (n); i++) {
            spaces += " ";
        }
        return spaces;
    }

    static String getARow (int n) {
        String aRow = "";
        for (int i = 0; i <= n; i++) {
            aRow += Integer.toString(getNextNumberOfTriangle(n , i)) + " ";
        }
        return aRow;
    }

    static String getPascalTriangle(int n){
        // Ваш код
        String pascalTriangle = "";
        for (int i = 0; i <= n; i++) {
            pascalTriangle += getSpaces((getARow(n).length() - getARow(i).length()) / 2) + getARow(i) + getSpaces((getARow(n).length() - getARow(i).length())) + "\n";
            }
        return pascalTriangle;
    }
}