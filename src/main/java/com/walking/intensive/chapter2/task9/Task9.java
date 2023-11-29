package com.walking.intensive.chapter2.task9;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-pascalTriangle.html">ссылка</a>
 */
public class Task9 {
    public static void main(String[] args) {
        getPascalTriangle(30);
    }

    static String getPascalTriangle(int n) {
        Integer[][] pascalArray = new Integer[n][n];
        String[] pascalArrayString = new String[n];
        pascalArray[0][0] = 1;
        pascalArrayString[0] = pascalArray[0][0].toString();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascalArray[i][j] = 1;
                } else {
                    pascalArray[i][j] = pascalArray[i - 1][j - 1] + pascalArray[i - 1][j];
                }
            }
            pascalArrayString[i] = Arrays.stream(pascalArray[i])
                    .filter(t -> t != null)
                    .map(Object::toString)
                    .collect(Collectors.joining(" "));
        }
        for (int i = 0; i < n; i++) {
            String whitespaceString = " ";
            int whitespaceCount = (pascalArrayString[n - 1].length() - pascalArrayString[i].length()) / 2;
            pascalArrayString[i] = String.join("", Collections.nCopies(whitespaceCount, whitespaceString)) + pascalArrayString[i];
            System.out.println(pascalArrayString[i]);
        }
        return null;
    }
}