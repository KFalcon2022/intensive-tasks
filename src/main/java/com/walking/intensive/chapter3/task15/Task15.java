package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
    }

    static int getMaxFloors(int[][] city) {
        int count = 0;
        for (int i = 0; i < city.length; i++) {

            int[] column = new int[city.length];
            int maxRowValue = getMaxValue(city[i]);

            for (int j = 0; j < city.length; j++) {

                for (int k = 0; k < city.length; k++) {
                    column[k] = city[k][j];
                }

                int maxColumnValue = getMaxValue(column);

                if (city[i][j] < maxRowValue && city[i][j] < maxColumnValue) {
                    count += Math.min(maxRowValue, maxColumnValue) - city[i][j];
                }
            }
        }
        return count;
    }

    public static int getMaxValue(int[] row) {
        int maxValue = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] > maxValue) {
                maxValue = row[i];
            }
        }
        return maxValue;
    }

}