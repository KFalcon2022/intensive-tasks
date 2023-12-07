package com.walking.intensive.chapter3.task14;

import java.util.Arrays;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}};
        int[][] queries = {{4, 3, 2}, {4, 3, 3}};

        System.out.println(Arrays.toString(getCountOfPoints(points, queries)));
    }

    static int[] getCountOfPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int j = 0; j < queries.length; j++) { // Для каждой окружности
            for (int i = 0; i < points.length; i++) { // Проверяем все точки
                if (Math.sqrt(Math.pow((points[i][0] - queries[j][0]), 2) + Math.pow((points[i][1] - queries[j][1]), 2)) <= queries[j][2]) {
                    answer[j]++; // Если расстояние между точкой и центром окружности меньше или равен радиусу, то точка внутри окружности, счётчик +1
                }
            }
        }

        return answer;
    }
}