package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int[][] queries = {{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}};
//        int[] answer = {3, 2, 2};

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
        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            for (int p = 0; p < points.length; p++) {
                if (Math.sqrt(Math.pow((points[p][0] - queries[q][0]), 2) +
                              Math.pow((points[p][1] - queries[q][1]), 2)) <= queries[q][2]) {
                    answer[q]++;
                }
            }
        }

        return answer;
    }
}