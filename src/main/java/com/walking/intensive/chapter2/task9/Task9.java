package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(25));
    }

    static String getPascalTriangle(int n) {
        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int numberTriangle = 1;

            StringBuilder lineTriangle = new StringBuilder();

            for (int j = 1; j <= i; j++) {
                numberTriangle *= (i - j + 1);
                numberTriangle /= j;

                lineTriangle.append(" ").append(numberTriangle);
            }

            int currentLength = lineTriangle.length() + 1;
            int countSpace = (getMaxLength(n) - currentLength) / 2;

            String space = " ";

            triangle.append(space.repeat(countSpace)).append(numberTriangle).append(lineTriangle).append("\n");
        }

        return triangle.toString();
    }

    static int getMaxLength(int n) {
        StringBuilder lastLine = new StringBuilder("1");

        int numberLastLine = 1;

        for (int i = 1; i <= n; i++) {
            numberLastLine *= (n - i + 1);
            numberLastLine /= i;

            lastLine.append(" ").append(numberLastLine);
        }

        return lastLine.length();
    }
}