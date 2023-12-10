package com.walking.intensive.chapter3.task14;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {

    public static void main(String[] args) {
        int[][] arrayInputPoints = new int[][]{{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] arrayInputQueries = new int[][]{{2, 3, 1}, {4, 3, 1}, {1, 1, 2}};
        for (int a : getCountOfPoints(arrayInputPoints, arrayInputQueries)) {
            System.out.println(a);
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
        int[] arrayResult = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            for (int[] point : points) {
                double xCordinate = Math.pow((queries[i][0] - point[0]), 2);
                double yCordinate = Math.pow((queries[i][1] - point[1]), 2);
                if (queries[i][2] >= Math.sqrt(xCordinate + yCordinate)) {
                    arrayResult[i]++;
                }
            }
        }

        return arrayResult;
    }
}