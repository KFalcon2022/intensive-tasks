package com.walking.intensive.chapter3.task14;

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

        for (int j = 0; j < queries.length; j++) {

            int count = 0;
            int centerX = queries[j][0];
            int centerY = queries[j][1];
            int radius = queries[j][2];

            for (int[] point : points) {
                int x = point[0];
                int y = point[1];

                if ((x - centerX) * (x - centerX)
                        + (y - centerY) * (y - centerY) <= radius * radius) {
                    count++;
                }
            }
            answer[j] = count;
        }

        return answer;
    }
}