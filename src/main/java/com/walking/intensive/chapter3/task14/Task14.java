package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points_1 = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries_1 = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        int[] answer_1 = {3, 2, 2};
        System.out.println(Arrays.toString(getCountOfPoints(points_1,queries_1)));
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
        Arrays.fill(result, 0);
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < points.length; j++) {
                // (x-x0)^2+(y-y0)^2=r^2
                if ((queries[i][0] - points[j][0]) * (queries[i][0] - points[j][0]) + (queries[i][1] - points[j][1]) * (queries[i][1] - points[j][1]) <= (queries[i][2]) * (queries[i][2])) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}