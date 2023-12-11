package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(getPascalTriangle(n));
    }

    static String getPascalTriangle(int n) {
        if (n <= 0) {
            return "n должно быть натуральным числом";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int lastLength = getTriangleString(n).length();
            int currentLength = getTriangleString(i).length();

            result.append(" ".repeat(Math.max(0, (lastLength - 1 - currentLength) / 2)));
            result.append(getTriangleString(i)).append("\n");
        }

        return result.toString();
    }

    static String getTriangleString(int n) {
        StringBuilder triangleString = new StringBuilder(" ");
        int number = 1;

        for (int i = 0; i < n; i++) {
            triangleString.append(number).append(" ");
            number = number * (n - 1 - i) / (i + 1);
        }

        return triangleString.toString();
    }
}