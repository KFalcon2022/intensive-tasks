package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] arrayInputPoints = new int[][]{{1, 1}, {1, 2}, {2, 2}, {2, 1}};
        int[][] arrayInputQueries = new int[][]{{3, 2, 1}, {2, 2, 1}, {0, 0, 2}};
        System.out.println(Arrays.toString(getCountOfPoints(arrayInputPoints, arrayInputQueries)));
    }

    static int[] getCountOfPoints(int[][] points, int[][] queries) {
        int[] arrayOutput = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            for (int[] point : points) {
                double xCoordinate = Math.pow((queries[j][0] - point[0]), 2);
                double yCoordinate = Math.pow((queries[j][1] - point[1]), 2);
                if (queries[j][2] >= Math.sqrt(xCoordinate + yCoordinate)) {
                    arrayOutput[j]++;
                }
            }
        }
        return arrayOutput;
    }
}