package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {

    }

    static int getMaxFloors(int[][] city) {
        int[] maxLine = new int[city.length];
        int[] maxRow = new int[city.length];
        int maxNewFloor = 0;

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city.length; j++) {
                if (city[i][j] > maxLine[i]) {
                    maxLine[i] = city[i][j];
                }
                if (city[i][j] > maxRow[j]) {
                    maxRow[j] = city[i][j];
                }
            }
        }
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city.length; j++) {
                if (city[i][j] < maxLine[i] && city[i][j] < maxRow[j]) {
                    maxNewFloor += Math.min(maxLine[i], maxRow[j]) - city[i][j];
                }
            }
        }
        return maxNewFloor;
    }
}