package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = new int[][]{{3, 0, 8, 4},
                                    {2, 4, 5, 7},
                                    {9, 2, 6, 3},
                                    {0, 3, 1, 0}};
        System.out.println(getMaxFloors(city));

    }

    static int getMaxFloors(int[][] city) {
        int flatCounters = 0;

        for (int[] ints : city) {
            int rowMax = 0;
            int limitHeight;

            for (int anInt : ints) {
                if (anInt > rowMax) {
                    rowMax = anInt;
                }
            }

            for (int j = 0; j < ints.length; j++) {
                int columnMax = 0;

                for (int[] value : city) {
                    if (value[j] > columnMax) {
                        columnMax = value[j];
                    }
                }
                limitHeight = Math.min(rowMax, columnMax);
                flatCounters = flatCounters + (limitHeight - ints[j]);
            }
        }
        return flatCounters;
    }
}