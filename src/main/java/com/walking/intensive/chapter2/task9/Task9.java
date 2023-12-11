package com.walking.intensive.chapter2.task9;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(getPascalTriangle(25));
    }

    static String getPascalTriangle(int n) {
        //№ строки(i) == количеству элементов(j).
        //C[i, j] = C[i-1, j-1] + C[i-1, j];
        StringBuilder resultString = new StringBuilder();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            long element_ij = 1;

            resultString.append(element_ij);
            for (int j = 1; j <= i; j++) {
                element_ij *= (i - j + 1);
                element_ij /= j;
                resultString.append(" ").append(element_ij);
            }
            strings[i] = String.valueOf(resultString);
            resultString.setLength(0);
        }
        int whitespace;
        for (int i = 0; i < n; i++) {
            whitespace = ((strings[n - 1].length() - strings[i].length()) / 2);
            strings[i] = " ".repeat(whitespace) + strings[i];
        }
        Arrays.stream(strings).forEach((e) -> resultString.append(e + "\n"));

        return String.valueOf(resultString);
    }
}