package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {

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
            int[] query = queries[i];
            for (int[] point : points) {
                int pointX = Math.abs(point[0] - query[0]);
                int pointY = Math.abs(point[1] - query[1]);
                if (Math.sqrt(Math.pow(pointX, 2) + Math.pow(pointY, 2)) <= query[2]) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}