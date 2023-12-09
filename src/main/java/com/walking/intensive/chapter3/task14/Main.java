package com.walking.intensive.chapter3.task14;

public class Main {
    public static void main(String[] args) {

        int[] answer = getCountOfPoints(new int[][]{{1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}}, new int[][]{{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}});

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
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

        if(!isArrayValid(points,2) || !isArrayValid(queries,3)) {
            return new int[0];
        }

        int[] answer = new int[queries.length];

        for (int j = 0; j < queries.length; j++) {

            for (int i = 0; i < points.length; i++) {

                double distance = Math.sqrt(Math.pow(points[i][0] - queries[j][0], 2) + Math.pow(points[i][1] - queries[j][1], 2));
                if (distance <= (double) queries[j][2]) {
                    answer[j]++;
                }
            }
        }

        return answer;
    }

    static boolean isArrayValid(int[][] array, int valAmount) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].length < valAmount) {
                return false;
            }
        }

        return true;
    }

}