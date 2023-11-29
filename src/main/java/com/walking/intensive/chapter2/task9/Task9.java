package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {

        System.out.println(getPascalTriangle(20));
    }

    static String getPascalTriangle(int n) {

        StringBuilder maxString = new StringBuilder();
        for (int i = 0; i < n; i++) {

            maxString.append(getFactorial(n - 1) / (getFactorial(i) * getFactorial(n - 1 - i)));
            if (i != n - 1) {
                maxString.append(" ");
            }
        }

        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < n; i++) {

            StringBuilder currentLine = new StringBuilder();
            for (int j = 0; j <= i; j++) {

                currentLine.append(getFactorial(i) / (getFactorial(j) * getFactorial(i - j)));
                if (j != i) {
                    currentLine.append(" ");
                }
            }
            triangle.append(" ".repeat((maxString.length() - currentLine.length()) / 2));
            triangle.append(currentLine);
            triangle.append("\n");
        }
        return triangle.toString();
    }

    public static long getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}