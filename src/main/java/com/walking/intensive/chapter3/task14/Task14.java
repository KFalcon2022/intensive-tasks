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

                if (isTheoremTrue(points[j], queries[i]) == true) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    static boolean isTheoremTrue(int[] point, int[] query) {
        return (Math.pow((point[0] - query[0]), 2) + Math.pow((point[1] - query[1]), 2)) <= Math.pow(query[2], 2);
    }
}
