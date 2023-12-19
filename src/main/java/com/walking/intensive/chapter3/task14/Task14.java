package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points_1 = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int[][] queries_1 = {{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}};
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
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int xCenter = queries[i][0];
            int yCenter = queries[i][1];
            int radius = queries[i][2];

            for (int[] point : points) {
                if (isInsideCircle(point, xCenter, yCenter, radius)) {
                    count++;
                }
            }

            answer[i] = count;
        }

        return answer;
    }

    private static boolean isInsideCircle(int[] point, int xCenter, int yCenter, int radius) {
        int dx = point[0] - xCenter;
        int dy = point[1] - yCenter;
        return dx * dx + dy * dy <= radius * radius;
    }
}