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


    /**
     * Для нахождения расстояния между центром и каждой точкой, а также для сравнения с радиусом, можно использовать
     * формулу расстояния между двумя точками в пространстве.
     *
     * Формула расстояния между двумя точками (x1, y1, z1) и (x2, y2, z2) в трехмерном пространстве выглядит следующим образом:
     *
     * d = √((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)
     *
     * Где (x1, y1, z1) - координаты центра, (x2, y2, z2) - координаты каждой точки, а d - расстояние между ними.
     *
     * После нахождения расстояния между центром и каждой точкой, можно сравнить его с радиусом. Если расстояние меньше
     * или равно радиусу, то точка находится внутри или на границе окружности. Если расстояние больше радиуса,
     * то точка находится вне окружности.
     *
     * Надеюсь, это поможет вам решить задачу!
     */


}