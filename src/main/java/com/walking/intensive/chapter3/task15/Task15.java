package com.walking.intensive.chapter3.task15;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = {{2, 1}, {1, 3}};
        System.out.println(getMaxFloors(city));
    }

    static int getMaxFloors(int[][] city) {
        if (city.length < 2) {
            System.out.println("Город слишком мал");
            return -1;
        }

        for (int[] cities: city) {
            if (cities.length != city.length) {
                System.out.println("У нас таких городов не бывает");
                return -1;
            }
        }

        int maxFloors = 0;
        int[] maxFloorColumn = getMaxFloorColumn(city);
        int[] maxFloorRaw = getMaxFloorRaw(city);

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city.length; j++) {
                if (city[i][j] == maxFloorColumn[j] || city[i][j] == maxFloorRaw[i]) {
                    continue;
                }

                maxFloors += Math.min(maxFloorColumn[j], maxFloorRaw[i]) - city[i][j];
            }
        }

        return maxFloors;
    }

    static int[] getMaxFloorColumn (int[][] city) {
        int[] maxFloorColumn = new int[city.length];

        for (int i = 0; i < city.length; i++) {
            for (int[] ints : city) {
                maxFloorColumn[i] = Math.max(maxFloorColumn[i], ints[i]);
            }
        }

        return  maxFloorColumn;
    }

    static int[] getMaxFloorRaw (int[][] city) {
        int[] maxFloorRaw = new int[city.length];

        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city.length; j++) {
                maxFloorRaw[i] = Math.max(maxFloorRaw[i], city[i][j]);
            }
        }

        return  maxFloorRaw;
    }
}