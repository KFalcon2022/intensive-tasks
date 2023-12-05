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
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int x = (queries[i][0]);
            int y = (queries[i][1]);
            int raduis = (queries[i][2]);

            int temp = 0;
            for (int j = 0; j < points.length; j++) {
                if (Math.abs(x- points[j][0]) <= raduis && Math.abs(y - points[j][1]) <= raduis) {
                    temp++;
                }
            }
            result[i] = temp;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}