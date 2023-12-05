package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {

        int[][] points = {{2, 3},
                {4, 3},
                {4, 4},
                {5, 3},
                {6, 3},
                {7, 3},
                {8, 3},
                {9, 3},
                {7, 4},
                {8, 4},
                {9, 4},
                {7, 2},
                {8, 2},
                {9, 2}};

        int[][] queries = {{2, 3, 1},
                {4, 3, 1},
                {9, 3, 2}};

        System.out.println(Arrays.toString(getCountOfPoints(points, queries)));
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

        for (int i = 0; i < queries.length; i++) {
            for (int[] point : points) {

                int[] query = {queries[i][0], queries[i][1]};

                if (getDistanceToCircleCenter(point, query) <= queries[i][2]) {
                    countOfPoints[i] += 1;
                }
            }
        }
        return countOfPoints;
    }

    public static double getDistanceToCircleCenter(int[] point, int[] query) {
        return Math.sqrt((Math.pow(Math.abs(point[0] - query[0]), 2) + Math.pow(Math.abs(point[1] - query[1]), 2)));
    }
}