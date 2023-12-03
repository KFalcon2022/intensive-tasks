package com.walking.intensive.chapter3.task15;

import java.lang.reflect.Array;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] mass = new int[][]{{1, 1, 3}, {1, 10, 1}, {1, 1, 1}};
        System.out.println(getMaxFloors(mass));
    }

    static int getMaxFloors(int[][] city) {
        int[] maxHouseInRow = getMaxHouseInRow(city);
        int[] maxHouseInCol = getMaxHouseInCol(city);
        int sumPossibleFloors = 0;
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                int floorBoundary = Math.min(maxHouseInRow[i], maxHouseInCol[j]);
                sumPossibleFloors += Math.max(floorBoundary - city[i][j], 0);
            }
        }
        return sumPossibleFloors;
    }

    static int[] getMaxHouseInRow(int[][] city) {
        int[] maxInRow = new int[city.length];
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                maxInRow[i] = Math.max(maxInRow[i], city[i][j]);
            }
        }
        return maxInRow;
    }

    static int[] getMaxHouseInCol(int[][] city) {
        int[] maxInCol = new int[city[0].length];
        for (int[] ints : city) {
            for (int j = 0; j < ints.length; j++) {
                maxInCol[j] = Math.max(maxInCol[j], ints[j]);
            }
        }
        return maxInCol;
    }
}