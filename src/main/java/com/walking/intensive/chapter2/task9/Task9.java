package com.walking.intensive.chapter2.task9;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {


    }

    static String getPascalTriangle(int n) {
        String result = "";
        String baseOfTriangle = "";
        for (int j = 0; j <= n; j++) {
            baseOfTriangle += (getFactorial(n)) / (getFactorial(j) * getFactorial(n - j)) + " ";
        }

        for (int i = 0; i < n; i++) {
            String currentLine = "";
            for (int j = 0; j <= i; j++) {
                currentLine += (getFactorial(i)) / (getFactorial(j) * getFactorial(i - j)) + " ";
            }
            for (int s = 0; s < ((baseOfTriangle.length() - currentLine.length()) / 2); s++) {
                result += " ";
            }
            result += currentLine + "\n";
        }
        result += baseOfTriangle;
        return result;
    }

    static long getFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}