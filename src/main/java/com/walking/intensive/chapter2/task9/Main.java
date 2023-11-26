package com.walking.intensive.chapter2.task9;

public class Main {
    public static void main(String[] args) {
        createTriangle(5);
    }

    public static void createTriangle(int n) {

        int[][] triangle = new int[n + 1][n + 1];

        for (int i = 0; i < triangle.length; i++) {

            for (int j = i; j < triangle.length; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < triangle[0].length; j++) {
                if (j > i) {
                    break;
                } else if (i == j || j == 0) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }

            System.out.println();
        }
    }
}