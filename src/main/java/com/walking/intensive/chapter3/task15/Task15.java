package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        System.out.println(getMaxFloors(new int[][]{{2, 3, 2, 3, 5}, {7, 4, 1, 5, 9}, {4, 5, 5, 2, 6}, {6, 9, 8, 5, 3}, {8, 9, 8, 7, 5}}));
        System.out.println(getMaxFloors(new int[][]{{0, 58}, {58, 3}}));
        System.out.println(getMaxFloors(new int[][]{{0, 58, 15}, {58, 3, 12}, {22, 10, 45}}));
    }

    static int getMaxFloors(int[][] city) {
        int heightNorthLine = 0;
        int heightSouthLine = 0;
        int heightWestLine = 0;
        int heightEastLine = 0;

        for (int i = 0; i < city.length; i++) {
            if (city[0][i] > heightNorthLine) {
                heightNorthLine = city[0][i];
            }
            if (city[city.length - 1][i] > heightSouthLine) {
                heightSouthLine = city[city.length - 1][i];
            }
            if (city[i][0] > heightEastLine) {
                heightEastLine = city[i][0];
            }
            if (city[i][city.length - 1] > heightWestLine) {
                heightWestLine = city[i][city.length - 1];
            }
        }

        int maxFloors = (Math.min(heightNorthLine, heightWestLine) - city[0][0]) + (Math.min(heightNorthLine, heightEastLine) - city[0][city.length - 1]) + (Math.min(heightSouthLine, heightWestLine) - city[city.length - 1][city.length - 1]) + (Math.min(heightSouthLine, heightEastLine) - city[city.length - 1][0]);

        for (int i = 1; i < city.length - 1; i++) {
            if (city[0][i] < heightNorthLine) {
                maxFloors += heightNorthLine - city[0][i];
            }
            if (city[city.length - 1][i] < heightSouthLine) {
                maxFloors += heightSouthLine - city[city.length - 1][i];
            }
            if (city[i][0] < heightEastLine) {
                maxFloors += heightEastLine - city[i][0];
            }
            if (city[i][city.length - 1] < heightWestLine) {
                maxFloors += heightWestLine - city[i][city.length - 1];
            }
        }
        return maxFloors;
    }
}