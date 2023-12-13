package main.java.com.walking.intensive.chapter3.task14;

import static java.lang.Math.*;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-Circle.html">КРУГИ</a>
 */
public class Task14 {
    public static void main(String[] args) {

    }

    public static int[] getCountOfPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int j = 0; j < queries.length; j++) {
            int countPoints = 0;
            for (int[] point : points) {
                if ((pow((point[0] - queries[j][0]), 2) + (pow((point[1] - queries[j][1]), 2))) <= pow(queries[j][2], 2)) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}