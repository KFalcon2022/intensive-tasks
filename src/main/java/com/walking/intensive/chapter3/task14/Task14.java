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

    /**
     * Расчет количества точек попавших в каждую окружность.
     *
     * @param points  массив с координатами точек
     * @param queries массив с координатами центра и радиусом окружностей
     * @return массив с количеством точек внутри окружностей
     */
    static int[] getCountOfPoints(int[][] points, int[][] queries) {

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (isPointBelongsToCircle(points[j], queries[i])) {
                    result[i] += 1;
                }
            }
        }

        return result;
    }

    static boolean isPointBelongsToCircle(int[] pointCoordinates, int[] circleParameters) {
        if (Math.sqrt((Math.pow(pointCoordinates[0] - circleParameters[0], 2)) + Math.pow(pointCoordinates[1] - circleParameters[1], 2)) <= circleParameters[2]) {
            return true;
        }

        return false;
    }
}