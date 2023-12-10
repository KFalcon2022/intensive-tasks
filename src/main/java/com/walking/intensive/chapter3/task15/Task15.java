package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {

    }

    static int getMaxFloors(int[][] city) {
        int[] maxFloorsRows = new int[city.length];

        for (int r = 0; r < maxFloorsRows.length; r++) {

            for (int c = 0; c < city.length; c++) {

                if (city[r][c] > maxFloorsRows[r]) {
                    maxFloorsRows[r] = city[r][c];
                }
            }
        }

        int[] maxFloorsColumns = new int[city.length];

        for (int c = 0; c < maxFloorsColumns.length; c++) {

            for (int r = 0; r < city.length; r++) {

                if (city[r][c] > maxFloorsColumns[c]) {
                    maxFloorsColumns[c] = city[r][c];
                }
            }
        }

        int maxFloors = 0;

        for (int r = 0; r < city.length; r++) {

            for (int c = 0; c < city.length; c++) {
                maxFloors += Math.min(maxFloorsRows[r], maxFloorsColumns[c]) - city[r][c];
            }
        }

        return maxFloors;
    }
}