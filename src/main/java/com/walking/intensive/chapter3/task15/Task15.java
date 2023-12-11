package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city1 = {
                {2, 1},
                {1, 3}};
        int[][] city2 = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}};
        System.out.println(getMaxFloors(city1));
        System.out.println(getMaxFloors(city2));
    }

    static int getMaxFloors(int[][] city) {
        int ribLength = city.length;
        int[] maxInRows = new int[ribLength];
        int[] maxInColumns = new int[ribLength];

        for (int i = 0; i < ribLength; i++) {
            for (int j = 0; j < ribLength; j++) {
                maxInRows[i] = Math.max(maxInRows[i], city[i][j]);
                maxInColumns[j] = Math.max(maxInColumns[j], city[i][j]);
            }
        }
        int totalIncrease = 0;

        for (int i = 0; i < ribLength; i++) {
            for (int j = 0; j < ribLength; j++) {
                int maxHeight = Math.min(maxInRows[i], maxInColumns[j]);
                totalIncrease += maxHeight - city[i][j];
            }
        }

        return totalIncrease;
    }
}