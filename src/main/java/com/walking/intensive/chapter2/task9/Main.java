package com.walking.intensive.chapter2.task9;


public class Main {
    public static void main(String[] args) {
        createTriangle(10);
    }

    public static void createTriangle(int n) {

        int[][] triangle = createNumberTriangle(n);
        String[] stringTriangle = createStringTriangle(triangle);

        int longestStringLength = stringTriangle[n - 1].length();


        for (int i = 0; i < n; i++) {

            int spaceCount = (longestStringLength - stringTriangle[i].length()) / 2;

            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            System.out.println(stringTriangle[i]);
        }

    }

    public static int[][] createNumberTriangle(int n) {

        int[][] triangle = new int[n][n];


        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[0].length; j++) {
                if (j > i) {
                    break;
                } else if (i == j || j == 0) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        return triangle;
    }

    public static String[] createStringTriangle(int[][] triangle) {

        String[] stringTriangle = new String[triangle.length];

        for (int i = 0; i < triangle.length; i++) {

            stringTriangle[i] = "";

            for (int j = 0; j < triangle[0].length; j++) {
                if (j > i) {
                    break;
                }

                stringTriangle[i] += triangle[i][j] + " ";
            }

            stringTriangle[i] = stringTriangle[i].trim();
        }

        return stringTriangle;
    }
}