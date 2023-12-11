package com.walking.intensive.chapter3.task14;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {
    }

    static int[] getCountOfPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int[] point : points) {
                if (Math.sqrt(Math.pow(point[0] - queries[i][0], 2) + Math.pow(point[1] - queries[i][1], 2))
                        <= queries[i][2]) {
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}