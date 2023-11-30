package com.walking.intensive.chapter2.task9;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = sc.nextInt();

        System.out.println(printPascalTriangle(n));
    }

    public static String printPascalTriangle(int n) {
        int[][] triangle = getPascalNumbers(n);
        int quantityWhiteSpaces = triangle.length;
        String whiteSpace = " ";
        String answer = "";

        for (int i = 0; i < triangle.length; i++) {
            answer += whiteSpace.repeat(quantityWhiteSpaces);

            for (int j = 0; j < triangle[i].length; j++) {

                if (triangle[i][j] == 0) {
                    answer += "";
                } else {
                    answer += triangle[i][j] + whiteSpace;
                }
            }
            quantityWhiteSpaces--;
            answer += "\n";
        }
        return answer;
    }

    private static int[][] getPascalNumbers(int n) {
        int[][] triangle = new int[n][n * 2];

        for (int i = 0; i < triangle.length; i++) {

            for (int j = 0; j < triangle[i].length; j++) {

                if (i == 0 && j == 0 || j == 0) {
                    triangle[i][j] = 1;
                } else if (i == 0 && j != 0) {
                    triangle[i][j] = 0;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
        return triangle;
    }
}