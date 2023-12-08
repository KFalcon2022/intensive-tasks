package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};

        System.out.println(getMaxFloors(city));;
    }

    static int getMaxFloors(int[][] city) {
        int maxFloors = 0;
        int minFloorBoundary; // минимальное значение среди max значения в строке и в столбце для определенного (i,j)

        for (int[] ints : city) {
            for (int j = 0; j < city.length; j++) {
                minFloorBoundary = Math.min(getMaxFloorInRow(city, j), getMaxFloorInColumn(ints));
                if (ints[j] < minFloorBoundary)
                    maxFloors += minFloorBoundary - ints[j];
            }
        }

        return maxFloors;
    }

    static int getMaxFloorInRow(int[][] city, int index) {
        int maxFloorInRow = 0;

        for (int[] ints : city) {
            if (maxFloorInRow < ints[index])
                maxFloorInRow = ints[index];
        }

        return maxFloorInRow;
    }

    static int getMaxFloorInColumn(int[] city) {
        int maxFloorInColumn = 0;

        for (int j : city) {
            if (maxFloorInColumn < j)
                maxFloorInColumn = j;
        }

        return maxFloorInColumn;
    }
}