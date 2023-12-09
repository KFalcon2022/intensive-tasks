package com.walking.intensive.chapter3.task15;

public class Main {
    public static void main(String[] args) {

        System.out.println(getMaxFloors(new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}}));

    }

    static int getMaxFloors(int[][] city) {

        if (!isCityValid(city)) {
            return 0;
        }

        int n = city.length;
        int[] maxRow = new int[n]; //Линия горизонта по вертикали
        int[] maxCol = new int[n]; //Линия горизонта по горизонтали

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxRow[i] = Math.max(maxRow[i], city[i][j]);
                maxCol[j] = Math.max(maxCol[j], city[i][j]);
            }
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (city[i][j] < maxRow[i] && city[i][j] < maxCol[j]) {
                    answer += Math.min(maxRow[i] - city[i][j], maxCol[j] - city[i][j]);
                }
            }
        }

        return answer;
    }

    static boolean isCityValid(int[][] city) {
        int n = city.length;

        for (int i = 0; i < n; i++) {
            if (city[i].length != n) {
                return false;
            }
        }
        return true;
    }
}