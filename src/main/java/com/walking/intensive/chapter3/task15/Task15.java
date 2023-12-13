package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city2 = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        getMaxFloors(city2);
    }

    static int getMaxFloors(int[][] city) {
        int[] alongLimits = new int[city.length];
        int[] acrossLimits = new int[city[0].length];


        for (int i = 0; i < alongLimits.length; i++) {
            int maxAcross = 0, maxAlong = 0;
            for (int j = 0; j < acrossLimits.length; j++) {
                maxAlong = Integer.max(maxAlong, city[i][j]);
                maxAcross = Integer.max(maxAcross, city[j][i]);
            }
            alongLimits[i] = maxAlong;
            acrossLimits[i] = maxAcross;
        }

        int count = 0;

        for (int i = 0; i < alongLimits.length; i++) {
            for (int j = 0; j < acrossLimits.length; j++) {
                int limit = Math.min(acrossLimits[j], alongLimits[i]);
                if (city[i][j] < limit) {
                    count += limit - city[i][j];
                }

            }
        }

        return count;
    }
}