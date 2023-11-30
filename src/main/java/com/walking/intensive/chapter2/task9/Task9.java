package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        int n = 50;

        System.out.println(getPascalTriangle(n));
    }

    static String getPascalTriangle(int n) {
        String pascalTriangle = "";

        for (int i = 0; i < n; i++) {
            int lastStringLength = getTriangleString(n).length();
            int currentStringLength = getTriangleString(i).length();

            for (int spaces = 0; spaces < (lastStringLength - 1 - currentStringLength) / 2; spaces++) {
                pascalTriangle = pascalTriangle + " ";
            }
            pascalTriangle = pascalTriangle + getTriangleString(i) + "\n";
        }
        return pascalTriangle;
    }

    static String getTriangleString(int n) {
        String triangleString = " ";
        long number = 1;

        for (int i = 0; i < n; i++) {
            triangleString = triangleString + number + " ";
            number = number * (n - 1 - i) / (i + 1);
        }
        return triangleString;
    }
}