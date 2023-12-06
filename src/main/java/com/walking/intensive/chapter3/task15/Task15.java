package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {

        int[][] city = {{3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}};

        System.out.println(getMaxFloors(city));
    }

    static int getMaxFloors(int[][] city) {

        int[] skylineNorthOrSouth = new int[city.length];
        for (int i = 0; i < city.length; i++) {
            for (int[] ints : city) {
                if (ints[i] > skylineNorthOrSouth[i]) {
                    skylineNorthOrSouth[i] = ints[i];
                }
            }
        }

        int[] skylineEastOrWest = new int[city.length];
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city.length; j++) {
                if (city[i][j] > skylineEastOrWest[i]) {
                    skylineEastOrWest[i] = city[i][j];
                }
            }
        }

        int maxFloors = 0;
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city.length; j++) {
                int floorMaxLevel = Math.min(skylineNorthOrSouth[j], skylineEastOrWest[i]);
                if (city[i][j] < floorMaxLevel) {
                    maxFloors += floorMaxLevel - city[i][j];
                }
            }
        }
        return maxFloors;
    }
}