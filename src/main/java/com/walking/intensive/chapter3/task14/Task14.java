package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points_1 = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries_1 = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        System.out.println(Arrays.toString(getCountOfPoints(points_1, queries_1)));
    }

    /**
     * Расчет количества точек попавших в каждую окружность.
     *
     * @param points  массив с координатами точек
     * @param queries массив с координатами центра и радиусом окружностей
     * @return массив с количеством точек внутри окружностей
     */
    static int[] getCountOfPoints(int[][] points, int[][] queries) {
        int[] countOfPoints = new int[queries.length];
        int index = 0;

        for (int[] query : queries
        ) {
            for (int[] point : points
            ) {
                if (isInsidePoint(query, point)) {
                    countOfPoints[index] += 1;
                }
            }

            index++;
        }

        return countOfPoints;
    }

    static boolean isInsidePoint(int[] query, int[] point) {
        if ((query[0] - query[2] <= point[0] && point[0] <= query[0] + query[2]) && (query[1] - query[2] <= point[1] && point[1] <= query[1] + query[2])) {
            int a = Math.abs(query[0] - point[0]);
            int b = Math.abs(query[1] - point[1]);

            return Math.sqrt(a * a + b * b) <= query[2];
        }

        return false;
    }
}