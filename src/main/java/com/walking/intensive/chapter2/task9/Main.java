package com.walking.intensive.chapter2.task9;


public class Main {
    public static void main(String[] args) {
        createTriangle(10);
    }

    public static void createTriangle(int n) {

        int[][] triangle = createNumberTriangle(n);
        String lastString = "";

        for (int j = 0; j <= n - 1; j++) {
            lastString += triangle[n - 1][j] + " ";
        }


        for (int i = 0; i < triangle.length; i++) {

            for (int j = i; j <= (lastString.length()) / 2; j++) {
                System.out.print(" ");
            }

            if (String.valueOf(triangle[i][n / 2]).length() < 2) {
                System.out.print("  ");

            }else if (String.valueOf(triangle[i][n / 2]).length() < 3) {
                System.out.print(" ");
            }

            for (int j = 0; j < triangle[0].length; j++) {
                if (j > i) {
                    break;
                }
                System.out.print(triangle[i][j] + " ");
            }

            System.out.println();
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
}