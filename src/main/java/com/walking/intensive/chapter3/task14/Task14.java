package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        System.out.println(Arrays.toString(getCountOfPoints(points, queries)));
    }

    static int[] getCountOfPoints(int[][] points, int[][] queries) {
        int[] countOfPoints = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int capacityOneCircle = 0;

            for (int[] point : points) {
                int lengthAxisX = point[0] - queries[i][0];
                int lengthAxisY = point[1] - queries[i][1];
                int radius = queries[i][2];

                if (Math.pow(lengthAxisX, 2) + Math.pow(lengthAxisY, 2) <= Math.pow(radius, 2)) {
                    capacityOneCircle++;
                }
            }

            countOfPoints[i] = capacityOneCircle;
        }

        return countOfPoints;
    }
}