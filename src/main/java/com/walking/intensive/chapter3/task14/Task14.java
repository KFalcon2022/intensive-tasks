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
        //System.out.print(isBelongPointCircle(new int[]{2, 3}, new int[]{-3, 1, 4}));
    }

    /**
     * Расчет количества точек попавших в каждую окружность.
     *
     * @param points  массив с координатами точек
     * @param queries массив с координатами центра и радиусом окружностей
     * @return массив с количеством точек внутри окружностей
     */
    static private boolean isBelongsPointCircle(int[] point, int[] circle) {
        double distancePoints = Math.sqrt(Math.pow((point[0] - circle[0]), 2) + Math.pow((point[1] - circle[1]), 2));
        return distancePoints <= circle[2];
    }

    static int[] getCountOfPoints(int[][] points, int[][] queries) {
        // Ваш код
        int[] countPoints = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int counter = 0;

            for (int j = 0; j < points.length; j++) {
                if (isBelongsPointCircle(points[j], queries[i])) {
                    counter++;
                }
            }
            countPoints[i] = counter;
        }
        return countPoints;
    }
}