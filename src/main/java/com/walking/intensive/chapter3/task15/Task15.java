package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {

    }

    static int getMaxFloors(int[][] city) {
        int[] rowMax = new int[city.length];
        int[] colMax = new int[city.length];

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city.length; j++) {
                rowMax[i] = Math.max(rowMax[i], city[i][j]);
                colMax[j] = Math.max(colMax[j], city[i][j]);
            }
        }

        int maxFloors = 0;
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city.length; j++) {
                maxFloors += Math.min(rowMax[i], colMax[j]) - city[i][j];
            }
        }

        return maxFloors;
    }
}