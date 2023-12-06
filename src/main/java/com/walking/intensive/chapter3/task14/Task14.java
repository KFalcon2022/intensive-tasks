package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCountOfPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}, new int[][] {{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}})));
    }

    /**
     * Расчет количества точек попавших в каждую окружность.
     *
     * @param points  массив с координатами точек
     * @param queries массив с координатами центра и радиусом окружностей
     * @return массив с количеством точек внутри окружностей
     */
    static int[] getCountOfPoints(int[][] points, int[][] queries) {
       int [] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int[] point : points) {
                if (Math.sqrt(Math.pow(point[0] - queries[i][0], 2) + Math.pow(point[1] - queries[i][1], 2)) <= queries[i][2]) {
                    count++;
                }
            }
            answer [i] = count;
        }
        // Ваш код
        return answer;
    }
}