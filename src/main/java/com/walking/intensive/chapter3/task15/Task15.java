package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {

        int[][] city2 = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };

//        int[][] city1 = {
//                  {2, 1},
//                  {1, 3}
//        };

        System.out.println(getMaxFloors(city2));
    }

    static int getMaxFloors(int[][] city) {
        int[][] maxSkyline = getSkyline(city);
        int[] maxFloorWest = maxSkyline[0];
        int[] maxFloorSouth = maxSkyline[1];
        int sumFloor = 0;

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                int minUpLevel = Math.min(maxFloorWest[i], maxFloorSouth[j]);
                if (city[i][j] < minUpLevel) {
                    sumFloor += minUpLevel - city[i][j];
                }
            }
        }

        return sumFloor;
    }

    public static int[][] getSkyline(int[][] city) {
        int maxSubArray = 0;
        for (int[] subArray : city) {
            int temp = subArray.length;
            if (maxSubArray < temp) {
                maxSubArray = temp;
            }
        }
        int[][] arraySkyline = new int[2][];
        arraySkyline[0] = new int[city.length];
        arraySkyline[1] = new int[maxSubArray];

        for(int i = 0; i < city.length; i++) {
            for(int j = 0; j < city[i].length; j++) {
                int temp = city[i][j];
                if (arraySkyline[0][i] < temp) {
                    arraySkyline[0][i] = temp;
                }
                if (arraySkyline[1][j] < temp) {
                    arraySkyline[1][j] = temp;
                }
            }
        }

        return arraySkyline;
    }
}
