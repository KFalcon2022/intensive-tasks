package com.walking.intensive.chapter3.task14;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
        // Пример входных данных
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};

        int[] answer = getCountOfPoints(points, queries);

        // Вывод результатов
        for (int count : answer) {
            System.out.println(count);
        }
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
            for (int[] point : points) {
                if (isInsideCircle(point, queries[i])) {
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }

    static boolean isInsideCircle(int[] point, int[] query) {
        // query = [x_center, y_center, radius]
        int dx = point[0] - query[0];
        int dy = point[1] - query[1];
        int distanceSquared = dx * dx + dy * dy;
        int radiusSquared = query[2] * query[2];

        return distanceSquared <= radiusSquared;
    }
}