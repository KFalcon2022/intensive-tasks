package com.walking.intensive.chapter3.task15;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = {{3, 0, 8, 4, 2}, {2, 4, 5, 7, 3}, {9, 2, 6, 3, 4}, {0, 3, 1, 0, 7}};

        System.out.printf(Arrays.deepToString(city) + " -> %d\n",
                          getMaxFloors(city));
    }

    static int getMaxFloors(int[][] city) {
        int maxFloors = 0;
        int[] horizontalMax = new int[city.length];
        int[] verticalMax = new int[city[0].length];

        for (int r = 0; r < city.length; r++) {
            for (int c = 0; c < city[0].length; c++) {
                if (horizontalMax[r] < city[r][c]) {
                    horizontalMax[r] = city[r][c];
                }
                if (verticalMax[c] < city[r][c]) {
                    verticalMax[c] = city[r][c];
                }
            }
        }

        for (int r = 0; r < city.length; r++) {
            for (int c = 0; c < city[0].length; c++) {
                int minHV = Math.min(horizontalMax[r], verticalMax[c]);
                if (city[r][c] < minHV) {
                    maxFloors += minHV - city[r][c];
                }
            }
        }

        return maxFloors;
    }
}