package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        int[] answer = {3, 2, 2};

        System.out.println(Arrays.toString(getCountOfPoints(points, queries)) + " answer is " + Arrays.toString(answer));
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
            int xСircle = (queries[i][0]);
            int yСircle = (queries[i][1]);
            int radius = (queries[i][2]);
            int count = 0;
            
            for (int j = 0; j < points.length; j++) {
                double lineLength = Math.sqrt(Math.pow((points[j][0] - xСircle), 2) + Math.pow((points[j][1] - yСircle), 2));
                if (lineLength <= radius) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }
}
