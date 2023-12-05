package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points_1 = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries_1 = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        int[][] points_2 = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int[][] queries_2 = {{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}};

        System.out.println(Arrays.toString(getCountOfPoints(points_1, queries_1)));
        System.out.println(Arrays.toString(getCountOfPoints(points_2, queries_2)));
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

        for (int i = 0; i < countOfPoints.length; i++) {

            for (int[] dot : points) {

                if (Math.sqrt(Math.pow(dot[0] - queries[i][0], 2) + Math.pow(dot[1] - queries[i][1], 2)) <= queries[i][2]) {
                    countOfPoints[i]++;
                }
            }
        }
        return countOfPoints;
    }
}