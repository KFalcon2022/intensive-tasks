package com.walking.intensive.chapter3.task15;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-City.html">ГОРОД</a>
 */
public class Task15 {
    public static void main(String[] args) {
        int[][] city = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        System.out.println(getMaxFloors(city));
    }

    static int getMaxFloors(int[][] city) {

        int addedFloors = 0;

        for (int i = 0; i < city.length; i++) {

            // Поиск максимальной высоты в горизонтали I.
            int maxHeightInLine = 0;

            for (int m = 0; m < city[i].length; m++) {
                maxHeightInLine = Math.max(city[i][m], maxHeightInLine);
            }
            // Поиск максимальной высоты по каждой вертикали J и обработка каждого дома на пересечении горизонтали I и вертикали J.
            for (int j = 0; j < city[i].length; j++) {

                int maxHeightInColumn = 0;

                for (int n = 0; n < city.length; n++) {
                    maxHeightInColumn = Math.max(city[n][j], maxHeightInColumn);
                }

                addedFloors += Math.min(maxHeightInLine, maxHeightInColumn) - city[i][j];
            }
        }
        return addedFloors;
    }
}