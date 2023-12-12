package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = {{2, 1}, {1, 3}};
        System.out.println(getMaxFloors(city));
    }

    static int getMaxFloors(int[][] city) {
        int countFloorsBuilt = 0;

        for (int[] blocks : city) {
            for (int i = 0; i < blocks.length; i++) {
                int maxHeightFromNorthToSouth = 0;
                int maxHeightFromWestToEast = 0;

                for (int j = 0; j < city.length; j++) {
                    if (city[j][i] > maxHeightFromNorthToSouth) {
                        maxHeightFromNorthToSouth = city[j][i];
                    }
                    if (blocks[j] > maxHeightFromWestToEast) {
                        maxHeightFromWestToEast = blocks[j];
                    }
                }

                int maxAvailableHeight = Math.min(maxHeightFromWestToEast, maxHeightFromNorthToSouth);

                if (maxAvailableHeight > blocks[i]) {
                    countFloorsBuilt += maxAvailableHeight - blocks[i];
                }
            }
        }

        return countFloorsBuilt;
    }
}